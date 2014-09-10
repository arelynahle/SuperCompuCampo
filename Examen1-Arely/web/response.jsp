<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : response
    Created on : Sept 10, 2014, 12:44:27 PM
    Author     : arelynahle
--%>
<sql:query var="directorQuery" dataSource="jdbc/Tec">
    SELECT * FROM Director, Carrera WHERE Director.Carrera= ? <sql:param value="${param.ClaveCarrera}"/>
</sql:query>
    
<c:set var="directorDetails" value="${directorQuery.rows[0]}"/>    
    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>${directorDetails.ClaveCarrera}</title>
    </head>
    <body>
        <table border="0">
    <thead>
        <tr>
            <th colspan="2">${directorDetails.ClaveCarrera}</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><strong>Director: </strong></td>
            <td><strong>${directorDetails.Nombre}</strong>
            </td>
        </tr>
    </tbody>
</table>
    </body>
</html>
