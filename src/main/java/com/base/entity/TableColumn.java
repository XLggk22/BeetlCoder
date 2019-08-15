package com.base.entity;

public class TableColumn {
	private String tableName;
	private String tableDesc;
	private String columnName;
	private String columnNameUpperCase;
	private String columnNameCamel;
	private String columnNameCamelFirstUpper;
	private String columnType;
	private String columnDesc;
	private String columnLength;
	private String columnClassName;
	private String dataType;

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableDesc() {
		return this.tableDesc;
	}

	public void setTableDesc(String tableDesc) {
		this.tableDesc = tableDesc;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnNameUpperCase() {
		return this.columnNameUpperCase;
	}

	public void setColumnNameUpperCase(String columnNameUpperCase) {
		this.columnNameUpperCase = columnNameUpperCase;
	}

	public String getColumnType() {
		return this.columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getColumnDesc() {
		return this.columnDesc;
	}

	public void setColumnDesc(String columnDesc) {
		this.columnDesc = columnDesc;
	}

	public String getColumnLength() {
		return this.columnLength;
	}

	public void setColumnLength(String columnLength) {
		this.columnLength = columnLength;
	}

	public String getColumnClassName() {
		return this.columnClassName;
	}

	public void setColumnClassName(String columnClassName) {
		columnClassName = columnClassName.substring(columnClassName.lastIndexOf(".") + 1);
		this.columnClassName = columnClassName;
	}

	public String getColumnNameCamel() {
		return this.columnNameCamel;
	}

	public void setColumnNameCamel(String columnNameCamel) {
		this.columnNameCamel = columnNameCamel;
	}

	public String getColumnNameCamelFirstUpper() {
		return this.columnNameCamelFirstUpper;
	}

	public void setColumnNameCamelFirstUpper(String columnNameCamelFirstUpper) {
		this.columnNameCamelFirstUpper = columnNameCamelFirstUpper;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
}