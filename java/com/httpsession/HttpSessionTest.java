package com.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.ServletConfig;
//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/httpsession")
@SuppressWarnings("serial")
public class HttpSessionTest extends HttpServlet{
	@SuppressWarnings("unused")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		used to create the httpsession object
		HttpSession session = req.getSession();
//		it creates session if request is not associated with any session
		HttpSession session2 = req.getSession(true);
		
		
//		returns the time of the creating the httpsession object
		long creationTime = session.getCreationTime();
		out.println("<h1>creation time of httpsession = "+creationTime+"</h1>");
		
//		returns the id of the httpsession
		String id = session.getId();
		out.println("<h1>ID of httpsession = "+id+"</h1>");
		
//		returns the last request accessed this httpsession object
		long lastAccessedTime = session.getLastAccessedTime();
		out.println("<h1>last accessed time of httpsession = "+lastAccessedTime+"</h1>");
		
//		used to set the max interval time between requests
		session.setMaxInactiveInterval(60*60);
		
//		returns the max interval time of httpsession
		int maxInactiveInterval = session.getMaxInactiveInterval();
		out.println("<h1>max interval time of httpsession = "+maxInactiveInterval+"</h1>");
		
	}
}
