package com.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		
		out.print("servlet 2");
		out.print("<h2 name = >"+name+"</h2>");
		out.print("<h2 city = >"+city+"</h2>");
	}
}
