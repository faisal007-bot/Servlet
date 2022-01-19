package com.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/reqtest")
public class ServletTest extends GenericServlet{
	@SuppressWarnings("unused")
	public void service(ServletRequest req,ServletResponse resp)throws ServletException , IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		returns the length of the content
		int contentLength = req.getContentLength();
		out.println("<h1>content length = "+contentLength+"</h1>");
		
//		return the character encoding used by the browser
		String characterEncoding = req.getCharacterEncoding();
		out.println("<h1>character encoding = "+characterEncoding+"</h1>");
		
//		returns the type of the content
		String contentType = req.getContentType();
		out.println("<h1>content type = "+contentType+"</h1>");
		
//		returns the servletinputstream object used to get binary data from the browser
		ServletInputStream inputStream = req.getInputStream();
		
//		returns the local address
		String localAddr = req.getLocalAddr();
		out.println("<h1>local address = "+localAddr+"</h1>");
		
//		returns the local name
		String localName = req.getLocalName();
		out.println("<h1>local name = "+localName+"</h1>");
		
//		returns the local port
		int localPort = req.getLocalPort();
		out.println("<h1>local port = "+localPort+"</h1>");
		
//		returns the protocol
		String protocol = req.getProtocol();
		out.println("<h1>protocol = "+protocol+"</h1>");
		
//		returns the remote address
		String remoteAddr = req.getRemoteAddr();
		out.println("<h1>remote address = "+remoteAddr+"</h1>");
		
//		returns the remote host
		String remoteHost = req.getRemoteHost();
		out.println("<h1>remote host = "+remoteHost+"</h1>");
		
//		returns the remote port
		int remotePort = req.getRemotePort();
		out.println("<h1>remote port = "+remotePort+"</h1>");
		
//		checks whether connection is secure or not
		boolean secure = req.isSecure();
		out.println("<h1>secure = "+secure+"</h1>");
		
//		returns the object of servlet context
		ServletContext servletContext = req.getServletContext();
		
//		returns the object of request dispatcher
		RequestDispatcher rd = req.getRequestDispatcher("form.html");
	}
}
