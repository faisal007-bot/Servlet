package com.contextparam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ContextParamTest extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		getting the object of servlet context
		ServletContext application = getServletContext();
//		ServletContext context2 = getServletConfig().getServletContext();
		
//		getting single context param value from web.xml file 
		String name = application.getInitParameter("name");
		String city = application.getInitParameter("city");
		
		out.println("<h2>name = "+name+"</h2>");
		out.println("<h2>name = "+city+"</h2>");
		
//		getting the name of all the context params from the web.xml
		Enumeration<String> initParameterNames = application.getInitParameterNames();
		Iterator<String> itr = initParameterNames.asIterator();
		while(itr.hasNext()) {
			out.println("<h2>"+itr.next()+"</h2>");
		}
	}
}
