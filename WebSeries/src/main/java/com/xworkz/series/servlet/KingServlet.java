package com.xworkz.series.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 76,urlPatterns = "/king")
public class KingServlet extends HttpServlet {
	public KingServlet() {
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
		
		String kingName=req.getParameter("kingName");
		String region=req.getParameter("region");
		String noOfQueen=req.getParameter("noOfQueen");
		String dob=req.getParameter("dob");
		String dod=req.getParameter("dod");
		
		System.out.println(kingName);
		System.out.println(region);
		System.out.println(noOfQueen);
		System.out.println(dob);
		System.out.println(dod);
		
		
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("<span style='color:red'>");
		writer.println("Series kingName "+ kingName +" is sent successfully" );
		writer.println("Series region "+ region +" is sent successfully" );
		writer.println("Series noOfQueen "+ noOfQueen +" is sent successfully" );
		writer.println("Series dob "+ dob +" is sent successfully" );
		writer.println("Series dod "+ dod +" is sent successfully" );
		writer.println("</span>");
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");
		resp.setContentType("text/html");
		
	}

}
