package com.todo.jsp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TaskClass;

public class DeleteAllServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		while (request.getSession().getAttribute("todoList") == null) {
			request.setAttribute("resp", "Non ci sono task da cancellare");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}
		ArrayList<TaskClass> todoList = (ArrayList<TaskClass>) request.getSession().getAttribute("todoList");
		todoList.removeAll(todoList);

		request.getSession().setAttribute("todoList", todoList);

		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

}
