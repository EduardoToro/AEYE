package data;

import java.util.ArrayList;

public class Laboratorista extends Persona{
    
    ArrayList<Estudiante> reserva= new ArrayList<>(); 
    private String horario; 
    
    public void prestarEquipos(){}
    
    public void recibirEquipos(){}
    
    public void editarEquipos(){}
    
    public void eliminarEquipos(){}
    

    public Laboratorista(String nombre, String apellido, String documento, String clave) {
        super(nombre, apellido, documento, clave);
    }

    public String getHorario() {
        return horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
