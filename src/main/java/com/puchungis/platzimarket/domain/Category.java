package com.puchungis.platzimarket.domain;

public class Category {
	 
	private int categoryId;
	private String categoty;
	private boolean active;

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoty() {
		return this.categoty;
	}

	public void setCategoty(String categoty) {
		this.categoty = categoty;
	}

	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}


}
