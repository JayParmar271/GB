package com.subcategory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.register_login.ConnectionManager;
//import com.register_login.GetsSets;

public class SubcategoryRetrieve {
	Connection c=null;
	 public SubcategoryRetrieve(){
		 c=new ConnectionManager().connect();
	 }
	 
	 public GetsSetsSubcategory getonedata(String subCat_id) throws SQLException{
		 
		 GetsSetsSubcategory get = new GetsSetsSubcategory();
		 String sql = "SELECT * FROM subcategory WHERE sub_id='"+subCat_id+"';";
		 System.out.println(sql);
		
			ResultSet rs = c.createStatement().executeQuery(sql);
			if(rs.next()){
				
				get.setSubCat_id(rs.getString("sub_id"));
				get.setSubCat_name(rs.getString("sub_name"));
				get.setSubCat_desc(rs.getString("sub_description"));
			
				
			}
			return get;
	 }

	public ArrayList<GetsSetsSubcategory> getdata() throws SQLException{
		
		ArrayList<GetsSetsSubcategory> list = new ArrayList<GetsSetsSubcategory>();
		String sql = "SELECT * FROM subcategory;";
		
		PreparedStatement psrt = c.prepareStatement(sql);
		ResultSet rs = psrt.executeQuery();
		while(rs.next()){
			GetsSetsSubcategory sets = new GetsSetsSubcategory();
			
			sets.setSubCat_id(rs.getString("sub_id"));
			sets.setSubCat_name(rs.getString("sub_name"));
			sets.setSubCat_desc(rs.getString("sub_description"));
			list.add(sets);
			
		}
		
		return list;
		
	}

}
