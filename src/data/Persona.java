package data;

public abstract class Persona{
    
    private String nombre; 
    private String apellido; 
    private String documento; 
    private String clave; 

    public Persona(String nombre, String apellido, String documento, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
