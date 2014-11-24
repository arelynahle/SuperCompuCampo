package dataAccess;

import java.sql.*;

public class ConnectionDB {
  
    private Connection connection = null;
  
  public ConnectionDB() {
     try {
/*    Class.forName("com.mysql.jdbc.Driver");
      String url = "jdbc:mysql://"+host+":3306/Usuarios";
        String user = "root";
        String password = "mysql";
*/   
        
      String host = "localhost"; 
      Class.forName("org.postgresql.Driver");
     String url = "jdbc:postgresql://"+host+":5432/SCC", 
            user="postgres",
            password="appdev";  
    connection = DriverManager.getConnection(url, user, password);
    Statement statement = connection.createStatement();
    
     } catch (SQLException sqle){
       sqle.printStackTrace();
     } catch (Exception e){
       e.printStackTrace();
     }
   }
  
  public ConnectionDB(String driver, String url, String user, String password) {
       try {
      Class.forName(driver);
      connection = DriverManager.getConnection(url, user, password);
       } catch (SQLException sqle){
         sqle.printStackTrace();
       } catch (Exception e){
         e.printStackTrace();
       }
     }
  
   public Connection getConnectionDB() {
     return connection;
   }
   
   public void setConnectionDB(Connection connection) {
     this.connection = connection;
   }
   
   public void closeConnectionDB(){
      if (connection!=null) {
        try {
             connection.close();
          }
          // process SQLException on close operation
         catch ( SQLException sqlException ) {
              sqlException.printStackTrace();
          }
      }
  }
}