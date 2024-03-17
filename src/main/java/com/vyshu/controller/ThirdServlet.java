package com.vyshu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address = request.getParameter("address");
		String email= request.getParameter("email");
		
	Cookie[] cookies = request.getCookies();
	Integer pid = Integer.parseInt(cookies[0].getValue());
	String pname = cookies[1].getValue();
	String pquantity = cookies[2].getValue();
	String name = cookies[3].getValue();
	String mobile = cookies[4].getValue();
	
PrintWriter out = response.getWriter();
	
	out.println("<body bgcolor='#FFEFD5'>");
	out.println("<table align='center' border='1'>");
	out.println("<tr><td>Product ID</td><td>"+pid+"</td></tr>"); 
	out.println("<tr><td>Product Name</td><td>"+pname+"</td></tr>"); 
	out.println("<tr><td>pquantity</td><td>"+pquantity+"</td></tr>");
	out.println("<tr><td>CustomerName</td><td>"+name+"</td></tr>");
	out.println("<tr><td>Mobile details</td><td>"+mobile+"</td></tr>") ;
	out.println("<tr><td>Address</td><td>"+address+"</td></tr>"); 
	out.println("<tr><td>Email</td><td>"+email+"</td></tr>");
	out.println("</table>");
	out.println("</body>"); 
	
	out.close();
	}
	
     	
	
	}


