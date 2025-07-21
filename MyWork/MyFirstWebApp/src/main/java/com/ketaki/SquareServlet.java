package com.ketaki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		/*1.this was with dispatcher:- 
		 
		int k = )req.getAttribute("k");   
		(int
		k=k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);*/
        /*2.this was with redirect
         
        int k =Integer.parseInt(req.getParameter("k"));
		
		k=k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
		System.out.print("square called");*/
		
		//3.using session variables 
		/*HttpSession session =req.getSession();
		
		int k =  (int) session.getAttribute("k");
        
		k=k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
		System.out.print("square called");*/
		
		//as along as you don't delete the attribute from session the value will stay in the session.to remove use
		//session.removeAttribute("k");
		
		//4. using cookies
		
		int k=0;
		
		Cookie cookies[] = req.getCookies();// because you can have multiple cookies.
		
		for (Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k= Integer.parseInt(c.getValue());
			}
		}
		
	    k=k*k;
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='yellow'>");
		out.println("Result is "+k);
		out.println("</html></body>");
		System.out.print("square called");
		
		
	}
}
