package data;

import java.util.ArrayList;

public class Profesor extends Persona{
    
    private String asignaturaEncargada; 
    ArrayList<Grupo> grupos= new ArrayList<>(); 

    public void autorizarPrestamo(){}
    
    public void crearGrupo(){}
    
    public Profesor(String nombre, String apellido, String documento, String clave) {
        super(nombre, apellido, documento, clave);
    }
    
    public String getAsignaturaEncargada() {
        return asignaturaEncargada;
    }

    public void setAsignaturaEncargada(String asignaturaEncargada) {
        this.asignaturaEncargada = asignaturaEncargada;
    }
     
}
