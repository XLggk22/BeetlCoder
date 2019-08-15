package com.base.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.beetl.core.BeetlKit;

import com.base.entity.ConfigInfo;
import com.base.entity.FileConfig;
import com.base.entity.TableColumn;
import com.base.entity.TableConfig;
import com.base.test.TestXmlAndBean;
import com.base.util.FileUtil;
import com.base.util.StringUtil;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.druid.DruidPlugin;

public class GenerateBase {
	private static Logger logger = Logger.getLogger(GenerateBase.class);

	public DruidPlugin druidPluginIS = null;
	public DruidPlugin druidPluginDB = null;

	private String gennerateFolder = "gennerate";

	public void main(String[] args) throws IOException {
		ConfigInfo configInfo = TestXmlAndBean.getDefaultConfigInfo();
		configInit(configInfo);
	}

	public String configInit(ConfigInfo configInfo) {
		String result = "";
		String ip = configInfo.getIp();
		String port = configInfo.getPort();
		String database = configInfo.getDatabase();
		String username = configInfo.getUserName();
		String password = configInfo.getPassWord();

		logger.info("准备查询 information_schema 库");
		String schemaJdbcStr = "jdbc:mysql://" + ip + ":" + port + "/information_schema?characterEncoding=UTF-8"
				+ "&autoReconnect=true&failOverReadOnly=false&zeroDateTimeBehavior=convertToNull";
		logger.info("schemaJdbcStr:" + schemaJdbcStr);
		this.druidPluginIS = new DruidPlugin(schemaJdbcStr, username, password, "com.mysql.jdbc.Driver");
		this.druidPluginIS.start();

		ActiveRecordPlugin arpIS = new ActiveRecordPlugin("information_schema", this.druidPluginIS);
		arpIS.setDevMode(false);
		arpIS.setShowSql(false);
		arpIS.setContainerFactory(new CaseInsensitiveContainerFactory(true));
		arpIS.setDialect(new MysqlDialect());
		arpIS.start();

		logger.info(" 准备查询 " + database + " 库");
		String dbJdbcStr = "jdbc:mysql://" + ip + ":" + port + "/" + database + "?characterEncoding=UTF-8"
				+ "&autoReconnect=true&failOverReadOnly=false&zeroDateTimeBehavior=convertToNull";
		logger.info("dbJdbcStr:" + dbJdbcStr);
		this.druidPluginDB = new DruidPlugin(dbJdbcStr, username, password, "com.mysql.jdbc.Driver");
		this.druidPluginDB.start();

		List tableConfigList = configInfo.getTableConfigs();

		List FileConfigList = configInfo.getFileConfigs();

		for (int i = 0; i < tableConfigList.size(); ++i) {
			TableConfig tableConfig = (TableConfig) tableConfigList.get(i);

			generateFileUseConfig(tableConfig, database, FileConfigList, configInfo.getBasePackage());
		}

		result = result + "已经在如下路径生成你所需要的代码：\n";
		result = result + FileUtil.getPath() + File.separator + this.gennerateFolder;
		return result;
	}

	private void generateFileUseConfig(TableConfig tableConfig, String database, List<FileConfig> fileConfigList,
			String basePackage) {
		Map<String, Object> paraMap = new HashMap();

		String tableName = tableConfig.getTableName();

		String pkName = tableConfig.getTablePK();

		String className = tableConfig.getBuilderObjectName();

		String passColumnNames = tableConfig.getPassColumnNames();

		String classNameLowerCase = StringUtil.toLowerCaseFirstOne(className);

		List colunmList = getColunm(tableName, database, passColumnNames);

		int fileConfigSize = fileConfigList.size();

		String generateFilePath = FileUtil.getProjectRootPath() + File.separator + this.gennerateFolder;

		String allColunm = "";

		int colunmSize = colunmList.size();

		for (int j = 0; j < colunmSize; ++j) {
			if (j == colunmSize - 1)
				allColunm = allColunm + ((TableColumn) colunmList.get(j)).getColumnName();
			else {
				allColunm = allColunm + ((TableColumn) colunmList.get(j)).getColumnName() + ", ";
			}
		}

		for (int i = 0; i < fileConfigSize; ++i) {
			FileConfig fileConfig = (FileConfig) fileConfigList.get(i);

			String buildPackages = fileConfig.getBuildPackage();

			String buildFileName = fileConfig.getBuildFileName();

			String buildTemplate = fileConfig.getBuildTemplatePosition();

			String buildSuffixName = fileConfig.getBuildSuffixName();

			String custFileName = "";

			if (buildFileName.indexOf("${className}") > -1)
				custFileName = buildFileName.replaceAll("\\$\\{className\\}", className);
			else {
				custFileName = className + buildFileName;
			}
			paraMap.put("classNameLowerCase", classNameLowerCase);
			paraMap.put("allColunm", allColunm);
			paraMap.put("custFileName", custFileName);
			paraMap.put("package", buildPackages);
			paraMap.put("className", className);
			paraMap.put("tableName", tableName);
			paraMap.put("pkName", pkName);
			paraMap.put("colunmList", colunmList);
			paraMap.put("dataTypes", getJataTypeList(tableName));
			paraMap.put("tableNameCamel", StringUtil.underlineToCamel(tableName));
			paraMap.put("basePackage", basePackage);

			logger.info("paraMap:" + paraMap);
			String filePath = generateFilePath + File.separator + buildPackages.replace(".", File.separator)
					+ File.separator + custFileName + buildSuffixName;

			createFileByTemplete(FileUtil.getPath() + File.separator + buildTemplate, paraMap, filePath);
		}
	}

