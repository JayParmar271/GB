package com.subcategory;

public class GetsSetsSubcategory 
{
	String subCat_id,subCat_name,subCat_desc;

	public String getSubCat_id() {
		return subCat_id;
	}

	public void setSubCat_id(String subCat_id) {
		this.subCat_id = subCat_id;
	}

	public String getSubCat_name() {
		return subCat_name;
	}

	public void setSubCat_name(String subCat_name) {
		this.subCat_name = subCat_name;
	}

	public String getSubCat_desc() {
		return subCat_desc;
	}

	public void setSubCat_desc(String subCat_desc) {
		this.subCat_desc = subCat_desc;
	}

	@Override
	public String toString() {
		return "GetsSetsSubcategory [subCat_id=" + subCat_id + ", subCat_name="
				+ subCat_name + ", subCat_desc=" + subCat_desc + "]";
	}
	
}