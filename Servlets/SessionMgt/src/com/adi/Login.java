package com.adi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname");
        String pass = request.getParameter("pass");

//        if(name == null || name.isEmpty() || pass == null || pass.isEmpty()) {
//            response.sendRedirect("login.jsp");
//            return;
//        }
        

        HttpSession session = request.getSession();
        session.setAttribute("username", name);
        response.sendRedirect("welcome.jsp");
    }
}
