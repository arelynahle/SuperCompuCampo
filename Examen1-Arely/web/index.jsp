<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : Aug 27, 2014, 12:24:36 PM
    Author     : arelynahle
--%>
<sql:query var="carreras" dataSource="jdbc/Tec">
    SELECT ClaveCarrera,NombreCarrera  FROM Carrera
</sql:query>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h1>Bienvenido</h1>
        <table border="0">
            <thead>
                <tr>
                    <th>Arely Nahle Balandrano</th>
                </tr>
                <tr>
                    <th>949755</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <form action="response.jsp">
                            <strong>Selecciona carrera:</strong>
                            <select name="ClaveCarrera">
                                <c:forEach var="row" items="${carreras.rows}">
                                    <option value="${row.ClaveCarrera}">${row.ClaveCarrera}</option>
                                </c:forEach>
                            </select>    
                            <input type="submit" value="submit" />
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
