package com.managesellerproducts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import javax.servlet.http.HttpSession;


import com.company_products.GetsSetsProduct;
import com.register_login.ConnectionManager;
//import com.register_login.GetsSets;


public class SellerProductDbManager {

	public static int updateStatus(GetsSetsProduct set) throws SQLException {
		// TODO Auto-generated method stub
		
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		
		String sql = "UPDATE products SET status='a' WHERE p_id=?";
		
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, set.getPid());
			
		int result = psmt.executeUpdate();
		return result;
	}
	
	public static int insertNotification(GetsSetsProduct set, String sql1) {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn=c.connect();
		int i=0 ;
		if(conn!=null){
			try {
				PreparedStatement psmt = conn.prepareStatement(sql1);
				psmt.setString(1, set.getPid());
				psmt.setString(2, set.getDate());
				
				i = psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return i;
		}
}
	


