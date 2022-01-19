package com.genericservlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class MyGenericServlet extends GenericServlet{
	
	@Override
	public void init() throws ServletException{
		super.init();
		System.out.println("init method invoked");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		System.out.println("init method invoked");
	}
	
	@Override
	public void service(ServletRequest req,ServletResponse resp) throws ServletException , IOException{
		System.out.println("service method invoked");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method invoked");
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return super.getServletConfig();
	}
	
	@Override
	public ServletContext getServletContext() {
		return super.getServletContext();
	}
	
	@Override
	public String getInitParameter(String name) {
		return null;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Enumeration getInitParameterNames() {
		return null;
	}
	
	@Override
	public String getServletName() {
		return super.getServletName();
	}
	
	@Override
	public String getServletInfo() {
		return super.getServletInfo();
	}
}
