package Controller;

import Model.Institucion;
import dataAccess.ConnectionDB;
import dataAccess.InstDAO;
import java.io.*;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/InstServlet")
public class InstServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        ConnectionDB connection = new ConnectionDB();
        Connection con = connection.getConnectionDB();
        String address = null;
        InstDAO dao = new InstDAO(con);
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        if (opcion == 1)
        {
            String nombre_inst = request.getParameter("nombre_inst");
            String calle_inst = request.getParameter("calle_inst");
            int numero_inst = Integer.parseInt(request.getParameter("numero_inst"));
            String colonia_inst = request.getParameter("colonia_inst");
            int cp_inst = Integer.parseInt(request.getParameter("cp_inst"));
            String ciudad_inst = request.getParameter("ciudad_inst");
            String estado_inst = request.getParameter("estado_inst");
            String tel_inst = request.getParameter("tel_inst");
            int max_ninos_inst = Integer.parseInt(request.getParameter("max_ninos_inst"));
            String nombre_dir = request.getParameter("nombre_dir");
            String ap_dir = request.getParameter("ap_dir");
            String am_dir = request.getParameter("am_dir");
            String cel_dir = request.getParameter("cel_dir");
            String email_dir = request.getParameter("email_dir");

            Institucion instNueva = new Institucion (nombre_inst, calle_inst,numero_inst, colonia_inst, cp_inst, ciudad_inst, estado_inst,tel_inst, max_ninos_inst, nombre_dir,ap_dir,am_dir,cel_dir,email_dir);
            dao.addInst(instNueva);            
            request.setAttribute("instTemp", instNueva);
            address = "displayNewInst.jsp";
        }
        /*else if (opcion==2)
         {
         String email = request.getParameter("email");
         user usuarioTemp = dao.searchUser(email);
         if (usuarioTemp==null){
         address="unknown.jsp";
         }
         else if (usuarioTemp.getAge()<12){
         address="kid.jsp";
         }
         else if (usuarioTemp.getAge()>=12 && usuarioTemp.getAge()<=18){
         address="teen.jsp";
         }
         else if (usuarioTemp.getAge()>18){
         address="adult.jsp";
         }
         request.setAttribute("usuarioTemp", usuarioTemp);
         }*/
         else if (opcion==3)
         {
         ArrayList<Institucion> userListServelet=dao.getInstitucionList();
         request.setAttribute("institucionList", userListServelet);
         address="miinstitucion.jsp";   
         }

        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
}
