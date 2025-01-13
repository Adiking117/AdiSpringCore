package com.adi;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;


public class Read {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Aditya@2003");
	
	PreparedStatement ps = con.prepareStatement("select * from register");
		
	ResultSet rs= ps.executeQuery();
	
	while(rs.next()) {
		System.out.println("Name "+rs.getString("name")+" and Email is "+rs.getString("email"));
	}
	
	con.close();
	
}
}
