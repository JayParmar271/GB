package com.compare;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.compare.GetsSetscompare;
import com.register_login.ConnectionManager;
//import com.register_login.GetsSets;

public class compareRetrieve {
	Connection c=null;
	 public compareRetrieve(){
		 c=new ConnectionManager().connect();
	 }
	 
 public GetsSetscompare getonedata(String p_id) throws SQLException{
		 
		 GetsSetscompare get = new GetsSetscompare();
		 String sql = "SELECT * FROM products AS p INNER JOIN category AS c ON p.p_cat_id=c.cat_id INNER JOIN subcategory AS sc ON sc.sub_id=p.p_subcat_id INNER JOIN company AS com ON com.com_id=p.p_com_id WHERE p.p_id='"+p_id+"';";
		 System.out.println(sql);
		
			ResultSet rs = c.createStatement().executeQuery(sql);
			if(rs.next()){
				get.setPid(rs.getString("p_id"));
				get.setProducttitle(rs.getString("p_title"));
				get.setCategory(rs.getString("cat_name"));
				get.setSubcategory(rs.getString("sub_name"));
				get.setCompany(rs.getString("com_name"));
				get.setCompanydesc(rs.getString("com_description"));
				get.setStartdate(rs.getString("p_start_date"));
				get.setEnddate(rs.getString("p_end_date"));
				get.setEmi(rs.getString("p_emi"));
				get.setPrice(rs.getString("p_price"));
			}
			return get;
 		}
}
