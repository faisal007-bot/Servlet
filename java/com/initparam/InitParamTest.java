package com.initparam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class InitParamTest extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		ServletConfig config = getServletConfig();
//		used to get the single value inside the web.xml file
		String name = config.getInitParameter("name");
		String city = config.getInitParameter("city");
		out.println("<h2>name = "+name+"</h2>");
		out.println("<h2>city = "+city+"</h2>");
		
//		getting the name of all the init params inside the web.xml
		Enumeration<String> initParameterNames = config.getInitParameterNames();
		Iterator<String> itr = initParameterNames.asIterator();
		while(itr.hasNext()) {
			out.println("<h2>"+itr.next()+"</h2>");
		}
		
//		returns the name of the servlet
		String servletName = config.getServletName();
		out.println("<h2>servlet name = "+servletName+"</h2>");
	}
}
