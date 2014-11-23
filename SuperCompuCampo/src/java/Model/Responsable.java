package Model;

/**
 * 
 * @author Carlos Gerardo
 */
public class Responsable {
    
    private int id_res;
    private String nombre_res;
    private String ap_res;
    private String am_res;
    private String cel_res;
    
    
    public Responsable(int id_res,
            String nombre_res,
            String ap_res,
            String am_res,
            String cel_res) {

        this.id_res = id_res;
        this.nombre_res = nombre_res;
        this.ap_res = ap_res;
        this.am_res = am_res;
        this.cel_res = cel_res;
        
    }
    
     public Responsable() {

    }
     
      public int getid() {
        return (id_res);
    }

    public String getnombre() {
        return (nombre_res);
    }

    public String getap() {
        return (ap_res);
    }

    public String getam() {
        return (am_res);
    }

    public String getcelular() {
        return (cel_res);
    }
    
    public void setid(int id_res) {
        this.id_res = id_res;

    }

    public void setnombre(String nombre_res) {
        this.nombre_res = nombre_res;
    }

    public void setap(String ap_res) {
        this.ap_res = ap_res;
    }

    public void setam(String am_res) {
        this.am_res = am_res;
    }

    public void setcel(String cel_res) {
        this.cel_res = cel_res;
    }

}
