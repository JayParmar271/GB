package com.register_login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class weltest {
	Connection c=null;
	 public weltest(){
		 c=new ConnectionManager().connect();
	 }
	 
	 public GetsSets getonedata(String email) throws SQLException{
		 
		 GetsSets get = new GetsSets();
		 String sql = "SELECT * FROM register_db WHERE email='"+email+"';";
		 System.out.println(sql);
		 //PreparedStatement psrt = c.prepareStatement(sql);
			ResultSet rs = c.createStatement().executeQuery(sql);
			if(rs.next()){
				
				get.setFirstname(rs.getString("firstname"));
				get.setLastname(rs.getString("lastname"));
				get.setProfile(rs.getString("profile"));
				get.setMobile(rs.getString("mobile"));
				get.setEmail(rs.getString("email"));
				get.setAge(rs.getString("age"));
				get.setGender(rs.getString("gender"));
				get.setAddress(rs.getString("address"));
				get.setState(rs.getString("state"));
				get.setPassword(rs.getString("password"));
					
				
			}
			return get;
	 }

	public ArrayList<GetsSets> getdata() throws SQLException{
		
		ArrayList<GetsSets> list = new ArrayList<GetsSets>();
		String sql = "SELECT * FROM register_db;";
		
		PreparedStatement psrt = c.prepareStatement(sql);
		ResultSet rs = psrt.executeQuery();
		while(rs.next()){
			GetsSets sets = new GetsSets();
			
			sets.setFirstname(rs.getString("firstname"));
			sets.setLastname(rs.getString("lastname"));
			sets.setEmail(rs.getString("email"));
			sets.setProfile(rs.getString("profile"));
			sets.setMobile(rs.getString("mobile"));
			sets.setAge(rs.getString("age"));
			sets.setGender(rs.getString("gender"));
			sets.setAddress(rs.getString("address"));
			sets.setState(rs.getString("state"));
			sets.setPassword(rs.getString("password"));
			list.add(sets);
			
		}
		
		
		
		return list;
		
	}
	
}
