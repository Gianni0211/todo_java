<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body {
	background-image:
		url('https://cdn.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}

.input-container {
	display: flex;
	flex-direction: column;
	width: 200px;
	margin: 10px 0 20px 0;
}

.label {
	margin-bottom: 15px;
}

input {
	padding: 5px 10px 5px 10px;
	border-radius: 10px;
}

.btn {
	background-color: rgba(137, 196, 244, 1);
	padding: 3px 6px 3px 6px;
	border-radius: 10px;
}
.btn-remove{
    background-color: red;
	padding: 3px 6px 3px 6px;
	border-radius: 10px;
	color: white;

}


.todo-list {
	margin-top: 30px;
}

.result{
   outline: none;
   display: inline;
   margin-top: 10px;
   background: none;
   border: none;
}


</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>todo</title>


</head>
<body>

	<div align="center" style="margin-top: 50px;">

		<form>
			<div class="input-container">
				<label for="title" class="label">Inserisci il titolo</label> <input
					id="title" type="text" value="${sessionScope.todo.title}" name="title" placeholder="e.s. Fare la spesa" />
				<label for="description" class="label">Inserisci il titolo</label>
				 <textarea id="description" rows="4"  cols="50" name="description">${sessionScope.todo.description }</textarea>
				<label for="priority" class="label">Seleziona una priorita</label>
				 <select id="priority" name="priority">
					<option value="Bassa">Bassa</option>
					<option value="Media">Media</option>
					<option value="Alta">Alta</option>
				 </select>
				<label for="date" class="label">Inserisci una data</label> 
				<input id="date" value="${sessionScope.todo.date }" type="date" name="date" />
			</div>

			<button type="submit" formaction="update_servlet" class="btn">Modifica</button>
			
			

		</form>



		
		
		
		

	</div>