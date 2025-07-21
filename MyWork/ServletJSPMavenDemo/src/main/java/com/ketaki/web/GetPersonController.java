package com.ketaki.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ketaki.web.Dao.PersonDao;

@WebServlet("/getPerson")
public class GetPersonController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= Integer.parseInt(request.getParameter("id"));
		
		PersonDao dao = new PersonDao();
		Person p1 = dao.getPerson(id);
		
		/*request.setAttribute("person", p1);
		RequestDispatcher rd= request.getRequestDispatcher("showPerson.jsp");
		rd.forward(request, response);*/
		HttpSession session = request.getSession();
		session.setAttribute("person", p1);
		
		response.sendRedirect("showPerson.jsp");
		
	}


}
