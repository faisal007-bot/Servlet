package com.attributes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/s1")
public class Serve1 extends HttpServlet{
//	attrributes are sent in the form of objects from one servlet to another servlet
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		setting attributes in request scope
		req.setAttribute("name", "faisal khan");
		req.setAttribute("city", "nevada");
		
//		setting attributes in session scope
		HttpSession session = req.getSession();
		session.setAttribute("name", "deadeye");
		session.setAttribute("city", "vegas");
		
//		setting attributes in application scope
		ServletContext application = getServletConfig().getServletContext();
		application.setAttribute("name", "sleeping");
		application.setAttribute("city", "UK");
		
		RequestDispatcher rd = req.getRequestDispatcher("s2");
		rd.forward(req, resp);
	}
}
