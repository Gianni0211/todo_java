<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

.todo-list {
	margin-top: 30px;
}
}
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>todo</title>


</head>
<body>

	<div align="center" style="margin-top: 50px;">

		<form action="addtodo_servlet">
			<div class="input-container">
				<label for="todo" class="label">Inserisci un'attività</label> <input
					id="todo" type="text" name="todo" placeholder="e.s. Fare la spesa" />
			</div>

			<button type="submit" class="btn">Aggiungi attività</button>

		</form>



		<div class="todo-list" id="result"></div>
		<p>${requestScope.res }</p>
		
		
		

	</div>



</body>