package com.xworkz.series.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/cam")
public class WebSeriesServlet extends HttpServlet {
	
	public WebSeriesServlet() {
		System.out.println("Created"+getClass().getSimpleName());
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running init....configuration");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget from Webserver");
		System.out.println(Thread.currentThread().getName());
		
		String name=req.getParameter("seriesName");
		String language=req.getParameter("lang");
		String episodes=req.getParameter("episodes");
		String ott=req.getParameter("ott");
		String budget=req.getParameter("Budget");
		
		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("Series Name "+ name +" is sent successfully" );
		writer.print("Series language "+ language +" is sent successfully" );
		writer.print("Series episodes "+ episodes +" is sent successfully" );
		writer.print("Series ott "+ ott +" is sent successfully" );
		writer.print("Series budget "+ budget +" is sent successfully" );
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
	}

}
