package Model;

/**
 *
 * @author Carlos Gerardo
 */
public class institucion {
    
    private int id_inst;
    private String nombre_inst;
    private String calle_inst;
    private int numero_inst;
    private String colonia_inst;
    private int cp_inst;
    private String ciudad_inst;
    private String estado_inst;
    private String tel_inst;
    private int max_ninos_inst;
    
    
     public institucion(int id_inst,
            String nombre_inst,
            String calle_inst,
            int numero_inst,
            String colonia_inst,
            int cp_inst,
            String ciudad_inst,
            String estado_inst,
            String tel_inst,
            int max_ninos_inst
            ) 
     {

        this.id_inst = id_inst;
        this.nombre_inst = nombre_inst;
        this.calle_inst = calle_inst;
        this.numero_inst = numero_inst;
        this.colonia_inst = colonia_inst;
        this.cp_inst = cp_inst;
        this.estado_inst = estado_inst;
        this.tel_inst = tel_inst;
        this.max_ninos_inst= max_ninos_inst;        
    }
        
     public institucion(){
     }
    
      public int getid() {
        return (id_inst);
    }

    public String getnombre() {
        return (nombre_inst);
    }

    public String getcalle() {
        return (calle_inst);
    }

    public int getnumero() {
        return (numero_inst);
    }

    public String getcolonia() {
        return (colonia_inst);
    }
     public int getcp() {
        return (cp_inst);
    }
      public String getciudad() {
        return (ciudad_inst);
    }
       public String getestado() {
        return (estado_inst);
    }
    
        public String gettel() {
        return (tel_inst);
    }
        
         public int getmaxninos() {
        return (max_ninos_inst);
    }
    
    
    
    
    public void setid(int id_inst) {
        this.id_inst = id_inst;

    }

    public void setnombre(String nombre_inst) {
        this.nombre_inst = nombre_inst;
    }

    public void setcalle(String calle_inst) {
        this.calle_inst = calle_inst;
    }

    public void setnumero(int numero_inst) {
        this.numero_inst = numero_inst;
    }

    public void setcolonia(String colonia_inst) {
        this.colonia_inst = colonia_inst;
    }
    
    public void setcp(int cp_inst) {
        this.cp_inst = cp_inst;
    }
    
     public void setciudad(String ciudad_inst) {
        this.ciudad_inst = ciudad_inst;
    }
     
      public void setestado(String estado_inst) {
        this.estado_inst = estado_inst;
    }
    
       public void settel(String tel_inst) {
        this.tel_inst = tel_inst;
    }
       
        public void setmaxninos(int max_ninos_inst) {
        this.max_ninos_inst = max_ninos_inst;
    }
    
    
    
    
    
    
    
    

}
     
     
 