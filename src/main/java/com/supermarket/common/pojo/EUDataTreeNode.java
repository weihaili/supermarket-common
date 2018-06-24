package com.supermarket.common.pojo;

import java.io.Serializable;

public class EUDataTreeNode implements Serializable {

	/**
	 * network transmission needs to be serialized
	 */
	private static final long serialVersionUID = -8052395294758608810L;
	
	private long id;
	
	private String text;
	
	private String state;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
