<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Track Employee</title>
<link rel="stylesheet" type="text/css" href="home.css">
</head>
<h1>Welcome Buddy!!</h1>
<h2>Choose what you wanted to do from the below options</h2>
<body>
	<form action="insertEmployee">
		<button id="insertEmp" value="Add Employee">Add Employee</button>
	</form>
	<form action="deleteEmployee">
		<button id="deleteEmp" value="Delete Employee">Delete Employee</button>
	</form>
	<form action="viewEmployeeDetails">
		<button id="viewEmp" value="View Employee Details">View Employee Details</button>
	</form>
</body>
</html>