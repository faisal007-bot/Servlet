package com.attributes1;

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
@WebServlet("/a1")
public class AttributeTest extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		setting attribute in request scope
		req.setAttribute("name", "faiz");
		
//		setting attribute in httpsession scope
		HttpSession session = req.getSession();
		session.setAttribute("name", "deadeye");
		
//		setting attribute in servletContext scope
		ServletContext application = getServletContext();
		application.setAttribute("name", "faulty");
		
		
//		getting attribute from request scope
		String name1 = req.getAttribute("name").toString();
		
//		getting attribute from httpsession scope
		String name2 = session.getAttribute("name").toString();
		
//		getting attribute from servletcontext scope
		String name3 = application.getAttribute("name").toString();
		
		out.println("<h1>request = "+name1+"</h1>");
		out.println("<h1>httpsession = "+name2+"</h1>");
		out.println("<h1>servletcontext = "+name3+"</h1>");
		
//		removing attribute from request scope
		req.removeAttribute("name");
//		removing attribute from httpsession scope
		session.removeAttribute("name");
//		removing attribute from servletcontext scope
		application.removeAttribute("name");
		
		
		out.println("<h1>request = "+name1+"</h1>");
		out.println("<h1>httpsession = "+name2+"</h1>");
		out.println("<h1>servletcontext = "+name3+"</h1>");
	}
}
