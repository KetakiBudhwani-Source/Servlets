package com.ketaki.web.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ketaki.web.Person;

public class PersonDao {

	String url="jdbc:mysql://localhost:3306/ketakidb";
	
	public Person getPerson(int id) {
		Person p =new Person();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection(url,"root","Test@123");
		    Statement st = con.createStatement();
			
			ResultSet rs =st.executeQuery("select * from person where id="+id);
			
			if(rs.next()) {
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setTech(rs.getString("tech"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return p;
	}
}
