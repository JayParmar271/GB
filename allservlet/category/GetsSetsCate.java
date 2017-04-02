package com.category;

public class GetsSetsCate {
	
	public String catName;
	public String cat_id;

	public String getCat_id() {
		return cat_id;
	}

	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "GetsSetsCate [catName=" + catName + ", cat_id=" + cat_id + "]";
	}
	

}
