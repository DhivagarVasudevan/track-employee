<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Track Employee</title>
<link rel="stylesheet" type="text/css" href="home.css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<div class="centered">
	<h1>Welcome Buddy!! Track your employees here!!</h1>
</div>
<!-- <h2>Choose what you wanted to do from the below options</h2> -->
<body>
	<img id="image" src="optimum.jpg" class="rounded" alt="Cinque Terre"
		width="304" height="236">
	<label id="welcomeId">Welcome Buddy!! Track your employees
		here!!</label>
	<form action="insertEmployee">
		<button id="insertEmp" value="Add Employee" class="btn btn-info">Add
			Employee</button>
	</form>
	<form action="updateEmployee">
		<button id="updateEmp" value="Update Employee" class="btn btn-info">Update
			Employee</button>
	</form>
	<form action="deleteEmployee">
		<button id="deleteEmp" value="Delete Employee" class="btn btn-info">Delete
			Employee</button>
	</form>
	<form action="viewEmployeeDetails">
		<button id="viewEmp" value="View Employee Details"
			class="btn btn-info">View Employee Details</button>
	</form>
</body>
</html>