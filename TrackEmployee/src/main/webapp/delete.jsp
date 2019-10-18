<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee Details Here</title>
<link rel="stylesheet" type="text/css" href="home.css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<div class="centered">
	<h1>Delete Employee Details</h1>
</div>
<h2>Give the ID and press delete button to delete an employee</h2>
</head>
<body>
	<form action="deleteEmployee">
		<input id="deleteId" type="number" name="deleteId">
		<button id="deleteButton">Delete Employee</button>
	</form>
	<!-- 	<div class="grid-container"> -->
	<!-- 		<div class="grid-item">1</div> -->
	<!-- 		<div class="grid-item">2</div> -->
	<!-- 		<div class="grid-item">3</div> -->
	<!-- 		<div class="grid-item">4</div> -->
	<!-- 		<div class="grid-item">5</div> -->
	<!-- 		<div class="grid-item">6</div> -->
	<!-- 		<div class="grid-item">7</div> -->
	<!-- 		<div class="grid-item">8</div> -->
	<!-- 		<div class="grid-item">9</div> -->
	<!-- 	</div> -->
	<form action="viewEmployeeDetails">
		<table id="employeeTable" border="1"
			class="table table-dark table-striped">
			<th>Select record(s)</th>
			<th>Id</th>
			<th>Name</th>
			<th>Date Of Joining</th>
			<th>Number of Interviews Scheduled</th>
			<th>Upcoming Interviews scheduled</th>
			<th>Clients Attended</th>
			<th>Comments</th>

			<c:forEach var="emp" items="${listEmp}" varStatus="status">
				<tr>
					<td><input type="checkbox" /></td>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.doj}</td>
					<td>${emp.numberOfInterviewsScheduled}</td>
					<td>${emp.upcomingInterviews}</td>
					<td>${emp.clientsAttended}</td>
					<td>${emp.comments}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>