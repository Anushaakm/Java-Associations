package com.xworkz.Luminous12345;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 8, urlPatterns = "/save")
public class UPSServlet extends HttpServlet {
	public UPSServlet() {
		System.out.println("Running ups Servlet");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running init");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get from UPS..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post from UPS..");
		String data = "Never apologize for being sensitive or emotional. Let this be a sign that you’ve got a big heart and aren’t afraid to let others see it. Showing your emotions is a sign of strength.\r\n"
				+ "—Brigitte Nicole";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Put from UPS...");
		String ref1 = "Be a girl with a mind, a woman with attitude, and a lady with class.";
		ServletInputStream writer2 = req.getInputStream();
		System.out.println("writer2 " + writer2);
		resp.setContentType("text/plain");

	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delete fromUPS...");
		String ref2 = " Go ahead. Tell me that I’m not good enough. Tell me I can’t do it, because I will show you over and over again that I can!";
		PrintWriter writer2 = resp.getWriter();
		writer2.print(ref2);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Head from UPS");
		String ref3 = "Dear stress, let’s break up.";
		PrintWriter writer3 = resp.getWriter();
		writer3.print(ref3);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Options from UPS...");
		String ref4 = "If you can dance and be free and be embarrassed, you can rule the world.\r\n" + "—Amy Poehler";
		PrintWriter writer4 = resp.getWriter();
		writer4.print(ref4);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Trace from UPS..");
		String ref5 = "A girl should be two things: who and what she wants.\r\n" + "—Coco Chanel";
		PrintWriter writer5 = resp.getWriter();
		writer5.print(ref5);
		resp.setContentType("text/plain");
	}
}
