package Model;

public class Nino {

    private String nombre_nino, ap_nino, am_nino, modeloplayera_nino, tallaplayera_nino, id_inst,id_res, id_con, id_det;
    private int id_nino,edad_cron;

    public Nino(String nombre_nino, String ap_nino, String am_nino, int edad_cron, String modeloplayera_nino, String tallaplayera_nino) {

        this.id_nino = id_nino;
        this.nombre_nino = nombre_nino;
        this.ap_nino = ap_nino;
        this.am_nino = am_nino;
        this.edad_cron = edad_cron;
        this.modeloplayera_nino = modeloplayera_nino;
        this.tallaplayera_nino = tallaplayera_nino;
    }

    public Nino() {
    }

    public int getid_nino() {
        return (id_nino);
    }

    public String getnombre_nino() {
        return (nombre_nino);
    }

    public String getap_nino() {
        return (ap_nino);
    }

    public String getam_nino() {
        return (am_nino);
    }

    public int getedad_cron() {
        return (edad_cron);
    }

    public String getmodeloplayera_nino() {
        return (modeloplayera_nino);
    }

    public String gettallaplayera_nino() {
        return (tallaplayera_nino);
    }

    public String getid_inst() {
        return (id_inst);
    }   
    
    public String getid_res() {
        return (id_res);
    }    
    
    public String getid_con() {
        return (id_con);
    }    
    
    public String getid_det() {
        return (id_det);
    }    
    
    public void setid_nino(int id_nino){
        this.id_nino=id_nino;
    }

    public void setnombre_nino(String nombre_nino) {
        this.nombre_nino = nombre_nino;
    }
 
    public void setap_nino(String ap_nino) {
        this.ap_nino = ap_nino;
    }
        
    public void setam_nino(String am_nino) {
        this.am_nino = am_nino;
    }
    
    public void setedad_cron(int edad_cron) {
        this.edad_cron = edad_cron;
    }
    
    public void setmodeloplayera_nino(String modeloplayera_nino) {
        this.modeloplayera_nino = modeloplayera_nino;
    }    
    
    public void settallaplayera_nino(String tallaplayera_nino) {
        this.tallaplayera_nino = tallaplayera_nino;
    }        

    public void setid_inst(String id_inst) {
        this.id_inst=id_inst;
    }

    public void setid_res(String id_res) {
        this.id_res=id_res;
    }

    public void setid_con(String id_con) {
        this.id_con=id_con;
    }

    public void setid_det(String id_det) {
        this.id_det= id_det;
    }
    
}
