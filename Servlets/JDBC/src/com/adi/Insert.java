package com.adi;

import java.sql.*;
import java.util.*;

public class Insert {
	public static void main(String[] args) {
//		String name = "Aditya";
//		String email = "Adi@gmail.com";
//		String password = "Adi123";
//		String gender = "Male";
//		String city = "Juinagar";

		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Aditya@2003");
			
			PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
			
			// ? -> positional parameter
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, gender);
			ps.setString(5, city);
			
			int i = ps.executeUpdate();
			
			if(i>0) {
				System.out.println("Success");
			}
			else {
				System.out.println("Failure");
			}
			
			con.close();
								
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
