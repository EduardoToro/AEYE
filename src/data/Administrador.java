package data;

import java.util.ArrayList;
import java.util.Scanner;
import data.Laboratorista;
public class Administrador extends Persona {
    
    Scanner entrada= new Scanner(System.in); 
    ArrayList<Laboratorista> laboratoristas= new ArrayList<>(); 

    public Administrador(String nombre, String apellido, String documento, String clave) {
        super(nombre, apellido, documento, clave);
    }
    
    public static void eliminarCliente(ArrayList<Estudiante> estudiantes, int ejecutarAccion){
        estudiantes.remove(ejecutarAccion); 
    }
    public static ArrayList<Laboratorista> crearLaboratorista(ArrayList<Laboratorista> laboratoristas, Laboratorista laboratoristax){
            laboratoristas.add(laboratoristax); 
            return laboratoristas; 
    }
    
    public static ArrayList<Estudiante> crearEstudiante(ArrayList<Estudiante> estudiantes, Estudiante estudiantex){
        estudiantes.add(estudiantex);
        return estudiantes; 
    }
    
    public static ArrayList<Equipo> añadirEquipo(ArrayList<Equipo> equipos, Equipo equipox){
        equipos.add(equipox);
        return equipos; 
    }
    
    public static Estudiante editarEstudiante( Estudiante estudiantex){
        
                System.out.println("\nSi no desea editar algun dato presione 0\n");
		Scanner entrada=new Scanner(System.in);
		System.out.println("Nuevo Nombre: ");
		String nombreN=entrada.nextLine();
		
		if(!nombreN.equals("0")) {
			estudiantex.setNombre(nombreN);
		}
		System.out.println("\nNuevo Apellido: ");
		String apellidoN=entrada.nextLine();
		
		if(!apellidoN.equals("0")) {
			estudiantex.setApellido(apellidoN);
		}
		System.out.println("\nNuevo Documento: ");
		String documentoN=entrada.nextLine();
		if(!documentoN.equals("0")) {
			estudiantex.setDocumento(documentoN);
		}
                System.out.println("\nNueva contraseña: ");
                String claveN= entrada.nextLine(); 
                if(!claveN.equals("0")) {
			estudiantex.setClave(claveN);
		}
                System.out.println("\nCarrera: ");
                String carreraN= entrada.nextLine(); 
                if(!carreraN.equals("0")) {
			estudiantex.setCarrera(carreraN);
		}
                System.out.println("\nSemestre: ");
                String semestreN= entrada.nextLine(); 
                if(!semestreN.equals("0")) {
			estudiantex.setSemestre(semestreN);
		}
		
		return estudiantex;
    }
    
    public static void verEstudiantes(ArrayList<Estudiante> estudiantes){
        
        for(int i=0;i<estudiantes.size();i++) {
			System.out.print((i+1)+". ");
			System.out.print("Nombre: " + estudiantes.get(i).getNombre()+"  ");
			System.out.print( ", Apellido: " + estudiantes.get(i).getApellido()+"  ");
			System.out.print( ", Documento: " + estudiantes.get(i).getDocumento()+"  ");
                        System.out.print( ", Carrera: " + estudiantes.get(i).getCarrera()+"  ");
                        System.out.print( ", Semestre: " + estudiantes.get(i).getSemestre()+"  \n");
		}
    }
    
    public static void verLaboratoristas(ArrayList<Laboratorista> laboratoristas){
        
        for(int i=0;i<laboratoristas.size();i++) {
			System.out.print((i+1)+". ");
			System.out.print("Nombre: " + laboratoristas.get(i).getNombre()+"  ");
			System.out.print( ", Apellido: " + laboratoristas.get(i).getApellido()+"  ");
			System.out.print( ", Documento: " + laboratoristas.get(i).getDocumento()+"  \n");
		}
    }
    
    
}
