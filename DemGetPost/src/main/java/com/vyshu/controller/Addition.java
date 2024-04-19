package com.vyshu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Addition")
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static {
		System.out.println("Server loading...");
	}
	public Addition() {
		System.out.println("Server initialization");
	}
	@Override
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("Server instansiation");
    	System.out.println("Config object : "+config);
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Get method");
		
		 processRequest(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Post method");
		
		 processRequest(request,response);
	}	
	public void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		String num1 = request.getParameter("t1");
		String num2 = request.getParameter("t2");
		try{
			int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		int k = i + j;
		PrintWriter out = response.getWriter();
		out.println("<h1 style='text-align:center'>The Addition of two numbers</h1>");
		out.println("<body bgcolor = 'lightblue'>");
		out.println("<table align='center'border='1'>");
		out.println("<tr><td> First number</td><td>"+i+"</td></tr>");
		out.println("<tr><td> Second number</td><td>"+j+"</td></tr>");
		out.println("<tr><td>Addition</td><td>"+k+"</td></tr>");
		out.println("</table>");
		out.println("</body>");
		}
		catch (NumberFormatException e) {
			PrintWriter out = response.getWriter();
		    System.out.println("At least one invalid number in the given numbers: "+num1+","+num2);
		    e.printStackTrace();
		    out.println("<h1 style='text-align:center;color:red'>You entered wrong input</h1>");
		}
	}
}
