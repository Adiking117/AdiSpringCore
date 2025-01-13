package com.adi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addStudent")
public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("sname");
		String email = req.getParameter("semail");
		
		out.print("Welcome" + name);
		
	}
}
