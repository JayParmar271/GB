package com.managesellerproducts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.register_login.ConnectionManager;
//import com.register_login.GetsSets;

public class sellerproduct {
	Connection c=null;
	 public sellerproduct(){
		 c=new ConnectionManager().connect();
	 }
	 
	public ArrayList<GetsSetsProduct> getdata() throws SQLException{
		
		ArrayList<GetsSetsProduct> list = new ArrayList<GetsSetsProduct>();
		String sql = "SELECT * FROM products WHERE status='d';";
		
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
