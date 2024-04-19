package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet implements Servlet {
static
{
	System.out.println("Server loading");
}
public DemoServlet() {
	System.out.println("Server intialization");
}
	public void destroy() {
	System.out.println("Server Deintanstation");
		
	}

	public ServletConfig getServletConfig() {
		
		return null;
	}

	public String getServletInfo() {
		
		return "dragons";
	}

	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Server instatation");
		
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("providing service");
		response.setContentType("text/html");
		PrintWriter  out  =response.getWriter();
		out.println("<html><head><title>Hello World</title></head>");
		out.println("<body>");
		
		out.println("<marquee style = 'color : red;font-size:500;'>Welcome to servlets</marquee>");
		
		out.println("</html>");
		out.close();
		
	}
}
