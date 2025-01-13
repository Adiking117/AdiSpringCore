package com.adi;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.*;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response ) throws IOException{ 
		List<Student> studs = Arrays.asList(new Student("Adi@gmail.com", "Aditya"),new Student("Pra@gmail.com", "Prnav"),new Student("Tir@gmail.com", "Tirth"));
		request.setAttribute("students",studs);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		try {
			rd.forward(request,response);
		} catch (ServletException e) {
		}
	}
}
