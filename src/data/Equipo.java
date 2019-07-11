package data;
public class Equipo {
    
    private String equipo; 
    private String codigo; 
    private String marca; 
    private String estado;
    private String disposicion; 

        public Equipo(String equipo,String marca, String codigo,String estado, String disposicion) {
        this.equipo = equipo;
        this.codigo = codigo;
        this.marca = marca;
        this.estado=estado;
        this.disposicion= disposicion; 
    }

    public String getDisposicion() {
        return disposicion;
    }

    public void setDisposicion(String disposicion) {
        this.disposicion = disposicion;
    }
       
    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado=estado;
    }
    
}
