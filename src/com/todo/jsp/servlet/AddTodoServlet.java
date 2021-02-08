package com.todo.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTodoServlet extends HttpServlet {

	public ArrayList<String> todoList = new ArrayList<String>();

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String todo = request.getParameter("todo");
		
		while (todo.equals("")){
			request.setAttribute("res", "Inserisci qualcosa");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}

		todoList.add(todo);

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Lista Attivita</title>");
		out.println("</head>");
		out.println("<div style=\"text-align: center;\"");
		out.println("<body>");
		out.println("<h1>Le tue attività</h1>");
		for (String task : todoList) {
			out.println("<form action=\"deletetask_servlet\">" + "<input style=\"outline:none;\" name=\"" + task + "\""
					+ "value=\"" + task + "\"" + "readonly/>" + "<button type=\"submit\">Rimuovi</button>" + "</form>");
		}
		out.println("<form action=\"returntoform_servlet\">" + "<button type=\"submit\">Aggiungi un'altra task</button>"
				+ "</form>");

		out.println(
				"<form action=\"deleteall_servlet\">" + "<button type=\"submit\">Cancella tutto </button>" + "</form>");
		out.println("</div>");

		request.getSession().setAttribute("todoList", todoList);

	}

}
