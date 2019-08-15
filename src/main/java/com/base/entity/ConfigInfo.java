package com.base.entity;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigInfo {
	private String ip;
	private String port;
	private String userName;
	private String passWord;
	private String database;
	private String basePackage;
	private List<FileConfig> fileConfigs;
	private List<TableConfig> tableConfigs;

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getDatabase() {
		return this.database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public List<FileConfig> getFileConfigs() {
		return this.fileConfigs;
	}

	public void setFileConfigs(List<FileConfig> fileConfigs) {
		this.fileConfigs = fileConfigs;
	}

	public List<TableConfig> getTableConfigs() {
		return this.tableConfigs;
	}

	public void setTableConfigs(List<TableConfig> tableConfigs) {
		this.tableConfigs = tableConfigs;
	}

	public String getBasePackage() {
		return this.basePackage;
	}

	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}
}