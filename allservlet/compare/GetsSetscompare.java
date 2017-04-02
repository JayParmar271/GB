package com.compare;

public class GetsSetscompare {
	public String producttitle;
	public String category;
	public String subcategory;
	public String company;
	public String price;
	public String startdate;
	public String enddate;
	public String emi;
	public String pid;
	public String product1;
	public String product2;
	public String companydesc;
	
	public String getCompanydesc() {
		return companydesc;
	}

	public void setCompanydesc(String companydesc) {
		this.companydesc = companydesc;
	}

	public String getProduct1() {
		return product1;
	}

	public void setProduct1(String product1) {
		this.product1 = product1;
	}

	public String getProduct2() {
		return product2;
	}

	public void setProduct2(String product2) {
		this.product2 = product2;
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
		return "GetsSetscompare [producttitle=" + producttitle + ", category="
				+ category + ", subcategory=" + subcategory + ", company="
				+ company + ", price=" + price + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", emi=" + emi + ", pid=" + pid
				+ ", product1=" + product1 + ", companydesc=" + companydesc
				+ ", product2=" + product2 + "]";
	}
}
