package com.supermarket.common.pojo;


/**
 * @author Admin
 * item status
 */
public enum ItemStatus {
	
	//normal:正常    delete：删除   drop off:下架
	NORMAL("normal",(byte)1),
	
	DELETE("delete",(byte)3),
	
	DROPOFF("dropOff",(byte)2);
	
	
	/**
	 * according item status code get item status code
	 * @param statusCode:item status code
	 * @return item status description
	 */
	public static String getDesc(Byte statusCode) {
		for(ItemStatus status:ItemStatus.values()) {
			if(status.statusCode==statusCode) {
				return status.getStatusdesc();
			}
		}
		return null;
	}
	
	public static Byte getCode(String statusDesc) {
		for(ItemStatus status:ItemStatus.values()) {
			if(status.statusdesc==statusDesc) {
				return status.statusCode;
			}
		}
		return  null;
	}

	public String getStatusdesc() {
		return statusdesc;
	}
	public void setStatusdesc(String statusdesc) {
		this.statusdesc = statusdesc;
	}
	public Byte getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Byte statusCode) {
		this.statusCode = statusCode;
	}

	private String statusdesc;
	private Byte statusCode;
	private ItemStatus(String statusdesc, Byte statusCode) {
		this.statusdesc = statusdesc;
		this.statusCode = statusCode;
	}
}
