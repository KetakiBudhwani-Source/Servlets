package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	String url="jdbc:mysql://localhost:3306/ketakidb";
	String sql = "select * from login where uname =? and pass=?";
	public boolean checkDetails(String username, String password) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection(url,"root","Test@123");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,username);
			st.setString(2, password);
			
			ResultSet rs =st.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return false;
		
	}

}
