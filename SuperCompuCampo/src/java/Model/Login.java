/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Carlos Gerardo
 */
public class Login {

    private int id_usu;
    private String nombre_usu, contrasena_usu, email_usu;

    public Login(
            String nombre_usu,
            String contrasena_usu,
            String email_usu) {

        this.id_usu = id_usu;
        this.nombre_usu = nombre_usu;
        this.contrasena_usu = contrasena_usu;
        this.email_usu = email_usu;

    }

    public Login() {

    }

    public int getid_usu() {
        return (id_usu);
    }

    public String getnombre_usu() {
        return (nombre_usu);
    }

    public String getcontrasena_usu() {
        return (contrasena_usu);
    }

    public String getemail_usu() {
        return (email_usu);
    }

    public void setid_usu(int id_usu) {
        this.id_usu = id_usu;

    }

    public void setnombre_usu(String nombre_usu) {
        this.nombre_usu = nombre_usu;
    }

    public void setcontrasena_res(String contrasena_usu) {
        this.contrasena_usu = contrasena_usu;
    }

    public void setemail_usu(String email_usu) {
        this.email_usu = email_usu;
    }

}
