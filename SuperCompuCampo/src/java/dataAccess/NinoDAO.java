package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Nino;
import Model.Responsable;
import Model.Institucion;
import Model.Contacto;
import Model.Detalle;

public class NinoDAO {
	private PreparedStatement statement;
	private Connection connection;
	
	public NinoDAO(){
		
	}
	
	public NinoDAO(Connection  connection){
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
	
	 public void addNino (Nino nino)  {
		 try {
		   statement = connection.prepareStatement("INSERT INTO nino VALUES(?,?,?,?,?,?,?,?,?,?,?)");
		   synchronized(statement) {
			   statement.setInt(1, nino.getid_nino());
			   statement.setString(2, nino.getnombre_nino());
			   statement.setString(3, nino.getap_nino());
			   statement.setString(4, nino.getam_nino());
                           statement.setInt(5, nino.getedad_cron());
                           statement.setString(6, nino.getmodeloplayera_nino());
                           statement.setString(7, nino.gettallaplayera_nino());

			   statement.executeUpdate();
		   }
		   statement.close();
		 } catch(SQLException sqle){
			 System.out.println(sqle);
		 }
		   
	   }

}