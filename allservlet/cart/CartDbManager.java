package com.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import javax.servlet.http.HttpSession;



import com.cart.GetsSetsCart;
import com.register_login.ConnectionManager;
//import com.register_login.GetsSets;


public class CartDbManager {
	
	public static int checkCart(String sql){
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn=c.connect();
		int j=0;
		if(conn!=null){
			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
			    while(rs.next()){
			        j = rs.getInt("count(*)");
			        System.out.println("count"+j);
			  }
			}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return j;
	    }

	public static int insertCart(GetsSetsCart set, String sql) {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn=c.connect();
		int i=0 ;
		if(conn!=null){
			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, set.getPid());
				psmt.setString(2, set.getUid());
				
				i = psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
		}
	
	public static int deleteCart(GetsSetsCart set) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		String sql = "DELETE FROM cart WHERE c_id=? AND u_id=?";
		PreparedStatement psrt = conn.prepareStatement(sql);
		psrt.setString(1,set.getCid());
		psrt.setString(2,set.getUid());
		int result = psrt.executeUpdate();
	return result;
	}
	
}
	


