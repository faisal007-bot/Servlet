package com.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/s2")
public class Serve2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		getting attributes from request scope
		String name1 = req.getAttribute("name").toString();
		String city1 = req.getAttribute("city").toString();
		out.println("<h1>Name = "+name1+"</h1>");
		out.println("<h1>City = "+city1+"</h1>");
		
//		getting attributes from session scope
		HttpSession session = req.getSession();
		String name2 = session.getAttribute("name").toString();
		String city2 = session.getAttribute("city").toString();
		out.println("<h1>Name = "+name2+"</h1>");
		out.println("<h1>City = "+city2+"</h1>");
		
//		getting attributes from application scope
		ServletContext application = getServletContext();
		String name3 = application.getAttribute("name").toString();
		String city3 = application.getAttribute("city").toString();
		out.println("<h1>Name = "+name3+"</h1>");
		out.println("<h1>City = "+city3+"</h1>");
	}
}
