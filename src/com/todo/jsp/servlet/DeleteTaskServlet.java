package com.todo.jsp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TaskClass;

public class DeleteTaskServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<TaskClass> todoList = (ArrayList<TaskClass>) request.getSession().getAttribute("todoList");
		ArrayList<TaskClass> removeList = new ArrayList<TaskClass>();
		

		
		for (TaskClass task : todoList) {
			

			if (task.getTitle().equals(request.getParameter(task.getTitle())) && task.getDate().equals(request.getParameter(task.getDate()))) {

				removeList.add(task);
				
			}

		}
		for (TaskClass rem : removeList) {
			todoList.remove(rem);

		}

		request.getSession().setAttribute("todoList", todoList);
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

}
