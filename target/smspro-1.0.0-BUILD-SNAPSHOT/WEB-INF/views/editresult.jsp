<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>edit result here</title>

<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<form:form method="post" modelAttribute="student" action="${pageContext.request.contextPath}/editStudent">
		<div style="width: 600px; margin-top: 50px; margin-left: 100px; align: center">

			<div class="form-group row">
				<form:hidden path="serialNo" />
				<form:label path="name" class="col-sm-2 col-form-label">Name</form:label>
				<div class="col-sm-10">
					<form:input path="name" class="form-control" id="name"
						placeholder="name"></form:input>
				</div>
			</div>
			<div class="form-group row">
				<form:label path="matNo" class="col-sm-2 col-form-label">Mat No: </form:label>
				<div class="col-sm-10">
					<form:input path="matNo" class="form-control" id="matNo"
						placeholder="Mat No"></form:input>
				</div>
			</div>
			<div class="form-group row">
				<form:label path="ca" class="col-sm-2 col-form-label">C.A Score: </form:label>
				<div class="col-sm-10">
					<form:input path="ca" class="form-control" id="ca"
						placeholder="C.A"></form:input>
				</div>
			</div>
			<div class="form-group row">
				<form:label path="exam" class="col-sm-2 col-form-label">EXAM SCORE: </form:label>
				<div class="col-sm-10">
					<form:input path="exam" class="form-control" id="exam" placeholder="exam"></form:input>
				</div>
			</div>
			<div class="form-group row">
				<form:label path="department" class="col-sm-2 col-form-label">Department: </form:label>
				<div class="col-sm-10">
					<form:input path="department" class="form-control" id="department" 	placeholder="department"></form:input>
				</div>
			</div>

			<div class="form-group row">
				<form:label path="degree" class="col-sm-2 col-form-label">Degree: </form:label>
				<div class="col-sm-10">
					<form:input path="degree" class="form-control" id="degree" placeholder="degree"></form:input>
				</div>
			</div>

		<div class="form-group row">
				<div class="col-sm-10">
					<button type="submit" class="btn btn-primary">Save</button>
					<button type="button" class="btn btn-primary" onclick="location.href='/smspro/'">Return to results</button>

				</div>
			</div>
		</div>
	</form:form>

</body>
</html>