package com.game.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/count/*")
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String countStr = request.getParameter("cnt");
		int count = Integer.parseInt(countStr);
		System.out.println(count);
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
        response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(count);
		try {
			Thread.sleep(count*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
