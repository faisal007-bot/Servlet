package com.authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filterer implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		if(name.equals("faisal")) {
			chain.doFilter(request, response);
		}
		else {
			PrintWriter out = response.getWriter();
			out.print("<h1>invalid user</h1>");
		}
	}

}
