package com.category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.register_login.ConnectionManager;

public class cateDbManager {

	public static int insertUser(GetsSetsCate set, String sql) {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn=c.connect();
		int i=0 ;
		if(conn!=null){
			try {
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1,set.getCatName());
				
				i = psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return i;
		}

	public static int deleteCate(GetsSetsCate set) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn = c.connect();
		String sql = "DELETE FROM category WHERE cat_id=?";
		PreparedStatement psrt = conn.prepareStatement(sql);
		psrt.setString(1,set.getCat_id());
		int result = psrt.executeUpdate();
	return result;
	}

	public static int updateCate(GetsSetsCate set, String sql) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionManager c = new ConnectionManager();
		Connection conn=c.connect();
		
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(2, set.getCat_id());
		psmt.setString(1,set.getCatName());
		int result = psmt.executeUpdate();
		return result;
	}
	}


