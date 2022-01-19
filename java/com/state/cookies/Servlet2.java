package com.state.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ss2")
@SuppressWarnings("serial")
public class Servlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		Cookie[] cookies = req.getCookies();
		String name = "";
		boolean isNew = true;
		if(cookies==null) {
			out.println("<h1>New User</h1>");
		}
		else {
			for(Cookie c:cookies) {
				String tname = c.getName();
				if(tname.equals("n")) {
					name = c.getValue();
					isNew = false;
				}
			}
		}
		if(!isNew) {
			out.println("<h1>welcome back = "+name+"</h1>");
		}
	}
}
