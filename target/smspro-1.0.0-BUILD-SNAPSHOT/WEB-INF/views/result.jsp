<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EDU 903 AND 803 RESULT 2016/2017 SESSION</title>

<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>

	<fieldset>

		<legend>
			<center>EDU 803 AND EDU 903 RESULT</center>
			<button type="button" class="btn btn-primary" onclick="location.href='/smspro/saveName'">Add name to Student data</button> 
			
		</legend>
		<div class="form-inline">
			<form class="form-row align-items-center" method="get" action="${pageContext.request.contextPath}/saveCa">
				
				<div class="col-auto">
					<label for="formGroupExampleInput">UJ/2016/PGED/</label> 
				</div>
				
				<div class="col-auto">
					<input type="text" name="matNo" class="form-control" id="formGroupExampleInput" placeholder="0000" />
				</div>
				
				<div class="col-auto">
					<label for="formGroupExampleInput">C.A Score</label>
				</div>

				<div class="col-auto">
					<input type="text" name="ca" class="form-control" id="formGroupExampleInput" placeholder="C.A score" />
				</div>

				<button type="submit" class="btn btn-primary mb-2">Input C/A Score</button>
			</form>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
				<p>&nbsp;</p>
			<div>
			
			<form method="get" action="${pageContext.request.contextPath}/searchStudent">
				<div class="form-row align-items-center">
					<div class="col-auto">
						<label class="sr-only" for="inlineFormInput">Name</label> 
						<input type="text" name="searchString" class="form-control mb-2" id="inlineFormInput" placeholder="Search by MatNo">
					</div>

					<div class="col-auto">
						<button type="submit" class="btn btn-primary mb-2">Search</button>
					</div>
				</div>
			</form>
			</div>

		</div>
	</fieldset>
<c:if test="${!empty listOfStudents}">

	<table class="table">
		<thead class="thead-light">
			<tr>
				<th scope="col">S/NO</th>
				<th scope="col">NAME</th>
				<th scope="col">MAT NO</th>
				<th scope="col">CA</th>
				<th scope="col">EXAM</th>
				<th scope="col">DEGREE</th>
				<th scope="col">DEPARTMENT</th>
				
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>

			</tr>
		</thead>
		<tbody>
		
		<c:forEach items="${listOfStudents}" var="students">
			<tr>
				<th scope="row">${students.serialNo}</th>
				<td>${students.name}</td>
				<td>${students.matNo}</td>
				<td>${students.ca}</td>
				<td>${students.exam}</td>
				<td>${students.degree}</td>
				<td>${students.department}</td>
				
				<td><a href="<c:url value='/editStudent/${students.serialNo}'/>"><img src="<c:url value="/resources/img/edit.png" />"/></a></td>
				<td><a href="<c:url value='/deleteStudent/${students.serialNo}'/>"><img src="<c:url value="/resources/img/delete.png" />"/></a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	</c:if>


	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>

</body>
</html>