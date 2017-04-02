package com.admin_login;
import java.sql.*;

public class DbManager {

	public static int checkUser(GetsSets get) throws ClassNotFoundException, SQLException{
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
	String sql = "SELECT COUNT(*) FROM admin WHERE username=? AND password=?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,get.getEmail());
	pstmt.setString(2,get.getPassword());
	ResultSet rs = pstmt.executeQuery();
	
	int count = 0;
	while(rs.next()){
		count = rs.getInt(1);
	}
	return count;
}
	
	public static ResultSet loginUser(GetsSets m, String sql) {
		ResultSet rs=null;
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
			
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}	
}
		
		

