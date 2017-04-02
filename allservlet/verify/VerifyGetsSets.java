package com.verify;

import java.io.InputStream;
import java.sql.Blob;
import java.util.Arrays;

public class VerifyGetsSets{
	
	public String v_id;
	public String v_name;
	public String v_dob;
	public Blob v_photo;
	public String v_photo_id_name;
	public Blob v_photo_id;
	public String u_id;
	public String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String ver_id;
	
	
	public String getVer_id() {
		return ver_id;
	}
	public void setVer_id(String ver_id) {
		this.ver_id = ver_id;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getV_id() {
		return v_id;
	}
	public void setV_id(String v_id) {
		this.v_id = v_id;
	}
	public String getV_name() {
		return v_name;
	}
	public void setV_name(String v_name) {
		this.v_name = v_name;
	}
	public String getV_dob() {
		return v_dob;
	}
	public void setV_dob(String v_dob) {
		this.v_dob = v_dob;
	}
	public Blob getV_photo() {
		return v_photo;
	}
	public void setV_photo(Blob v_photo) {
		this.v_photo = v_photo;
	}
	public String getV_photo_id_name() {
		return v_photo_id_name;
	}
	public void setV_photo_id_name(String v_photo_id_name) {
		this.v_photo_id_name = v_photo_id_name;
	}
	public Blob getV_photo_id() {
		return v_photo_id;
	}
	public void setV_photo_id(Blob v_photo_id) {
		this.v_photo_id = v_photo_id;
	}
	public String getV_photo_add_name() {
		return v_photo_add_name;
	}
	public void setV_photo_add_name(String v_photo_add_name) {
		this.v_photo_add_name = v_photo_add_name;
	}
	public Blob getV_photo_add() {
		return v_photo_add;
	}
	public void setV_photo_add(Blob v_photo_add) {
		this.v_photo_add = v_photo_add;
	}
	public String getV_add() {
		return v_add;
	}
	public void setV_add(String v_add) {
		this.v_add = v_add;
	}
	public String v_photo_add_name;
	public Blob v_photo_add;
	public String v_add;
	public InputStream inputStream1;
	public InputStream inputStream2;
	public InputStream inputStream3;
	public byte[] fileData1;
	public void setV_photo(InputStream inputStream1) {
		// TODO Auto-generated method stub
		this.inputStream1 = inputStream1;
		
	}
	public void setV_photo_id(InputStream inputStream2) {
		// TODO Auto-generated method stub
		this.inputStream2 = inputStream2;
		
	}
	public void setV_photo_add(InputStream inputStream3) {
		// TODO Auto-generated method stub
		this.inputStream3 = inputStream3;
		
	}
	public void setV_photo(byte[] fileData1) {
		// TODO Auto-generated method stub
		this.fileData1 = fileData1;
		
	}
	@Override
	public String toString() {
		return "VerifyGetsSets [v_id=" + v_id + ", v_name=" + v_name
				+ ", v_dob=" + v_dob + ", v_photo=" + v_photo
				+ ", v_photo_id_name=" + v_photo_id_name + ", v_photo_id="
				+ v_photo_id + ", u_id=" + u_id + ", date=" + date
				+ ", ver_id=" + ver_id + ", v_photo_add_name="
				+ v_photo_add_name + ", v_photo_add=" + v_photo_add
				+ ", v_add=" + v_add + ", inputStream1=" + inputStream1
				+ ", inputStream2=" + inputStream2 + ", inputStream3="
				+ inputStream3 + ", fileData1=" + Arrays.toString(fileData1)
				+ "]";
	}

	

	
}