package com.cart;

public class GetsSetsCart {
	public String pid;
	public String uid;
	public String cid;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "GetsSetsCart [productid=" + pid + ", userid=" + uid+ ",cid=" + cid + "]";
	}
	
	
	
	

}
