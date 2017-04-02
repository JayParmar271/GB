package com.products;

public class GetsSetsProduct {
	public String producttitle;
	public String category;
	public String subcategory;
	public String company;
	public String price;
	public String startdate;
	public String enddate;
	public String emi;
	public String pid;
	public String id;
	public String uname;
	public String status;
	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}


	public String getStartdate() {
		return startdate;
	}


	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}


	public String getEnddate() {
		return enddate;
	}


	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}


	public String getEmi() {
		return emi;
	}


	public void setEmi(String emi) {
		this.emi = emi;
	}


	public String getProducttitle() {
		return producttitle;
	}


	public void setProducttitle(String producttitle) {
		this.producttitle = producttitle;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getSubcategory() {
		return subcategory;
	}


	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GetsSetsProduct [producttitle=" + producttitle + ", category="
				+ category + ", subcategory=" + subcategory + ", company="
				+ company + ", price=" + price + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", emi=" + emi + ", pid=" + pid
				+ ", id=" + id + ", uname=" + uname + ", status=" + status
				+ "]";
	}

}
