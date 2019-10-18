<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee here</title>
<link rel="stylesheet" type="text/css" href="home.css">
</head>
<div class="centered">
	<h1>Add Employee Details</h1>
</div>
<body>
	<form action="insertEmployee">
		<div id="details">
			<label id="idLabel">ID :</label> <input id="id" type="number"
				name="id"> <label id="nameLabel">Name :</label> <input
				id="name" type="text" name="name"> <label id="dojLabel">Date
				of Joining :</label> <input id="doj" type="text" name="doj"> <label
				id="noiLabel">Number of Interviews Scheduled :</label> <input
				id="noi" type="number" name="numberOfInterviewsScheduled"> <label
				id="uiLabel">Upcoming Interviews scheduled :</label> <input id="ui"
				type="text" name="upcomingInterviews"> <label id="caLabel">Clients
				Attended :</label> <input id="ca" type="text" name="clientsAttended">
			<label id="commentsLabel">Comments:</label>
			<textarea id="comments" rows="4" cols="50" name="comments"></textarea>
			<button id="insertEmpButton" value="Add Employee">Insert
				Employee</button>
		</div>
	</form>
	<form action="/">
		<button id="backHome">Home</button>
	</form>
</body>
</html>