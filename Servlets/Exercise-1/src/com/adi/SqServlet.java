package com.adi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {

//		Request dispatcher
//		int k = (int)req.getAttribute("result");
		
// 		URl Rewriting
// 		int k = Integer.parseInt(req.getParameter("result"));
		
// 		Session management
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("result");

		
		// Cookie
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("result")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		
		k *= k;
		PrintWriter out = res.getWriter(); 
		out.print("Hello to sq "+k);	
		
		// System.out.print("Sq Called");
	}
}
