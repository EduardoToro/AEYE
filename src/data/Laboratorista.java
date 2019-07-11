package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Laboratorista extends Persona{
    
    ArrayList<Estudiante> reserva= new ArrayList<>(); 
    private String horario; 
    
    public void prestarEquipos(){}
    
    public void recibirEquipos(){}
    
    public static Equipo editarEquipo( Equipo equipox){
        
                System.out.println("\nSi no desea editar algun dato presione 0\n");
		Scanner entrada=new Scanner(System.in);
		System.out.println("Nuevo Equipo: ");
		String equipoN=entrada.nextLine();
		
		if(!equipoN.equals("0")) {
			equipox.setEquipo(equipoN);
		}
		System.out.println("\nNueva Marca: ");
		String marcaN=entrada.nextLine();
		
		if(!marcaN.equals("0")) {
			equipox.setMarca(marcaN);
		}
		System.out.println("\nNuevo Codigo: ");
		String codigoN=entrada.nextLine();
		if(!codigoN.equals("0")) {
			equipox.setCodigo(codigoN);
		}		
		return equipox;
    }
     
    public static void eliminarEquipo(ArrayList<Equipo> equipos, int ejecutarAccion){
        equipos.remove(ejecutarAccion);
    }

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
