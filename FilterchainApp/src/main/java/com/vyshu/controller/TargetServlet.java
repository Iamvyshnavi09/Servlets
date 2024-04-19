package com.vyshu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static {
		System.out.println("Servlet loading");
	}

	public TargetServlet() {
		System.out.println("Servlet instantiation");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Servlet intialization");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1 style='text-align:center;color:orange'>This is the Target servlet</h1>");
		
	}
	public void destroy() {
		System.out.println("Servlet deinstantiation");
	}

}
