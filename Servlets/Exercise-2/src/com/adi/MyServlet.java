package com.adi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

public class MyServlet {
	protected void doGet(HttpServletResponse req,HttpServletResponse res) throws ServletException,IOException{
		
		PrintWriter out = res.getWriter();
		out.print("Hi adi");
		
		// different servletes
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		String str1 = ctx.getInitParameter("Phone");
		out.println(str+" "+str1);
		
		// different values for same servlet
		ServletConfig cg = getServletConfig();
		String str2 = cg.getInitParameter("name");
		out.println(str2);
		
	}

	private ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	private ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return null;
	}

}
