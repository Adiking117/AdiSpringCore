package com.adi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Collection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.adi.entity.Employee;

@Component
public class EmployeeDAO {
	
	@Autowired
	@Qualifier("mySqlDataSource") // By default bean with this id will be injected
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void saveEmployee(Employee employee) {
		// saveEmployeeUsingJDBC(employee);
		// saveEmployeeUsingDataSource(employee);
		saveEmployeeUsingJdbcTemplate(employee);
	}
	
//	public void saveEmployeeUsingJDBC(Employee employee) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payroll","root","Aditya@2003");
//			PreparedStatement pStatement = connection.prepareStatement("insert into employee values(?,?,?,?)");
//			pStatement.setInt(1, employee.getId());
//			pStatement.setString(2, employee.getName());
//			pStatement.setString(3, employee.getDesignation());
//			pStatement.setString(4, employee.getEmail());
//			
//			pStatement.executeUpdate();
//			connection.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
	
	
//	public void saveEmployeeUsingDataSource(Employee employee) {
//	    try (Connection connection = dataSource.getConnection()) {
//	        PreparedStatement pStatement = connection.prepareStatement("INSERT INTO employee VALUES (?, ?, ?, ?)");
//	        pStatement.setInt(1, employee.getId());
//	        pStatement.setString(2, employee.getName());
//	        pStatement.setString(3, employee.getDesignation());
//	        pStatement.setString(4, employee.getEmail());
//	        pStatement.executeUpdate();
//	        connection.close();
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	        throw new RuntimeException("Error saving employee: " + e.getMessage(), e);
//	    }
//
//	}
	
	public void saveEmployeeUsingJdbcTemplate(Employee employee) {
		try {
			jdbcTemplate.update("insert into employee values (?, ?, ?, ?)",
					new Object[] {employee.getId(),employee.getName(),
							employee.getDesignation(),employee.getEmail()
					});		// DML Operations - Insert Update Delete
		} catch (Exception e) {
			e.printStackTrace();
	        throw new RuntimeException("Error saving employee: " + e.getMessage(), e);
		}
	}
	
	public Collection<Employee> getAllEmployees(){
		try {
			return jdbcTemplate.query("select id,name,designation,email from employee",new BeanPropertyRowMapper(Employee.class));
		} catch (Exception e) {
			e.printStackTrace();
	        throw new RuntimeException("Error saving employee: " + e.getMessage(), e);
		}
	}

	
	
}
