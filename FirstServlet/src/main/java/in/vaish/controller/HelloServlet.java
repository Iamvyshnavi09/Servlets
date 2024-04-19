package in.vaish.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@SuppressWarnings("serial")
@WebServlet("/HelloServlet")
public class HelloServlet extends GenericServlet{

	

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Hello Servlet</title></head>");
		out.println("<body>");
		
		out.println("<marquee style = 'color : black;font-size:500;'>My Servlets</marquee>");
		
		out.println("</html>");
		out.close();
		
		
	}
	

}
