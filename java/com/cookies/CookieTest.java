package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/cook")
public class CookieTest extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//		creating the cookie object
		Cookie cookie = new Cookie("name","faisal");
		
//		setting the age of the cookie
//		cookie.setMaxAge(0);//it is used to expire the cookie
		cookie.setMaxAge(60*60);
		
//		returns the age of the cookie
		int maxAge = cookie.getMaxAge();
		out.println("<h1>age of the cookie = "+maxAge+"</h1>");
		
//		returns the name of the cookie
		String name = cookie.getName();
		out.println("<h1>name of the cookie = "+name+"</h1>");
		
//		sets the value of the cookie
		cookie.setValue("faiz");
		
//		returns the value inside the cookie
		String value = cookie.getValue();
		out.println("<h1>value of the cookie = "+value+"</h1>");
		
//		used to set the security of the cookie
		cookie.setSecure(true);
		
//		returns the security of the cookie
		boolean secure = cookie.getSecure();
		out.println("<h1>security of the cookie = "+secure+"</h1>");
		
//		used to add the cookie in the response object
		resp.addCookie(cookie);
		
//		used to get all the cookies in the request object
		Cookie[] cookies = req.getCookies();
		for(Cookie c:cookies) {
			out.println("<h1>"+c.getName()+"</h1>");
			out.println("<h1>"+c.getValue()+"</h1>");
		}
	}
}
