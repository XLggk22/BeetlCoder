package com.base.entity;

public class FileConfig {
	private String buildPackage;
	private String buildFileName;
	private String buildTemplatePosition;
	private String buildSuffixName;

	public String getBuildPackage() {
		return this.buildPackage;
	}

	public void setBuildPackage(String buildPackage) {
		this.buildPackage = buildPackage;
	}

	public String getBuildFileName() {
		return this.buildFileName;
	}

	public void setBuildFileName(String buildFileName) {
		this.buildFileName = buildFileName;
	}

	public String getBuildTemplatePosition() {
		return this.buildTemplatePosition;
	}

	public void setBuildTemplatePosition(String buildTemplatePosition) {
		this.buildTemplatePosition = buildTemplatePosition;
	}

	public String getBuildSuffixName() {
		return this.buildSuffixName;
	}

	public void setBuildSuffixName(String buildSuffixName) {
		this.buildSuffixName = buildSuffixName;
	}
}