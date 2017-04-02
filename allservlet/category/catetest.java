package com.category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import com.car_loan.GetsSetsCar;
import com.register_login.ConnectionManager;

public class catetest {
	Connection c=null;
	 public catetest(){
		 c=new ConnectionManager().connect();
	 }
	 
	 public GetsSetsCate getonedata(String cat_id) throws SQLException{
		 
		 GetsSetsCate get = new GetsSetsCate();
		 String sql = "SELECT * FROM category WHERE cat_id='"+cat_id+"';";
		 System.out.println(sql);
		
			ResultSet rs = c.createStatement().executeQuery(sql);
			if(rs.next()){
				
				
				//get.setCarname(rs.getString("car_name"));
				get.setCatName(rs.getString("cat_name"));
				
				
			}
			return get;
	 }

	public ArrayList<GetsSetsCate> getdata() throws SQLException{
		
		ArrayList<GetsSetsCate> list = new ArrayList<GetsSetsCate>();
		String sql = "SELECT * FROM category;";
		
		PreparedStatement psrt = c.prepareStatement(sql);
		ResultSet rs = psrt.executeQuery();
		while(rs.next()){
			GetsSetsCate sets = new GetsSetsCate();
			
			//sets.setCar_id(rs.getString("car_id"));
			sets.setCat_id(rs.getString("cat_id"));
			sets.setCatName(rs.getString("cat_name"));
			
			list.add(sets);
			
		}
		
		
		
		return list;
		
	}

}
