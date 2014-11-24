package Model;

/**
 * 
 * @author Carlos Gerardo
 */
public class Responsable {
    
    private int id_res;
    private String nombre_res, ap_res, am_res, cel_res;
    
    public Responsable(
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
     
      public int getid_res() {
        return (id_res);
    }

    public String getnombre_res() {
        return (nombre_res);
    }

    public String getap_res() {
        return (ap_res);
    }

    public String getam_res() {
        return (am_res);
    }

    public String getcel_res() {
        return (cel_res);
    }
    
    public void setid_res(int id_res) {
        this.id_res = id_res;

    }

    public void setnombre_res(String nombre_res) {
        this.nombre_res = nombre_res;
    }

    public void setap_res(String ap_res) {
        this.ap_res = ap_res;
    }

    public void setam_res(String am_res) {
        this.am_res = am_res;
    }

    public void setcel_res(String cel_res) {
        this.cel_res = cel_res;
    }

}
