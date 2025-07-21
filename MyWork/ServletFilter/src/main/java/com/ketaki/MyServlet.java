package com.ketaki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/addPerson")
public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		
		PrintWriter out= response.getWriter();
		System.out.println("In Servlet");
		int id =Integer.parseInt(request.getParameter("personId"));
		String name = request.getParameter("personName");
		
		out.println("Welcome "+name);
	}

}
