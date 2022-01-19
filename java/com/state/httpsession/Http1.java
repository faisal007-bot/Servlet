package com.state.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/h1")
public class Http1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		
		HttpSession session = req.getSession();
		session.setAttribute("n", name);
		session.setAttribute("c", city);
		
		out.println("<h1>Name = "+name+"</h1>");
		out.println("<h1>City = "+city+"</h1>");
		
		out.println("<a href='h2'>GO</a>");
	}
}
