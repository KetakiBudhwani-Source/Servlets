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
 * Servlet Filter implementation class IdFilter
 */
//@WebFilter("/addPerson")
@WebFilter(urlPatterns = "/addPerson/*")
public class IdFilter extends HttpFilter implements Filter {
       
  
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//System.out.println("In filter");
        
		HttpServletRequest req= (HttpServletRequest) request;
		PrintWriter out =response.getWriter();
		
		int id =Integer.parseInt(req.getParameter("personId"));
		if(id>-1)
		    chain.doFilter(request, response);
		else
			out.println("Invalid Id");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
