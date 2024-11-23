<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Curso</th>
                <th>Promedio</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td>${alumno.id}</td>
                    <td>${alumno.nombre}</td>
                    <td>${alumno.curso}</td>
                    <td>${alumno.promedio}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>