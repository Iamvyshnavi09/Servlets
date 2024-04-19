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
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("pid");
		String pname = request.getParameter("pname");
		String pquantity = request.getParameter("pquantity");
		
		Cookie c1 = new Cookie("pid", pid);
		Cookie c2 = new Cookie("pname", pname);
		Cookie c3 = new Cookie("pquantity", pquantity);
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		
		RequestDispatcher rd = request.getRequestDispatcher("Second.html");
		rd.forward(request, response);
		
		
		
		}

}
