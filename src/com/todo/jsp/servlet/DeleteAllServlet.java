package com.todo.jsp.servlet;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteAllServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<String> todoList=(ArrayList<String>)request.getSession().getAttribute("todoList");
		todoList.removeAll(todoList);
		response.sendRedirect(request.getContextPath() + "/index.jsp");
	}
	
	

}
