package com.wodog.it.commons;

import java.io.Serializable;

public class DataGrid implements Serializable {

	private int total;
	private Object rows;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	public DataGrid(int total, Object rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

}
