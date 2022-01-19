package com.state.hiddenformfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
@SuppressWarnings("serial")
public class Second extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("n");
		String city = req.getParameter("c");
		
		out.println("<h1>Name = "+name+"</h1>");
		out.println("<h1>City = "+city+"</h1>");
	}
}
