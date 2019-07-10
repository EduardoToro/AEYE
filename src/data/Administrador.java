package data;

import java.util.ArrayList;

public class Administrador extends Persona {
    
    ArrayList<Laboratorista> laboratoristas= new ArrayList<>(); 

    public Administrador(String nombre, String apellido, String documento, String clave) {
        super(nombre, apellido, documento, clave);
    }
    
    public void crearLaboratorista(){}
    
    public void crearEstudiante(){}
    
    public void editarEstudiante(){}
    
    public void eliminarEstudiante(){}
    
}
