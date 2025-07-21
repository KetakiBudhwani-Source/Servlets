package com.ketaki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")   //instead of web.xml for mapping you can use annotation
public class AddServlet extends HttpServlet{
     
	/*public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException {    //req here is request object and res is response object
    	 
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		PrintWriter out = res.getWriter();
		
		out.println("Result is "+k);
		
		//System.out.println("Result is "+k); to print on console
     }*/
	/*public void doPost(HttpServletRequest req, HttpServletResponse res ) throws IOException {    //doPost method only works with html post
   	 
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		PrintWriter out = res.getWriter();
		
		out.println("Result is "+k);
		
		//System.out.println("Result is "+k); to print on console
     }*/
	
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {    //doPost method only works with html post
	   	 
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		
		req.setAttribute("k", k); //create new attribute k and assign k value
		
		/* There are two ways of calling SquareServlet RequestDispatcher or Redirect . We will use request dispatcher
		 * RequestDispatcher is an interface */
		
		//1.RequestDispatcher rd=req.getRequestDispatcher("square");
		//rd.forward(req, res);
		
		//2.res.sendRedirect("square?k="+k); Session Management:- Url rewriting used here , more techniques session and cookie
		
		//3.using session  .If you have multiple values or pass values to multiple servlets use session
		/*HttpSession session =req.getSession();
		session.setAttribute("k", k);
		
		res.sendRedirect("square");*/
		
		//4.using cookies
		
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("square");
		
     }
}
