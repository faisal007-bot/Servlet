package com.parameters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")
@SuppressWarnings("serial")
public class DataGetter extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		getting parameters from the browser
//		parameters recieved in the form of a string
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		
		out.print("<h1>name = "+name+"</h1>");
		out.print("<h1>city = "+city+"</h1>");
	}
}
