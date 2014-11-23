package Model;

/**
 *
 * @author Carlos Gerardo
 */
public class Director {

    private int id_dir;
    private String nombre_dir;
    private String ap_dir;
    private String am_dir;
    private String cel_dir;
    private String email_dir;

    public Director(
            String nombre_dir,
            String ap_dir,
            String am_dir,
            String cel_dir,
            String email_dir) {

        //this.id_dir = id_dir;
        this.nombre_dir = nombre_dir;
        this.ap_dir = ap_dir;
        this.am_dir = am_dir;
        this.cel_dir = cel_dir;
        this.email_dir = email_dir;
    }

    public Director() {

    }

    public int getid() {
        return (id_dir);
    }

    public String getnombre() {
        return (nombre_dir);
    }

    public String getap() {
        return (ap_dir);
    }

    public String getam() {
        return (am_dir);
    }

    public String getcelular() {
        return (cel_dir);
    }

    public String getemail() {
        return (email_dir);
    }

    public void setid(int id_dir) {
        this.id_dir = id_dir;

    }

    public void setnombre(String nombre_dir) {
        this.nombre_dir = nombre_dir;
    }

    public void setap(String ap_dir) {
        this.ap_dir = ap_dir;
    }

    public void setam(String am_dir) {
        this.am_dir = am_dir;
    }

    public void setcel(String cel_dir) {
        this.cel_dir = cel_dir;
    }

    public void setemail(String email_dir) {
        this.email_dir = email_dir;
    }



     
     
     
     
     
     
     
    
    
    
    
    
    
    
    
    
    
    
}
