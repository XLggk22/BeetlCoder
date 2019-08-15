package com.base.test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.base.entity.ConfigInfo;
import com.base.entity.FileConfig;
import com.base.entity.TableConfig;

public class TestJaxb {
	public static void main(String[] args) {
		XMLStringToBean();
	}

	public static void builderXml() {
		FileConfig fileConfig = new FileConfig();
		fileConfig.setBuildFileName(".java");
		fileConfig.setBuildPackage("com.capfyun.model");
		fileConfig.setBuildTemplatePosition("template/model.html");
		List<FileConfig> fileConfigs = new ArrayList<FileConfig>();
		fileConfigs.add(fileConfig);

		TableConfig tableConfig = new TableConfig();
		tableConfig.setTableName("telement");
		tableConfig.setTablePK("sn");
		tableConfig.setPassColumnNames(null);
		tableConfig.setBuilderObjectName("Element");
		List<TableConfig> tableConfigs = new ArrayList<TableConfig>();
		tableConfigs.add(tableConfig);

		ConfigInfo configInfo = new ConfigInfo();
		configInfo.setIp("127.0.0.1");
		configInfo.setPort("3306");
		configInfo.setUserName("capfyun");
		configInfo.setPassWord("capfyun");
		configInfo.setDatabase("basics");

		configInfo.setFileConfigs(fileConfigs);
		configInfo.setTableConfigs(tableConfigs);

		System.out.println(configInfo.getFileConfigs().size());
		System.out.println(configInfo.getTableConfigs().size());
		try {
			JAXBContext context = JAXBContext.newInstance(new Class[] { ConfigInfo.class });
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(configInfo, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void XMLStringToBean() {
		String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><configInfo><database>basics</database><fileConfigs><buildFileName>.java</buildFileName><buildPackage>com.capfyun.model</buildPackage><buildTemplatePosition>template/model.html</buildTemplatePosition></fileConfigs><ip>127.0.0.1</ip><passWord>capfyun</passWord><port>3306</port><tableConfigs><builderObjectName>Element</builderObjectName><tableName>telement</tableName><tablePK>sn</tablePK></tableConfigs><userName>capfyun</userName></configInfo>";
		try {
			JAXBContext context = JAXBContext.newInstance(new Class[] { ConfigInfo.class });
			Unmarshaller unmarshaller = context.createUnmarshaller();
			ConfigInfo configInfo = (ConfigInfo) unmarshaller.unmarshal(new StringReader(xmlStr));

			System.out.println(configInfo.getFileConfigs().size());
			System.out.println(configInfo.getTableConfigs().size());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}