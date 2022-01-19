package com.state.hiddenformfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/first")
public class First extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		
		out.print("<form action='second' method='get'>");
		out.print("<input type='hidden' name='n' value='"+name+"'/>");
		out.print("<input type='hidden' name='c' value='"+city+"'/>");
		out.print("<input type='submit' value='GO'/>");
		out.print("</form>");
	}
}
