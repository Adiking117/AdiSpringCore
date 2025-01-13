package com.adi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class Update {
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Email For Updateion");
	String email = sc.nextLine();
	
	System.out.println("Enter City For Updateion");
	String city = sc.nextLine();
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Aditya@2003");
	
	PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
	
	ps.setString(1,city);
	ps.setString(2,email);
	
	int i = ps.executeUpdate();
	
	if(i>0) {
		System.out.println("Success");
	}
	else{
		System.out.println("Failure");
	}
	
	con.close();
}
}
