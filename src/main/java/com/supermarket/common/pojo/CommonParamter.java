package com.supermarket.common.pojo;

public enum CommonParamter {
	
	ONE("1",1,true),
	
	ZERO("0",0,false),
	
	TWO("delete",2,false);
	
	private String codeDesc;
	
	private int code;
	
	private Boolean codeBoolean;

	private CommonParamter(String codeDesc, int code, Boolean codeBoolean) {
		this.codeDesc = codeDesc;
		this.code = code;
		this.codeBoolean = codeBoolean;
	}

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Boolean getCodeBoolean() {
		return codeBoolean;
	}

	public void setCodeBoolean(Boolean codeBoolean) {
		this.codeBoolean = codeBoolean;
	}


}
