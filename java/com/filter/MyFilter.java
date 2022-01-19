package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{
	
	@Override
	public void init(FilterConfig config) {
		System.out.println("init method invoked");
	}
	
	@Override
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException , IOException{
		System.out.println("filter method invoked");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method invoked");
	}
	
}
