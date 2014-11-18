<%-- 
    Document   : displayNewMember
    Created on : Oct 26, 2014, 7:11:40 PM
    Author     : RolandoAHT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Niño</title>
    </head>
    <body>
        <h1>Niño agregado satisfactoriamente</h1>
        <table cellspacing="5" cellpadding="5" border="1">
            
            <tr>
                <td>Nombre</td>
                <td>${ninoTemp.nombre_nino}</td>
            </tr>
            <tr>
                <td>Apellido Paterno</td>
                <td>${ninoTemp.ap_nino}</td>
            </tr>
            <tr>
                <td>Apellido Materno</td>
                <td>${ninoTemp.am_nino}</td>
            </tr>
            <tr>
                <td>Edad</td>
                <td>${ninoTemp.edad_cron}</td>
            </tr>
            <tr>
                <td>Modelo Playera</td>
                <td>${ninoTemp.modeloplayera_nino}</td>
            </tr>
            <tr>
                <td>Talla Playera</td>
                <td>${ninoTemp.tallaplayera_nino}</td>
            </tr>
        </table>
    </body>
</html>
