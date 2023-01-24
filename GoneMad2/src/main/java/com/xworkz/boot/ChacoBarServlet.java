package com.xworkz.boot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 4,urlPatterns = "/chokye")
public class ChacoBarServlet extends HttpServlet {
public ChacoBarServlet() {
	System.out.println("Created chacoBar Servlet....");
	
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Created doget chacoBar Servlet");
	}
}
