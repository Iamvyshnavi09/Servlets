package com.vyshu.filter.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class TargetServlet
 */
@WebFilter("/Demo")
public class TargetServlet extends HttpFilter implements Filter {
    static {
    	System.out.println("filter loading.");
    }
    public TargetServlet() {
       System.out.println("filter instantiation");
    }

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter intialization");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.println("<h1 style='text-align:center;color:0E2466'>Pre processing request</h1>");
		chain.doFilter(request, response);
		out.println("<h1 style='text-align:center;color:0E2466'>post processing request</h1>");
	}

public void destroy() {
		System.out.println("filter deinstantiation");
	}


}
