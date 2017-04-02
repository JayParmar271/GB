package com.verify;

//import java.sql.Blob;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Verifyweltest {
	Connection c=null;
	 public Verifyweltest(){
		 c=new ConnectionManager().connect();
	 }
	 
	 public VerifyGetsSets getonedata(String v_id) throws SQLException{
		 
		 VerifyGetsSets get = new VerifyGetsSets();
		 String sql = "SELECT * FROM verify WHERE v_id='"+v_id+"';";
		 System.out.println(sql);
		 //PreparedStatement psrt = c.prepareStatement(sql);
			ResultSet rs = c.createStatement().executeQuery(sql);
			if(rs.next()){
				
				get.setV_name(rs.getString("v_name"));
				get.setV_dob(rs.getString("v_dob"));
				get.setV_photo(rs.getBlob("v_photo"));
				get.setV_photo_id_name(rs.getString("v_photo_id_name"));
				get.setV_photo_id(rs.getBlob("v_photo_id"));
				get.setV_photo_add_name(rs.getString("v_photo_add_name"));
				get.setV_photo_add(rs.getBlob("v_photo_add"));
				get.setV_add(rs.getString("v_add"));
				
					
				
			}
			return get;
	 }
	 Blob photo = null;
     byte[ ] fileData1 = null ;
	public ArrayList<VerifyGetsSets> getdata() throws SQLException{
		 
		ArrayList<VerifyGetsSets> list = new ArrayList<VerifyGetsSets>();
		String sql = "SELECT * FROM verify WHERE v_status='d';";
		
		
		PreparedStatement psrt = c.prepareStatement(sql);
		ResultSet rs = psrt.executeQuery();
		while(rs.next()){
			VerifyGetsSets sets = new VerifyGetsSets();
			
			
			
			sets.setV_id(rs.getString("v_id"));
			sets.setV_name(rs.getString("v_name"));
			sets.setV_dob(rs.getString("v_dob"));
			//sets.setV_photo(rs.getBlob("v_photo"));
			photo = rs.getBlob("v_photo");
			fileData1 = photo.getBytes(1,(int)photo.length());
			sets.setV_photo(fileData1);
			sets.setV_photo_id_name(rs.getString("v_photo_id_name"));
			sets.setV_photo_id(rs.getBlob("v_photo_id"));
			sets.setV_photo_add_name(rs.getString("v_photo_add_name"));
			sets.setV_photo_add(rs.getBlob("v_photo_add"));
			sets.setV_add(rs.getString("v_add"));
			
			list.add(sets);
			
		}
		
		
		
		return list;
		
	}
	
}
