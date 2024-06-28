<%@ page import="java.io.*, java.net.*, org.json.simple.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of Employees</title>
</head>
<body>
    <h2>List of Employees</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Department</th>
            <th>Project</th>
            <th>Salary</th>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.firstname}</td>
                <td>${employee.lastname}</td>
                <td>${employee.email}</td>
                <td>${employee.phone}</td>
                <td>${employee.department.name}</td>
                <td>${employee.project.project_name}</td>
                <td>${employee.salary.salary}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>