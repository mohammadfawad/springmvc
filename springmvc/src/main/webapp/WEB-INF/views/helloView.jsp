<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="content-Type" content="text/html; charset=UTF-8">
<title>helloView</title>
</head>
<body>
	<h1>Welcome To Spring MVC</h1>
	<%
		out.println("<br>Your IP address is <b>" + request.getRemoteAddr() + " DATE-Time :: "+ (new java.util.Date()).toLocaleString() + "</b><br><br>");
		Integer employeeId = (Integer) request.getAttribute("employeeId");
		String employeeName = (String) request.getAttribute("employeeName");
		Integer employeeSalery = (Integer) request.getAttribute("employeeSalery");
		out.println("<b><i>employeeId = " + employeeId + "\n, employeeName = " + employeeName + "\n, employeeSalery = " + employeeSalery + "</b></i>");
		
	%>
	<h5>employeeId :: <i>${employeeId}</i></h5>
	<h5>employeeName :: <i>${employeeName}</i></h5>
	<h5>employeeSalery :: <i>${employeeSalery}</i></h5>
</body>
</html>