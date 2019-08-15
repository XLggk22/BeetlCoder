package com.base.test;

import java.beans.IntrospectionException;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.base.entity.ConfigInfo;
import com.base.entity.FileConfig;
import com.base.entity.TableConfig;
import com.base.util.BeanToMapUtil;
import com.base.util.FileUtil;
import com.base.util.XmlUtil;

public class TestXmlAndBean {
	public static void main(String[] args) {
		ConfigInfo configInfo = getDefaultConfigInfo();

		String xmlStr = testBeanToXml(configInfo);

		String savePath = FileUtil.getPath() + File.separator + "config" + File.separator + "config.xml";

		System.out.println("savePath:" + savePath);

		FileUtil.createToFile(savePath, xmlStr);

		ConfigInfo newConfigInfo = testXmlToBean(xmlStr);

		System.out.println(printConfigInfoToStr(newConfigInfo));
	}

	public static String testBeanToXml(ConfigInfo configInfo) {
		String xmlStr = "";
		try {
			Map convertMap = BeanToMapUtil.convertBean(configInfo);

			Document document = DocumentHelper.createDocument();
			Element nodesElement = document.addElement("configInfo");
			Element newNodesElement = XmlUtil.mapToElement(convertMap, nodesElement);
			xmlStr = XmlUtil.doc2String(newNodesElement.getDocument());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return xmlStr;
	}

	public static ConfigInfo testXmlToBean(String xmlStr) {
		ConfigInfo configInfo = new ConfigInfo();
		try {
			Document doc = DocumentHelper.parseText(xmlStr);

			Element root = doc.getRootElement();
			Map map = XmlUtil.elementToMap(root);

			configInfo = (ConfigInfo) BeanToMapUtil.convertMap(ConfigInfo.class, map);
			List fileConfigs = new ArrayList();
			for (int i = 0; i < configInfo.getFileConfigs().size(); ++i) {
				try {
					FileConfig fileConfig;
					if (configInfo.getFileConfigs().get(i) instanceof FileConfig)
						fileConfig = (FileConfig) configInfo.getFileConfigs().get(i);
					else {
						fileConfig = (FileConfig) BeanToMapUtil.convertMap(FileConfig.class,
								(Map) configInfo.getFileConfigs().get(i));
					}
					fileConfigs.add(fileConfig);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (IntrospectionException e) {
					e.printStackTrace();
				}
			}

			configInfo.setFileConfigs(fileConfigs);
			List tableConfigs = new ArrayList();
			for (int i = 0; i < configInfo.getTableConfigs().size(); ++i) {
				try {
					TableConfig tableConfig;
					if (configInfo.getTableConfigs().get(i) instanceof TableConfig)
						tableConfig = (TableConfig) configInfo.getTableConfigs().get(i);
					else {
						tableConfig = (TableConfig) BeanToMapUtil.convertMap(TableConfig.class,
								(Map) configInfo.getTableConfigs().get(i));
					}
					tableConfigs.add(tableConfig);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (IntrospectionException e) {
					e.printStackTrace();
				}
			}
			configInfo.setTableConfigs(tableConfigs);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return configInfo;
	}

	public static ConfigInfo getDefaultConfigInfo() {
		List fileConfigs = new ArrayList();
		List tableConfigs = new ArrayList();

		FileConfig fileConfig1 = new FileConfig();
		fileConfig1.setBuildSuffixName(".java");
		fileConfig1.setBuildFileName("");
		fileConfig1.setBuildPackage("com.capfyun.model");
		fileConfig1.setBuildTemplatePosition("config" + File.separator + "model.html");
		fileConfigs.add(fileConfig1);

		FileConfig fileConfig2 = new FileConfig();
		fileConfig2.setBuildSuffixName(".java");
		fileConfig2.setBuildFileName("Service");
		fileConfig2.setBuildPackage("com.capfyun.service");
		fileConfig2.setBuildTemplatePosition("config" + File.separator + "service.html");
		fileConfigs.add(fileConfig2);

		FileConfig fileConfig3 = new FileConfig();
		fileConfig3.setBuildSuffixName(".java");
		fileConfig3.setBuildFileName("ServiceImpl");
		fileConfig3.setBuildPackage("com.capfyun.service.impl");
		fileConfig3.setBuildTemplatePosition("config" + File.separator + "serviceimpl.html");
		fileConfigs.add(fileConfig3);

		TableConfig tableConfig1 = new TableConfig();
		tableConfig1.setTableName("telement");
		tableConfig1.setTablePK("sn");
		tableConfig1.setPassColumnNames(null);
		tableConfig1.setBuilderObjectName("Element");
		tableConfigs.add(tableConfig1);

		TableConfig tableConfig2 = new TableConfig();
		tableConfig2.setTableName("tdict");
		tableConfig2.setTablePK("sn");
		tableConfig2.setPassColumnNames(null);
		tableConfig2.setBuilderObjectName("Dict");
		tableConfigs.add(tableConfig2);

		ConfigInfo configInfo = new ConfigInfo();
		configInfo.setIp("127.0.0.1");
		configInfo.setPort("3306");
		configInfo.setUserName("root");
		configInfo.setPassWord("capfyun");
		configInfo.setDatabase("basics");

		configInfo.setFileConfigs(fileConfigs);
		configInfo.setTableConfigs(tableConfigs);

		return configInfo;
	}

	public static String printConfigInfoToStr(ConfigInfo configInfo) {
		StringBuffer sb = new StringBuffer();
		sb.append("数据库地址:" + configInfo.getIp());
		sb.append("\n数据库端口:" + configInfo.getPort());
		sb.append("\n数据库名:" + configInfo.getDatabase());
		sb.append("\n数据库用户名:" + configInfo.getUserName());
		sb.append("\n数据库密码:" + configInfo.getPassWord());
		sb.append("\n基础包名:" + configInfo.getBasePackage());

		sb.append("\n\n↓↓↓↓↓↓生成文件配置信息↓↓↓↓↓↓");
		for (int i = 0; i < configInfo.getFileConfigs().size(); ++i) {
			try {
				FileConfig fileConfig;
				if (configInfo.getFileConfigs().get(i) instanceof FileConfig)
					fileConfig = (FileConfig) configInfo.getFileConfigs().get(i);
				else {
					fileConfig = (FileConfig) BeanToMapUtil.convertMap(FileConfig.class,
							(Map) configInfo.getFileConfigs().get(i));
				}
				sb.append("\n↓↓↓文件" + (i + 1) + "↓↓↓");
				sb.append("\n生成文件名:" + replaceNullStr(fileConfig.getBuildFileName(), "无"));
				sb.append("\n生成包名:" + replaceNullStr(fileConfig.getBuildPackage(), "无"));
				sb.append("\n生成文件后缀名:" + replaceNullStr(fileConfig.getBuildSuffixName(), "无"));
				sb.append("\n生成文件模板位置:" + replaceNullStr(fileConfig.getBuildTemplatePosition(), "无"));
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (IntrospectionException e) {
				e.printStackTrace();
			}

		}

		sb.append("\n↑↑↑↑↑↑生成文件配置信息↑↑↑↑↑↑");
		sb.append("\n\n↓↓↓↓↓↓数据表配置信息↓↓↓↓↓↓");
		for (int i = 0; i < configInfo.getTableConfigs().size(); ++i) {
			try {
				TableConfig tableConfig;
				if (configInfo.getTableConfigs().get(i) instanceof TableConfig)
					tableConfig = (TableConfig) configInfo.getTableConfigs().get(i);
				else {
					tableConfig = (TableConfig) BeanToMapUtil.convertMap(TableConfig.class,
							(Map) configInfo.getTableConfigs().get(i));
				}
				sb.append("\n↓↓↓表" + (i + 1) + "↓↓↓");
				sb.append("\n表名:" + replaceNullStr(tableConfig.getTableName(), "无"));
				sb.append("\n表的主键:" + replaceNullStr(tableConfig.getTablePK(), "无"));
				sb.append("\n忽略字段:" + replaceNullStr(tableConfig.getPassColumnNames(), "无"));
				sb.append("\n生成对象名:" + replaceNullStr(tableConfig.getBuilderObjectName(), "无"));
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (IntrospectionException e) {
				e.printStackTrace();
			}
		}

		sb.append("\n↑↑↑↑↑↑数据表配置信息↑↑↑↑↑↑");
		sb.append("\n\n------代码生成器使用说明------");
		sb.append("\nhttp://note.youdao.com/noteshare?id=8f30b52db55a7880ab39ed518d47b782");
		return sb.toString();
	}

	public static String replaceNullStr(String value, String replaceStr) {
		String resultStr = "";
		if ((value == null) || ("".equals(value)) || ("null".equals(value)))
			resultStr = replaceStr;
		else {
			resultStr = value;
		}
		return resultStr;
	}
}