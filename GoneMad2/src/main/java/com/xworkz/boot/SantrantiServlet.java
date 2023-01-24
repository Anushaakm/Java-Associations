package com.xworkz.boot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 10,urlPatterns = "/fest")
public class SantrantiServlet extends HttpServlet {
public SantrantiServlet() 
	{System.out.println("Running SankranthiSerlet");
	}
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget sankarnthiSerlet");
		}
}
