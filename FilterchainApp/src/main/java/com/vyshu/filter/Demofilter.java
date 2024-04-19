package com.vyshu.filter;

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

@WebFilter("/test")
public class Demofilter extends HttpFilter implements Filter {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("Demofilter loading");
	}

	public Demofilter() {
		System.out.println("Demofilter instantiation");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Demofilter intialization");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		out.println("<h1 style  = 'text-align:center;color:red'> This is the Demo filter preprocessing </h1>");
		
		chain.doFilter(request, response);
		out.println("<h1 style  = 'text-align:center;color:red'> This  is the Demo filter postprocessing </h1>");
	}

	public void destroy() {
		System.out.println("Demofilter deinstantiation");
	}

}
