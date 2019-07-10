package data;

import java.util.ArrayList;

public class Estudiante extends Persona{
    
    ArrayList<Equipo> listaEquipos= new ArrayList<>(); 
    private String carrera;
    private String semestre; 
    private boolean autorizacion; 
    private String numeroGrupo; 
    private boolean sancion; 

    public void hacerReserva(){}
    
    public Estudiante(String nombre, String apellido, String documento, String clave,String carrera, String semestre, boolean autorizacion, String numeroGrupo, boolean sancion) {
        super(nombre, apellido, documento, clave);
        this.carrera = carrera;
        this.semestre = semestre;
        this.autorizacion = autorizacion;
        this.numeroGrupo = numeroGrupo;
        this.sancion = sancion;
    }
    
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public boolean isAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(boolean autorizacion) {
        this.autorizacion = autorizacion;
    }

    public String getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(String numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public boolean isSancion() {
        return sancion;
    }

    public void setSancion(boolean sancion) {
        this.sancion = sancion;
    }
    
}
