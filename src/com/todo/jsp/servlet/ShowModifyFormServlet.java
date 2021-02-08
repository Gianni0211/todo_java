package com.todo.jsp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TaskClass;

public class ShowModifyFormServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<TaskClass> todoList = (ArrayList<TaskClass>) request.getSession().getAttribute("todoList");

		TaskClass todo;
		for (TaskClass task : todoList) {

			if (task.getTitle().equals(request.getParameter(task.getTitle()))) {
				todo = new TaskClass(task.getTitle(), task.getDescription(), task.getPriority(), task.getDate());
				request.getSession().setAttribute("todo", todo);

				
			}

		}

		request.getSession().setAttribute("todoList", todoList);
		

		RequestDispatcher rd = request.getRequestDispatcher("/form.jsp");
		
		
		rd.forward(request, response);
	}
}
