package com.ketaki;

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
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class NameFilter
 */
//@WebFilter("/addPerson")
@WebFilter(urlPatterns = "/addPerson/*")
public class NameFilter extends HttpFilter implements Filter {
  
	public void destroy() {
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req= (HttpServletRequest) request;
		PrintWriter out =response.getWriter();
		
		String name =req.getParameter("personName");
		if(name.length()>3)
		    chain.doFilter(request, response);
		else
			out.println("Invalid Name");

	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
