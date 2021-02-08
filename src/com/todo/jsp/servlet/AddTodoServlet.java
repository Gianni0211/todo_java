package com.todo.jsp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TaskClass;

public class AddTodoServlet extends HttpServlet {

	public ArrayList<TaskClass> todoList = new ArrayList<TaskClass>();

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		while (request.getParameter("title").equals("") && request.getParameter("date").equals("")) {
			request.setAttribute("resp", "Inserisci un titolo e una data validi");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String priority = request.getParameter("priority");
		String date = (String) request.getParameter("date");
		
		TaskClass todo = new TaskClass(title, description, priority, date);
		todoList.add(todo);

		

		

		request.setAttribute("todoList", todoList);
		RequestDispatcher rd = request.getRequestDispatcher("/showall_servlet");
		rd.forward(request, response);

	}

}
