package com.subcategory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import javax.servlet.http.HttpSession;

import com.register_login.ConnectionManager;
//import com.register_login.GetsSets;


public class SubcategoryDbManager {

	public static int insertUser(GetsSetsSubcategory set, String sql) {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn=c.connect();
		int i=0 ;
		if(conn!=null){
			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, set.getSubCat_name());
				psmt.setString(2, set.getSubCat_desc());
		
				
				i = psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return i;
		}
	
	public static int updateSubcategory(GetsSetsSubcategory set) throws SQLException {
		// TODO Auto-generated method stub
		
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		
		String sql = "UPDATE subcategory SET sub_name=? , sub_description=?  WHERE sub_id=?";
		
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(3, set.getSubCat_id());
		psmt.setString(1, set.getSubCat_name());
		psmt.setString(2, set.getSubCat_desc());
			
		int result = psmt.executeUpdate();
		return result;
	}
	
	
	public static int deleteSubcategory(GetsSetsSubcategory set) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		String sql = "DELETE FROM subcategory WHERE sub_id=?";
		PreparedStatement psrt = conn.prepareStatement(sql);
		psrt.setString(1,set.getSubCat_id());
		int result = psrt.executeUpdate();
	return result;
	}
	}
	


