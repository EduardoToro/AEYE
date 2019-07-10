package data;
public class Equipo {
    
    private String equipo; 
    private String codigo; 
    private String marca; 

    public Equipo(String equipo, String codigo, String marca) {
        this.equipo = equipo;
        this.codigo = codigo;
        this.marca = marca;
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
    
}
