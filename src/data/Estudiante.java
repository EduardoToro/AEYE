package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante extends Persona{
    public static ArrayList<Equipo> listaEquipos= new ArrayList<>(); 
    private String carrera;
    private String semestre; 
    private String sancion;  
    
    
     public static Equipo prestarEquipos(Equipo equipox){
		
		String equipoN="0";
		if(!equipoN.equals("0")) {
			equipox.setEquipo(equipoN);
		}
		String marcaN="0";
		if(!marcaN.equals("0")) {
			equipox.setMarca(marcaN);
		}
		String codigoN="0";
		if(!codigoN.equals("0")) {
			equipox.setCodigo(codigoN);      
		}
		String estadoN="0";
		if(!estadoN.equals("0")) {
			equipox.setEstado(estadoN);        
		}
                String disposicionN="Prestado";
                if(!disposicionN.equals("0")) {
			equipox.setDisposicion(disposicionN);        
		}
		return equipox;
    }
    
    public Estudiante(String nombre, String apellido, String documento, String clave,String carrera, String semestre, String sancion) {
        super(nombre, apellido, documento, clave);
        this.carrera = carrera;
        this.semestre = semestre;
        this.sancion = sancion;
    }

     public Estudiante(String nombre, String apellido, String documento, String clave, String carrera, String semestre) {
        super(nombre, apellido, documento, clave);
        this.carrera= carrera;
        this.semestre= semestre;
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

    public String getSancion() {
        return sancion;
    }

    public void setSancion(String sancion) {
        this.sancion = sancion;
    }
  
}
