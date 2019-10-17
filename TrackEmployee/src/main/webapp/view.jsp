<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="home.css">
</head>
<body>
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
		<table border="1">

			<th>Id</th>
			<th>Name</th>
<!-- 			<th>Designation</th> -->
<!-- 			<th>Department</th> -->
<!-- 			<th>Salary</th> -->
<!-- 			<th>Location</th> -->

			<c:forEach var="emp" items="${listEmp}" varStatus="status">
				<tr>
					<td>${emp.Id}</td>
					<td>${emp.name}</td>
<%-- 					<td>${emp.doj}</td> --%>
<%-- 					<td>${emp.numberOfInterviewsScheduled}</td> --%>
<%-- 					<td>${emp.upcomingInterviews}</td> --%>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>