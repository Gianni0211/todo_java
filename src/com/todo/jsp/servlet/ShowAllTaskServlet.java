package com.todo.jsp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowAllTaskServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<String> todoList = new ArrayList<String>();
		todoList = (ArrayList<String>) request.getAttribute("todoList");

		request.getSession().setAttribute("todoList", todoList);

		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);

	}
}