	private List<TableColumn> getColunm(String tableName, String database, String passColumnNames) {
		List list = new ArrayList();

		String tableDesc = Db.use("information_schema")
				.findFirst("select * from tables where table_schema = ? and table_name = ?",
						new Object[] { database, tableName })
				.getStr("table_comment");
		List<Record> listColumn = Db.use("information_schema").find(
				"select * from columns where table_schema = ? and table_name = ?",
				new Object[] { database, tableName });

		logger.info("listColumn:" + listColumn);
		Map columnJavaTypeMap = getJavaType(tableName);

		String[] passColumnName = null;

		if ((passColumnNames != null) && (!("".equals(passColumnNames))) && (!("null".equals(passColumnNames)))) {
			if (passColumnNames.indexOf(",") > -1)
				passColumnName = passColumnNames.split(",");
			else {
				passColumnName[0] = passColumnNames;
			}
		}
		for (Record record : listColumn) {
			String columnName = record.getStr("column_name");
			String columnType = record.getStr("column_type");
			String dataType = record.getStr("data_type");
			String characterMaximumLength = String.valueOf(record.getBigInteger("CHARACTER_MAXIMUM_LENGTH"));
			String column_comment = record.getStr("COLUMN_COMMENT");

			boolean continuStatus = false;

			if ((passColumnName != null) && (passColumnName.length > 1)) {
				for (int i = 0; i < passColumnName.length; ++i) {
					String passColumn = passColumnName[i];

					if (passColumn.equals(columnName)) {
						continuStatus = true;
						break;
					}
				}
			}

			if (continuStatus) {
				continue;
			}

			TableColumn table = new TableColumn();
			table.setTableName(tableName);
			table.setTableDesc(tableDesc);

			table.setColumnName(columnName.toUpperCase());
			table.setColumnNameUpperCase(StringUtil.toUpperCaseFirstOne(columnName));
			table.setColumnNameCamel(StringUtil.underlineToCamel(columnName));
			table.setColumnNameCamelFirstUpper(StringUtil.toUpperCaseFirstOne(StringUtil.underlineToCamel(columnName)));
			table.setColumnType(columnType);
			table.setColumnLength(characterMaximumLength);
			table.setColumnDesc(column_comment);
			table.setDataType(dataType);
			table.setColumnClassName((String) columnJavaTypeMap.get(columnName.toLowerCase()));

			list.add(table);
		}

		return list;
	}

	private Set<String> getJataTypeList(String tableName) {
		Map map = getJavaType(tableName);
		Set<String> keys = map.keySet();
		Set typeSet = new HashSet();
		for (String key : keys) {
			String type = (String) map.get(key);
			if (type.equals("byte[]"))
				continue;
			if (type.startsWith("java.lang.")) {
				continue;
			}
			typeSet.add((String) map.get(key));
		}
		return typeSet;
	}

	private Map<String, String> getJavaType(String tableName) {
		Map columnJavaTypeMap = new HashMap();
		try {
			DataSource dataSource = this.druidPluginDB.getDataSource();
			Connection conn = dataSource.getConnection();

			Statement stmt = conn.createStatement();
			String sql = "select * from " + tableName + " where 1 != 1 ";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();

			int columns = rsmd.getColumnCount();
			for (int i = 1; i <= columns; ++i) {
				String columnName = rsmd.getColumnName(i).toLowerCase();
				String columnClassName = rsmd.getColumnClassName(i);
				if (columnClassName.equals("[B")) {
					columnClassName = "byte[]";
				}
				columnJavaTypeMap.put(columnName, columnClassName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return columnJavaTypeMap;
	}

	private void createFileByTemplete(String templateFileName, Map<String, Object> paraMap, String filePath) {
		File templateFile = new File(templateFileName);
		if (templateFile.exists()) {
			try {
				StringBuffer context = new StringBuffer();
				String encoding = "UTF-8";
				InputStreamReader read = new InputStreamReader(new FileInputStream(templateFile), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					context.append(lineTxt + "\n");
				}
				read.close();
				String template = context.toString();
				String javaSrc = BeetlKit.render(template, paraMap);

				File file = new File(filePath);

				File path = new File(file.getParent());
				if (!(path.exists())) {
					path.mkdirs();
				}
				BufferedWriter output = new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream(file), encoding));

				output.write(javaSrc);
				output.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			logger.info("请检查模板文件(" + templateFileName + ")是否存在");
	}
}