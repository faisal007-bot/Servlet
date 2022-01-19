package com.httpservlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyHttpServlet extends HttpServlet{
//		common methods of httpservlet class
	
	@Override
	public void service(ServletRequest req,ServletResponse resp)throws ServletException , IOException{
		System.out.println("public service method");
	}
	
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp)throws ServletException , IOException{
		System.out.println("protected service method");
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException , IOException{
	}
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException , IOException{
	}
	
	@Override
	public String getInitParameter(String name) {
		return super.getInitParameter(name);
	}
	
	@Override
	protected long getLastModified(HttpServletRequest req) {
		return super.getLastModified(req);
	}
	
	@Override
	public Enumeration<String> getInitParameterNames() {
		return super.getInitParameterNames();
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
	public String getServletInfo() {
		return super.getServletInfo();
	}
	
	@Override
	public String getServletName() {
		return super.getServletName();
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	@Override
	public void destroy() {
		super.destroy();
	}
	
	
	
//		non common methods of httpservlet class
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
