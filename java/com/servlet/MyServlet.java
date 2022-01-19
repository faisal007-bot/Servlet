package com.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet{
	
//	lifecycle methods of the servlet
	
	private ServletConfig config;
	
	@Override
	public void init(ServletConfig config) {
		System.out.println("init method invoked");
	}
	
	@Override
	public void service(ServletRequest req,ServletResponse resp) 
		throws ServletException , IOException{
		System.out.println("service method invoked");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method invoked");
	}
	
	
//	non lifecycle methods of the servlet
	
	@Override
	public ServletConfig getServletConfig() {
		return config;
	}
	
	@Override
	public String getServletInfo() {
		return "servlet using servlet interface";
	}
}
