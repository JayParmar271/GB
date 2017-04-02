package com.compare;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.products.GetsSetsProduct;
import com.register_login.ConnectionManager;
//import com.register_login.GetsSets;

public class comparetest {
	Connection c=null;
	 public comparetest(){
		 c=new ConnectionManager().connect();
	 }
	 
	 public GetsSetscompare getonedata(String p_id) throws SQLException{
		 
		 GetsSetscompare sets = new GetsSetscompare();
		 String sql = "SELECT * FROM products WHERE p_id='"+p_id+"';";
		 System.out.println(sql);
		
			ResultSet rs = c.createStatement().executeQuery(sql);
			if(rs.next()){
				
				
				//sets.setPid(rs.getString("p_id"));
				sets.setProducttitle(rs.getString("p_title"));
				sets.setCategory(rs.getString("p_cat_id"));
				sets.setSubcategory(rs.getString("p_subcat_id"));
				sets.setCompany(rs.getString("p_com_id"));
				sets.setStartdate(rs.getString("p_start_date"));
				sets.setEnddate(rs.getString("p_end_date"));
				sets.setEmi(rs.getString("p_emi"));
				sets.setPrice(rs.getString("p_price"));
				
				
			}
			return sets;
	 }

	public ArrayList<GetsSetscompare> getdata() throws SQLException{
		
		ArrayList<GetsSetscompare> list = new ArrayList<GetsSetscompare>();
		
		String sql ="SELECT * FROM products AS p INNER JOIN category AS c ON p.p_cat_id=c.cat_id INNER JOIN subcategory AS sc ON sc.sub_id=p.p_subcat_id INNER JOIN company AS com ON com.com_id=p.p_com_id ORDER BY p.p_id";
		
		
		PreparedStatement psrt = c.prepareStatement(sql);
		ResultSet rs = psrt.executeQuery();
		while(rs.next()){
			GetsSetscompare sets = new GetsSetscompare();
			
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
