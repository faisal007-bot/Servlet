package com.senredirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tester")
@SuppressWarnings("serial")
public class Tester extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		redirecting outside the server with query
		resp.sendRedirect("https://www.google.com?query=what is java");
		
//		redirecting outside the server
//		resp.sendRedirect("https://www.facebook.com");
		
//		redirecting inside the server
//		resp.sendRedirect("form.html");
	}
}