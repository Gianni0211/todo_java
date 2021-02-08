package com.todo.jsp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TaskClass;

public class UpdateServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		TaskClass todo = (TaskClass) request.getSession().getAttribute("todo");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String priority = request.getParameter("priority");
		String date = (String) request.getParameter("date");
		ArrayList<TaskClass> todoList = (ArrayList<TaskClass>) request.getSession().getAttribute("todoList");
		for (TaskClass task : todoList) {

			if (task.getTitle().equals(todo.getTitle())) {

				task.setTitle(title);
				task.setDescription(description);
				task.setPriority(priority);
				task.setDate(date);
				
			}

		}
		request.getSession().setAttribute("todoList", todoList);
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

}
