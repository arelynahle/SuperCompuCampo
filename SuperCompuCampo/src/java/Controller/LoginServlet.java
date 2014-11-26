/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Login;
import dataAccess.LoginDAO;
import dataAccess.ConnectionDB;
import java.io.*;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 *
 * @author Carlos Gerardo
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        ConnectionDB connection = new ConnectionDB();
        Connection con = connection.getConnectionDB();
        String address = null;
        LoginDAO dao = new LoginDAO(con);
        String nombre_usu = request.getParameter("nombre_usu");
        String contrasena_usu = request.getParameter("contrasena_usu");
        Login usuarioTemp = dao.validaLogin(nombre_usu, contrasena_usu);

        if (usuarioTemp == null) {
           //ERROR 
            address = "noregistrado.jsp";

        } else {

            address = "miinstitucion.jsp";
        }

        request.setAttribute("usuarioTemp", usuarioTemp);
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }

}
