package com.ketaki;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		//String name="ketaki";
		
		List<Student> studs = Arrays.asList(new Student(1,"Ketaki"),new Student(2,"Kimaya"),new Student(3,"Cat"));
				
		// Student s = new Student(1,"Ketaki");
		 
		//req.setAttribute("name", name);
		 //req.setAttribute("student", s);
		req.setAttribute("students", studs);
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}
	
}
