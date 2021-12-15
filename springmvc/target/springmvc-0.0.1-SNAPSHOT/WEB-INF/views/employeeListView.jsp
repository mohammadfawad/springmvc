<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "com.springframework.springmvc.DTO.Employee,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Employee> employeeList	= (List<Employee>) request.getAttribute("employeeList");
		for(Employee employee:employeeList){
			out.print(employee + "<br>");
		}
	
	%>
</body>
</html>