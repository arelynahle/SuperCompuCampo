package Model;

public class Detalle {

    private String discapacidad_det, escolaridad_det;
    private int id_det, edad_men_det;
    private boolean tratamiento_det, silla_det;

    public Detalle(int id_det, String discapacidad_det, int edad_men_det, String escolaridad_det, boolean tratamiento_det, boolean silla_det) {

        this.id_det = id_det;
        this.discapacidad_det = discapacidad_det;
        this.edad_men_det = edad_men_det;
        this.escolaridad_det = escolaridad_det;
        this.tratamiento_det= tratamiento_det;
        this.silla_det= silla_det;
    }

    public Detalle() {
    }

    public int getid_det() {
        return (id_det);
    }

    public String getdiscapacidad_det() {
        return (discapacidad_det);
    }

    public int getedad_men_det() {
        return (edad_men_det);
    }

    public String getescolaridad_det() {
        return (escolaridad_det);
    }
    
    public boolean gettratamiento_det() {
        return (tratamiento_det);
    }

    public boolean getsilla_det() {
        return (silla_det);
    }    
    
    public void setid_det(int id_det) {
        this.id_det = id_det;
    }

    public void setdiscapacidad_det(String discapacidad_det) {
        this.discapacidad_det = discapacidad_det;
    }

    public void setedad_men_det(int edad_men_det) {
        this.edad_men_det = edad_men_det;
    }
    
    public void setescolaridad_det(String escolaridad_det) {
        this.escolaridad_det = escolaridad_det;
    }    
    
    public void settratamiento_det(boolean tratamiento_det) {
        this.tratamiento_det = tratamiento_det;
    }    
    
    public void setsilla_det(boolean silla_det) {
        this.silla_det = silla_det;
    }    
}
