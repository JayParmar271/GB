package com.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.register_login.ConnectionManager;
//import com.register_login.GetsSets;

public class productRetrieve {
	Connection c=null;
	 public productRetrieve(){
		 c=new ConnectionManager().connect();
	 }
	 
	 public GetsSetsProduct getonedata(String p_id) throws SQLException{
		 
		 GetsSetsProduct get = new GetsSetsProduct();
		 String sql = "SELECT * FROM products WHERE p_id='"+p_id+"';";
		 System.out.println(sql);
		
			ResultSet rs = c.createStatement().executeQuery(sql);
			if(rs.next()){
				
				get.setPid(rs.getString("p_id"));
				get.setProducttitle(rs.getString("p_title"));
				get.setCategory(rs.getString("p_cat_id"));
				get.setSubcategory(rs.getString("p_subcat_id"));
				get.setCompany(rs.getString("p_com_id"));
				get.setStartdate(rs.getString("p_start_date"));
				get.setEnddate(rs.getString("p_end_date"));
				get.setEmi(rs.getString("p_emi"));
				get.setPrice(rs.getString("p_price"));
				
			}
			return get;
	 }

	public ArrayList<GetsSetsProduct> getdata() throws SQLException{
		
		ArrayList<GetsSetsProduct> list = new ArrayList<GetsSetsProduct>();
		String sql = "SELECT * FROM products;";
		
		PreparedStatement psrt = c.prepareStatement(sql);
		ResultSet rs = psrt.executeQuery();
		while(rs.next()){
			GetsSetsProduct sets = new GetsSetsProduct();
			
			sets.setPid(rs.getString("p_id"));
			sets.setProducttitle(rs.getString("p_title"));
			sets.setCategory(rs.getString("p_cat_id"));
			sets.setSubcategory(rs.getString("p_subcat_id"));
			sets.setCompany(rs.getString("p_com_id"));
			sets.setStartdate(rs.getString("p_start_date"));
			sets.setEnddate(rs.getString("p_end_date"));
			sets.setEmi(rs.getString("p_emi"));
			sets.setPrice(rs.getString("p_price"));
			list.add(sets);
			
		}
		
		return list;
		
	}

}
