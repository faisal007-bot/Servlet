package com.state.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/h2")
public class Http2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession();
		
		String name = session.getAttribute("n").toString();
		String city = session.getAttribute("c").toString();
		
		out.println("<h1>Name using session= "+name+"</h1>");
		out.println("<h1>City using session= "+city+"</h1>");
	}
}
