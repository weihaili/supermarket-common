package com.supermarket.common.pojo;

import java.io.Serializable;
import java.util.List;

public class EUDataGridResult implements Serializable{
	
	/**
	 * network transmission needs to be serialized
	 */
	private static final long serialVersionUID = -4965342291599196782L;

	private long total;
	
	private List<?> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
