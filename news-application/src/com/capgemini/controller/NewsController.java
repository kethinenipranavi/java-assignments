package com.capgemini.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NewsController", loadOnStartup = 1, urlPatterns = { "/TodayNews" })
public class NewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewsController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String News = request.getParameter("News");
		if (News.equals("Times of India")) {
			response.sendRedirect("https://timesofindia.indiatimes.com");
		} else if (News.equals("Economic Times")) {
			response.sendRedirect("https://economictimes.indiatimes.com/");
		} else if (News.equals("Maharashtra Times")) {
			response.sendRedirect("https://maharashtratimes.indiatimes.com/");
		} else if (News.equals("DNA")) {
			response.sendRedirect("https://www.dnaindia.com/");
		}
	}

}
