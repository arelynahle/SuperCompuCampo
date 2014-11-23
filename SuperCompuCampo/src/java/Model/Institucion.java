package Model;

/**
 *
 * @author Carlos Gerardo
 */
public class Institucion {

    private int id_inst, numero_inst, cp_inst, max_ninos_inst;
    private String nombre_inst, calle_inst, colonia_inst, ciudad_inst, estado_inst, tel_inst, nombre_dir, ap_dir, am_dir, cel_dir, email_dir;

    public Institucion(
            String nombre_inst,
            String calle_inst,
            int numero_inst,
            String colonia_inst,
            int cp_inst,
            String ciudad_inst,
            String estado_inst,
            String tel_inst,
            int max_ninos_inst,
            String nombre_dir,
            String ap_dir,
            String am_dir,
            String cel_dir,
            String email_dir
    ) {

        this.id_inst = id_inst;
        this.nombre_inst = nombre_inst;
        this.calle_inst = calle_inst;
        this.numero_inst = numero_inst;
        this.colonia_inst = colonia_inst;
        this.cp_inst = cp_inst;
        this.ciudad_inst=ciudad_inst;
        this.estado_inst = estado_inst;
        this.tel_inst = tel_inst;
        this.max_ninos_inst = max_ninos_inst;
        this.nombre_dir = nombre_dir;
        this.ap_dir = ap_dir;
        this.am_dir = am_dir;
        this.cel_dir = cel_dir;
        this.email_dir = email_dir;
    }

    public Institucion() {
    }

    public int getid_inst() {
        return (id_inst);
    }

    public String getnombre_inst() {
        return (nombre_inst);
    }

    public String getcalle_inst() {
        return (calle_inst);
    }

    public int getnumero_inst() {
        return (numero_inst);
    }

    public String getcolonia_inst() {
        return (colonia_inst);
    }

    public int getcp_inst() {
        return (cp_inst);
    }

    public String getciudad_inst() {
        return (ciudad_inst);
    }

    public String getestado_inst() {
        return (estado_inst);
    }

    public String gettel_inst() {
        return (tel_inst);
    }

    public int getmax_ninos_inst() {
        return (max_ninos_inst);
    }

    public String getnombre_dir() {
        return (nombre_dir);
    }

    public String getap_dir() {
        return (ap_dir);
    }

    public String getam_dir() {
        return (am_dir);
    }

    public String getcel_dir() {
        return (cel_dir);
    }

    public String getemail_dir() {
        return (email_dir);
    }

    public void setid_inst(int id_inst) {
        this.id_inst = id_inst;

    }

    public void setnombre_inst(String nombre_inst) {
        this.nombre_inst = nombre_inst;
    }

    public void setcalle_inst(String calle_inst) {
        this.calle_inst = calle_inst;
    }

    public void setnumero_inst(int numero_inst) {
        this.numero_inst = numero_inst;
    }

    public void setcolonia_inst(String colonia_inst) {
        this.colonia_inst = colonia_inst;
    }

    public void setcp_inst(int cp_inst) {
        this.cp_inst = cp_inst;
    }

    public void setciudad_inst(String ciudad_inst) {
        this.ciudad_inst = ciudad_inst;
    }

    public void setestado_inst(String estado_inst) {
        this.estado_inst = estado_inst;
    }

    public void settel_inst(String tel_inst) {
        this.tel_inst = tel_inst;
    }

    public void setmax_ninos_inst(int max_ninos_inst) {
        this.max_ninos_inst = max_ninos_inst;
    }
    
    public void setnombre_dir(String nombre_dir) {
        this.nombre_dir = nombre_dir;
    }
           
    public void setap_dir(String ap_dir) {
        this.ap_dir = ap_dir;
    }

    public void setam_dir(String am_dir) {
        this.am_dir = am_dir;
    }
    
    public void setcel_dir(String cel_dir) {
        this.cel_dir = cel_dir;
    }    

    public void setemail_dir(String email_dir) {
        this.email_dir = email_dir;
    }        

}
