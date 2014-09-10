<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : response
    Created on : Sep 10, 2014, 12:55:29 PM
    Author     : usuario
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
        <title>Response</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <table border="0">
            <thead>
                <tr>
                    <th colspan="2">${directorDetails.name}</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><strong>Director de la carrera </strong></td>
                    <td><strong>${directorDetails.nombre}</strong>
                        <br><span style="font-size:smaller; font-style:italic;">
                </tr>
            </tbody>
        </table>
    </body>
</html>
