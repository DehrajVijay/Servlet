package com.servlet;

import java.io.IOException;
 
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	// name must be service because service() method belongs to servlet life cycle.
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		// to print data on Console.
		System.out.println("Result is: " + k);
		// to print the data on web page.
		PrintWriter out = res.getWriter();
		out.println("Result is: " + k);
	}
}
