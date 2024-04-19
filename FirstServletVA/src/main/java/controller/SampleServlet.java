package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class SampleServlet implements Servlet {
	static {
		System.out.println("Servlet loading......");
	}

	public SampleServlet() {
		System.out.println("Servlet instatiation");
	}

	public void init(ServletConfig arg0) throws ServletException {
		System.out.println(" Servlet Initialization");

	}

	public ServletConfig getServletConfig() {

		return null;
	}

	public String getServletInfo() {

		return "Dragons world";
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>My Servlets</title></head>");
		out.println("<body>");
		out.println("<h1 style = 'color: Blue;  text-align: center;  font-size :50 '> Hello Dragons</h1>");
		out.println("</html>");
		out.close();
}
	public void destroy() {
		System.out.println("Servlet Deinstantiation");

	}

}
