package com.vyshu.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/test")
public class Logfilter extends HttpFilter implements Filter {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FilterConfig config = null;
	static {
		System.out.println("Logfilter loading");
	}
	public Logfilter() {
		System.out.println("Logfilter instantiation");
	}

	public void init(FilterConfig config) throws ServletException {
		System.out.println("Logfilter intialization");
		this.config = config;
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.println("<h1 style = 'text-align:center;color:green'>This  is the Log filter preprocessing </h1>");
		ServletContext context = config.getServletContext();
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("config : " + config);
		System.out.println("A request is comming from " + req.getRemoteHost() +req.getRequestURI()+ "at date is" + new java.util.Date());
		chain.doFilter(request, response);
		out.println("<h1 style = 'text-align:center;color:green'>This  is the Log filter postprocessing</h1>");
	}

	public void destroy() {
		config = null;
		System.out.println("Logfilter deinstantiation");
	}

}
