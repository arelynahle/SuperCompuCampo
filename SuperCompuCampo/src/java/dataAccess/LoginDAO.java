/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;

import Model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Carlos Gerardo
 */
public class LoginDAO {

    private PreparedStatement statement;
    private Connection connection;

    public LoginDAO() {
    }

    public LoginDAO(Connection connection) {
        this.connection = connection;
        try {
            PreparedStatement s = connection.prepareStatement("set search_path=perfilesusuarios,pg_catalog,public");
            s.execute();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Login validaLogin(String nombre_usu, String contrasena_usu) {
        Login login = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM usuario WHERE nombre_usu = ? AND contrasena_usu =?");
            statement.setString(1, nombre_usu);
           statement.setString(2, contrasena_usu);
            // obtain user
            synchronized (statement) {
                ResultSet results = statement.executeQuery();
		// get rows data{
                // if (user.getnombre_usu().contentEquals("nombre_usu") && user.getcontrasena_usu().contentEquals("contrasena_usu"))
                //if(user.equals("nombre_usu") && user.equals("contrasena_usu"))
                while (results.next()) {
                    login = new Login();
                    login.setnombre_usu(results.getString("nombre_usu"));
                    login.setcontrasena_res(results.getString("contrasena_usu"));
                }

            }
            statement.close();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return login;
    }

}
