package com.Vyshu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
static {
	System.out.println("Server loading....");
}
    public SampleServlet() {
        System.out.println("Server instanstiation");
    }
    @Override
    public void init() throws ServletException {
    	//ServletConfig config = getServletConfig() ;
    	//System.out.println("Config object : "+config);
    	
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET method");
		response.setContentType("text/html");
		ServletConfig config = getServletConfig() ;
    	System.out.println("Config object : "+config);
		PrintWriter out = response.getWriter();
		out.println("<html><head><title></title></head>");
		out.println("<body>");
		out.println("<h1>Hello servlets</h1>");
		out.println("</body");
		out.println("</html>");
		out.close();
    }

}
