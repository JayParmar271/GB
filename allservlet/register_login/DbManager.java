package com.register_login;
import java.sql.*;

public class DbManager {

	
	public static int registerUser(GetsSets set, String sql) {
		// TODO Auto-generated method stub
		
		ConnectionManager c = new ConnectionManager();
		Connection conn=c.connect();
		int i=0 ;
		if(conn!=null){
			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1,set.getFirstname());
				psmt.setString(2,set.getLastname());
				psmt.setString(3,set.getEmail());
				psmt.setString(4,set.getProfile());
				psmt.setString(5,set.getMobile());
				psmt.setString(6,set.getAge());
				psmt.setString(7,set.getGender());
				psmt.setString(8,set.getAddress());
				psmt.setString(9,set.getState());
				psmt.setString(10,set.getPassword());
				
				 i = psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return i;
		}
	
	public static int checkUser(GetsSets get) throws ClassNotFoundException, SQLException{
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
	String sql = "SELECT COUNT(*) FROM register_db WHERE email=? AND password=? ";
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

	public static int updateUser(GetsSets set, String sql) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		PreparedStatement psrt = conn.prepareStatement(sql);
			psrt.setString(10,set.getEmail());
			psrt.setString(1,set.getFirstname());
			psrt.setString(2,set.getLastname());
			psrt.setString(3,set.getProfile());
			psrt.setString(4,set.getMobile());
			psrt.setString(5,set.getAge());
			psrt.setString(6,set.getGender());
			psrt.setString(7,set.getAddress());
			psrt.setString(8,set.getState());
			psrt.setString(9,set.getPassword());
			
			int result = psrt.executeUpdate();
		return result;
	}

	public static int deleteUser(GetsSets set) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		String sql = "DELETE FROM register_db WHERE email=?";
		PreparedStatement psrt = conn.prepareStatement(sql);
		psrt.setString(1,set.getEmail());
		int result = psrt.executeUpdate();
	return result;
	}
	
	
}
		
		

