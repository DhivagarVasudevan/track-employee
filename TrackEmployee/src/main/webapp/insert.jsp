<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee here</title>
<link rel="stylesheet" type="text/css" href="home.css">
</head>
<h1>Add Employee Details</h1>
<body>
	<form action="insertEmployee">
		<label id="idLabel">ID :</label> <input id="id" type="number"
			name="Id"> <label id="nameLabel">Name :</label> <input
			id="name" type="text" name="name"> <label id="dojLabel">Date
			of Joining :</label> <input id="doj" type="text" name="doj"> <label
			id="noiLabel">Number of Interviews Scheduled :</label> <input
			id="noi" type="number" name="numberOfInterviewsScheduled"> <label
			id="uiLabel">Upcoming Interviews scheduled :</label> <input id="ui"
			type="text" name="upcomingInterviews"> <label id="caLabel">Clients
			Attended :</label> <input id="ca" type="text" name="clientsAttended">
		<button id="insertEmpButton" value="Add Employee">Insert
			Employee</button>
	</form>
</body>
</html>