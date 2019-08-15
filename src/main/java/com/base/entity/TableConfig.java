package com.base.entity;

public class TableConfig {
	private String tableName;
	private String tablePK;
	private String passColumnNames;
	private String builderObjectName;

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTablePK() {
		return this.tablePK;
	}

	public void setTablePK(String tablePK) {
		this.tablePK = tablePK;
	}

	public String getPassColumnNames() {
		return this.passColumnNames;
	}

	public void setPassColumnNames(String passColumnNames) {
		this.passColumnNames = passColumnNames;
	}

	public String getBuilderObjectName() {
		return this.builderObjectName;
	}

	public void setBuilderObjectName(String builderObjectName) {
		this.builderObjectName = builderObjectName;
	}
}