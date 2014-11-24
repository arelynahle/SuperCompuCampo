package Model;

public class Contacto {

    private String hospital_con, parentesco_con, nombre_con, tel_con, cel_con, of_con;
    private int id_con;

    public Contacto(String hospital_con, String parentesco_con, String nombre_con, String tel_con, String cel_con, String of_con) {

        this.id_con = id_con;
        this.hospital_con = hospital_con;
        this.parentesco_con = parentesco_con;
        this.nombre_con = nombre_con;
        this.tel_con = tel_con;
        this.cel_con = cel_con;
        this.of_con = of_con;

    }

    public Contacto() {
    }

    public int getid_con() {
        return (id_con);
    }

    public String gethospital_con() {
        return (hospital_con);
    }

    public String getparentesco_con() {
        return (parentesco_con);
    }

    public String getnombre_con() {
        return (nombre_con);
    }

    public String gettel_con() {
        return (tel_con);
    }

    public String getcel_con() {
        return (cel_con);
    }

    public String getof_con() {
        return (of_con);
    }

    public void setid_con(int id_con) {
        this.id_con = id_con;
    }

    public void sethospital_con(String hospital_con) {
        this.hospital_con = hospital_con;
    }
 
    public void setparentesco_con(String parentesco_con) {
        this.parentesco_con = parentesco_con;
    }
        
    public void setnombre_con(String nombre_con) {
        this.nombre_con = nombre_con;
    }
    
    public void settel_con(String tel_con) {
        this.tel_con = tel_con;
    }
    
    public void setcel_con(String cel_con) {
        this.cel_con = cel_con;
    }    
    
    public void setof_con(String of_con) {
        this.of_con = of_con;
    }        
    
}
