package com.vyshu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
	
		
		Cookie c4 = new Cookie("name", name);
		Cookie c5 = new Cookie("mobile", mobile);
		
		response.addCookie(c4);
		response.addCookie(c5);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("Third.html");
		rd.forward(request, response);
	}

}
