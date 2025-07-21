package com.ketaki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * This is class for servlet context and config 
 */
public class MyServlet extends HttpServlet {
	
	public void doGet( HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.print("Hi  ");
		
		//Using servletContext . this parameter is shared across all servlets
		/*ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		
		out.print(str);*/
		
		//Using serverConfig
		ServletConfig config = getServletConfig();
		String str = config.getInitParameter("name");
		
		out.print(str);
		
	}

}
