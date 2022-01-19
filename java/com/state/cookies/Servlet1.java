package com.state.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/ss1")
public class Servlet1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String city = req.getParameter("city");
//		if user provides text with whitespace we cant store it in the cookie so we have to remove the space 
//		before adding it into the cookie
		if(name.contains(" ")) {
			name = name.replaceAll(" ", "_");
		}
		Cookie c1 = new Cookie("n",name);
		
		resp.addCookie(c1);
		
		out.println("<h1>name = "+name+"</h1>");
		out.println("<h1>city = "+city+"</h1>");
		out.println("<a href='ss2'>GO</a>");
	}
}
