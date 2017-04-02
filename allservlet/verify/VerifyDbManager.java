package com.verify;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.company_products.GetsSetsProduct;
import com.verify.ConnectionManager;

public class VerifyDbManager {
	public static int deleteUser(VerifyGetsSets set) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		String sql = "DELETE FROM verify WHERE v_id=?";
		PreparedStatement psrt = conn.prepareStatement(sql);
		psrt.setString(1,set.getV_id());
		int result = psrt.executeUpdate();
	return result;
	}
	
	public static int updateStatus(VerifyGetsSets set) throws SQLException {
		// TODO Auto-generated method stub
		
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		
		String sql = "UPDATE verify SET v_status='a' WHERE v_id=?";
		
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, set.getVer_id());
			
		int result = psmt.executeUpdate();
		return result;
	}
	
	public static int insertNotification(VerifyGetsSets set, String sql1) {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn=c.connect();
		int i=0 ;
		if(conn!=null){
			try {
				PreparedStatement psmt = conn.prepareStatement(sql1);
				psmt.setString(1, set.getVer_id());
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
		
		

