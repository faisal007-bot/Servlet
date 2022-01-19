package com.servletcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/context")
public class ServletContextTest extends HttpServlet{
	@SuppressWarnings("unused")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		getting the object of servletcontext
		ServletContext context = getServletContext();
//		ServletContext context2 = getServletConfig().getServletContext();
		
	}
}
