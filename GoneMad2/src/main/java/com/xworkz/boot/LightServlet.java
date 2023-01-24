package com.xworkz.boot;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 10,urlPatterns = "/led")
public class LightServlet extends HttpServlet {
	public LightServlet(){
		System.out.println("Running LightServlet");
	}
	
	
	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget "
				+ "lightServlet");
		}
}

