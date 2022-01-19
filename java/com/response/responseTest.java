package com.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/res")
public class responseTest extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
//		sets the type of content of response
		res.setContentType("text/html");
		
//		returns the object of print writer
		PrintWriter out = res.getWriter();
		
//		return the object of servletoutputstream
		@SuppressWarnings("unused")
		ServletOutputStream outputStream = res.getOutputStream();
		
//		returns the size of the buffer
		int bufferSize = res.getBufferSize();
		out.println("<h1>buffer size = "+bufferSize+"</h1>");
		
//		returns character encoding
		String characterEncoding = res.getCharacterEncoding();
		out.println("<h1>character encoding = "+characterEncoding+"</h1>");
		
//		returns the type of the content
		String contentType = res.getContentType();
		out.println("<h1>content type = "+contentType+"</h1>");
		
//		reset the buffer
		res.resetBuffer();
		
//		sets the size of the buffer
		res.setBufferSize(300);
		
//		sets the character encoding
		res.setCharacterEncoding(contentType);
		
//		sets the content length
		res.setContentLength(45);
		
//		sets the content type
		res.setContentType(contentType);
	}

}
