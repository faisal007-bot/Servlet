package com.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servlet1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		
		out.println("<h2>Name = "+name+"</h2>");
		out.println("<h2>city = "+city+"</h2>");
		
//		forwarding request and response to another servlet
		RequestDispatcher rd = req.getRequestDispatcher("servlet2");
		rd.forward(req, resp);
		
//		including request and response to another servlet
//		RequestDispatcher rd = req.getRequestDispatcher("servlet2");
//		rd.include(req, resp);
		

//		forwarding request and response to another jsp
//		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
//		rd.forward(req, resp);
		
//		including request and response to another jsp
//		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
//		rd.include(req, resp);
	}
}
