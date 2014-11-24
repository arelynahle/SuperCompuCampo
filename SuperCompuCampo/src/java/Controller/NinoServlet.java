package Controller;

import Model.Nino;
import Model.Institucion;
import Model.Responsable;
import Model.Detalle;
import dataAccess.ConnectionDB;
import dataAccess.NinoDAO;
import java.io.*;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/NinoServlet")
public class NinoServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        ConnectionDB connection = new ConnectionDB();
        Connection con = connection.getConnectionDB();
        String address = null;
        NinoDAO dao = new NinoDAO(con);
        //int opcion = Integer.parseInt(request.getParameter("opcion"));

        //if (opcion == 1)
        
            //int id_nino = Integer.parseInt(request.getParameter("id_nino"));
            String nombre_nino = request.getParameter("nombre_nino");
            String ap_nino = request.getParameter("ap_nino");
            String am_nino = request.getParameter("am_nino");
            int edad_cron = Integer.parseInt(request.getParameter("edad_cron"));
            String modeloplayera_nino = request.getParameter("modelo_playera_nino");
            String tallaplayera_nino = request.getParameter("talleraplayera_nino");
            
            //Otros datos
            //int id_inst = Integer.parseInt(request.getParameter("id_inst"));
            //int id_res = Integer.parseInt(request.getParameter("id_res"));
            //int id_con = Integer.parseInt(request.getParameter("id_con"));
            //int id_det = Integer.parseInt(request.getParameter("id_det"));
            
            Nino ninoNuevo = new Nino (nombre_nino, ap_nino, am_nino, edad_cron, modeloplayera_nino, tallaplayera_nino);
            dao.addNino(ninoNuevo);
            request.setAttribute("ninoTemp", ninoNuevo);
            address = "displayNewMember.jsp";
            
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
         }
         else if (opcion==3)
         {
         ArrayList<user> userListServelet=dao.getUserList();
         request.setAttribute("userList", userListServelet);
         address="displayAll.jsp";   
         }*/

        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
}
