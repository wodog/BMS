package com.wodog.it.commons;

import java.io.Serializable;

public class CustomObj implements Serializable {

	private boolean success = true;
	private String message;
	private Object obj;

	public CustomObj(boolean success, String message, Object obj) {
		this.success = success;
		this.message = message;
		this.obj = obj;
	}

	public CustomObj(Object obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
