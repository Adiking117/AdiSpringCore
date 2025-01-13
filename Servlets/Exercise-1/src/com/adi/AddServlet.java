package com.adi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int result = i+j;
		
// 		// Request dispatcher
// 		req.setAttribute("result",result);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
//		// URl rewriting
// 		res.sendRedirect("sq?result="+result); 

// 		// Session management
//		HttpSession session = req.getSession();
//		session.setAttribute("result",result);
//		res.sendRedirect("sq");
		
// 		// Cookie
		Cookie cookie = new Cookie("result", result+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		
		
		
		//System.out.print("The result is "+result);
		PrintWriter out;
		try {
			out = res.getWriter();
			// out.println("<html><body bgcolor='cyan'>");
			out.print("The result is "+result);
			// out.print("</body></html>");
		} catch (IOException e) {
		}

	}
}
