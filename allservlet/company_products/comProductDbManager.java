 	package com.company_products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import javax.servlet.http.HttpSession;

import com.register_login.ConnectionManager;
//import com.register_login.GetsSets;


public class comProductDbManager {

	public static int insertProduct(GetsSetsProduct set, String sql) {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn=c.connect();
		int i=0 ;
		if(conn!=null){
			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, set.getProducttitle());
				psmt.setString(2, set.getCategory());
				psmt.setString(3, set.getSubcategory());
				psmt.setString(4, set.getCompany());
				psmt.setString(5, set.getStartdate());
				psmt.setString(6, set.getEnddate());
				psmt.setString(7, set.getEmi());
				psmt.setString(8, set.getPrice());
				psmt.setString(9, set.getId());
				psmt.setString(10, set.getStatus());
				
				i = psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return i;
		}
	
	public static int insertNotification(GetsSetsProduct set, String sql1) {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn=c.connect();
		int i=0 ;
		if(conn!=null){
			try {
				PreparedStatement psmt = conn.prepareStatement(sql1);
				psmt.setString(1, set.getProducttitle());
				psmt.setString(2, set.getId());
				psmt.setString(3, set.getDate());
				
				i = psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return i;
		}
	
	public static int updateCar(GetsSetsProduct set) throws SQLException {
		// TODO Auto-generated method stub
		
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		
		String sql = "UPDATE products SET p_title=? , p_cat_id=? ,p_subcat_id=? , p_com_id=? ,p_start_date=?,p_end_date=?,p_emi=?,p_price=? WHERE p_id=?";
		
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(9, set.getPid());
		psmt.setString(1, set.getProducttitle());
		psmt.setString(2, set.getCategory());
		psmt.setString(3, set.getSubcategory());
		psmt.setString(4,set.getCompany());
		psmt.setString(5, set.getStartdate());
		psmt.setString(6,set.getEnddate());
		psmt.setString(7,set.getEmi());
		psmt.setString(8,set.getPrice());
			
		int result = psmt.executeUpdate();
		return result;
	}
	
	
	public static int deleteProduct(GetsSetsProduct set) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		String sql = "DELETE FROM products WHERE p_id=?";
		PreparedStatement psrt = conn.prepareStatement(sql);
		psrt.setString(1,set.getPid());
		int result = psrt.executeUpdate();
	return result;
	}
	}
	


