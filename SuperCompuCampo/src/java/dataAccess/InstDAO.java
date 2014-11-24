package dataAccess;

import Model.Institucion;
import Model.Responsable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InstDAO {
	private PreparedStatement statement;
	private Connection connection;
	
	public InstDAO(){
		
	}
	
	public InstDAO(Connection  connection){
      this.connection = connection;
	  try {
		  PreparedStatement s = connection.prepareStatement("set search_path=perfilesusuarios,pg_catalog,public");
		  s.execute();
	  } catch (SQLException sqle){
	    	 sqle.printStackTrace();
	  } catch (Exception e){
	    	 e.printStackTrace();
	  }
	}

	public Connection getConnection(){
		return connection;
	}
		
	public void setConnection(Connection connection){
	   this.connection = connection;
	}
	
	 public void addInst (Institucion institucion)  {
		 try {
		   statement = connection.prepareStatement("INSERT INTO institucion (nombre_inst, calle_inst,numero_inst,colonia_inst,cp_inst,ciudad_inst,estado_inst, tel_inst,max_ninos_inst, nombre_dir, ap_dir, am_dir, cel_dir,email_dir) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		   synchronized(statement) {
			   //statement.setInt(1, institucion.getid_inst());
			   statement.setString(1, institucion.getnombre_inst());
			   statement.setString(2, institucion.getcalle_inst());
                           statement.setInt(3, institucion.getnumero_inst());
			   statement.setString(4, institucion.getcolonia_inst());
                           statement.setInt(5, institucion.getcp_inst());
                           statement.setString(6, institucion.getciudad_inst());
                           statement.setString(7, institucion.getestado_inst());
                           statement.setString(8, institucion.gettel_inst());
                           statement.setInt(9, institucion.getmax_ninos_inst());
                           statement.setString(10, institucion.getnombre_dir());
                           statement.setString(11, institucion.getap_dir());
                           statement.setString(12, institucion.getam_dir());
                           statement.setString(13, institucion.getcel_dir());
                           statement.setString(14, institucion.getemail_dir());
			   statement.executeUpdate();
		   }
		   statement.close();
		 } catch(SQLException sqle){
			 System.out.println(sqle);
		 }
		   
	   }
         
           public ArrayList<Institucion> getInstitucionList() {	
		    ArrayList<Institucion> institucionList = new ArrayList<Institucion>();
		    try {
		         statement = connection.prepareStatement("SELECT * FROM institucion");	   
		         // obtain list of users
		         synchronized(statement) {
		            ResultSet results = statement.executeQuery();
		            // get rows data{
		            while (results.next()) {
			           Institucion institucion = new Institucion();
                                   institucion.setnombre_inst(results.getString("nombre_inst"));
                                   institucion.setcalle_inst(results.getString("calle_inst"));
                                   institucion.setnumero_inst(results.getInt("numero_inst"));
                                   institucion.setcolonia_inst(results.getString("colonia_inst"));
                                   institucion.setcp_inst(results.getInt("cp_inst"));
                                   institucion.setciudad_inst(results.getString("ciudad_inst"));
                                   institucion.setestado_inst(results.getString("estado_inst"));
                                   institucion.settel_inst(results.getString("tel_inst"));
                                   institucion.setmax_ninos_inst(results.getInt("max_ninos_inst"));
                                   institucion.setnombre_dir(results.getString("nombre_dir"));
                                   institucion.setap_dir(results.getString("ap_dir"));
                                   institucion.setam_dir(results.getString("am_dir"));
                                   institucion.setcel_dir(results.getString("cel_dir"));
                                   institucion.setemail_dir(results.getString("email_dir"));
			           institucionList.add(institucion);
		            }
		        }
		        statement.close();
		    } catch(SQLException sqle){
				 System.out.println(sqle);
			}	   
		    return institucionList;
	   }

           	 public void addRes (Responsable responsable)  {
		 try {
		   statement = connection.prepareStatement("INSERT INTO responsable (nombre_res, ap_res,am_res,cel_res) VALUES(?,?,?,?)");
		   synchronized(statement) {
                           //statement.setInt(1, responsable.getid_res());
                           statement.setString(1, responsable.getnombre_res());
			   statement.setString(2, responsable.getap_res());
                           statement.setString(3, responsable.getam_res());
                           statement.setString(4, responsable.getcel_res());
			   statement.executeUpdate();
		   }
		   statement.close();
		 } catch(SQLException sqle){
			 System.out.println(sqle);
		 }
		   
	   }
           
           
           
}