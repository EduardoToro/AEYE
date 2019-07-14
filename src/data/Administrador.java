package data;

import java.util.ArrayList;
import java.util.Scanner;
import data.Laboratorista;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Administrador extends Persona {
    
    Scanner entrada= new Scanner(System.in); 
    ArrayList<Laboratorista> laboratoristas= new ArrayList<>(); 

    public Administrador(String nombre, String apellido, String documento, String clave) {
        super(nombre, apellido, documento, clave);
    }
    
    public static void eliminarEstudiante(ArrayList<Estudiante> estudiantes, int ejecutarAccion){
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
        int contador4=0, contador5=0;
       /* for(int i=0;i<estudiantes.size();i++) {
            if(!estudiantes.get(i).getNombre().equals("")){
			System.out.print((i+1)+". ");
			System.out.print("Nombre: " + estudiantes.get(i).getNombre()+"  ");
			System.out.print( ", Apellido: " + estudiantes.get(i).getApellido()+"  ");
			System.out.print( ", Documento: " + estudiantes.get(i).getDocumento()+"  ");
                        System.out.print( ", Carrera: " + estudiantes.get(i).getCarrera()+"  ");
                        System.out.print( ", Semestre: " + estudiantes.get(i).getSemestre()+"  \n");
		}}*/
        
           //**************Estudiantes, leer txt**************************
         
         //Contar lineas
         long numeroLineas2 = 0;
    	 try{
             //Ojo aqui se debe poner la ubicacuión del archivo:
             //C:\Users\Stiven\Desktop
             //C:\\Users\\Eduar\\OneDrive\\Escritorio\\AEYE\\Equipos.txt
    		 	FileReader fr2 = new FileReader("C:\\Users\\Stiven\\Desktop\\estudiantes.txt");
    	 		BufferedReader bf2 = new BufferedReader(fr2);
    	 		
    	 		 
    	 		String cadena2;
				while ((cadena2 = bf2.readLine())!=null) {
    	 		  numeroLineas2++;
    	 		}
    		} catch (FileNotFoundException fnfe){
    		  fnfe.printStackTrace();
    		} catch (IOException ioe){
    		  ioe.printStackTrace();
    		}
    	 System.out.println("El fichero tiene " + numeroLineas2 + " lineas");
    	 
         //Fin contar lineas
         
         
         	
    	 File archivo2 = null;
         FileReader fr2 = null;
         BufferedReader br2 = null;

         try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            //Ojo aqui se debe poner la ubicacuión del archivo:
            archivo2 = new File ("C:\\Users\\Stiven\\Desktop\\estudiantes.txt");
            fr2 = new FileReader (archivo2);
            br2 = new BufferedReader(fr2);

            // Lectura del fichero
            String linea2;
            
            ArrayList<String> guardador2=new ArrayList<>();
        
            while((linea2=br2.readLine())!=null) {
            	contador5++;
            	guardador2.add(linea2);
            	
            	if(contador5==7) {
            		
                	
                	
                	estudiantes.get(contador4).setNombre(guardador2.get(0));
                	estudiantes.get(contador4).setApellido(guardador2.get(1));
                	estudiantes.get(contador4).setDocumento(guardador2.get(2));
                        estudiantes.get(contador4).setClave(guardador2.get(3));
                        estudiantes.get(contador4).setCarrera(guardador2.get(4));
                        estudiantes.get(contador4).setSemestre(guardador2.get(5));
                        estudiantes.get(contador4).setSancion( Boolean.valueOf(guardador2.get(6)));
                	guardador2.clear();
                	contador4++;
                	contador5=0;
                	}
            	
            }
            
        	
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr2 ){   
                  fr2.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
        
        
           //mostrar estudiantes
         
         
         System.out.println("-------------------------------------------------------------------------------------");
         System.out.println("      |Nombre                        |Apellido          |Documento         |   Clave    | "
                 + "            Carrera    |       Semestre |     Sancion   |");
         for(int i=0;i<numeroLineas2/7;i++) {
        	 int masa=estudiantes.get(i).getNombre().length();
             System.out.print("|"+(i+1)+". ");
            if((i+1)>=10){System.
                    
                    out.print(" ");}
            else{System.out.print("  ");}
            System.out.print("|"+estudiantes.get(i).getNombre());
            for (int k = 0; k < (30-masa); k++) {
				System.out.print(" ");
			}
            System.out.print("|"+estudiantes.get(i).getApellido());
            for (int k = 0; k < (15-estudiantes.get(i).getApellido().length()); k++) {
				System.out.print(" ");
			}
            System.out.print("|"+estudiantes.get(i).getDocumento());
            for (int k = 0; k < (30-estudiantes.get(i).getDocumento().length()); k++) {
				System.out.print(" ");
			}
            System.out.print("|    "+estudiantes.get(i).getClave()+"    |");
            for (int k = 0; k < (15-estudiantes.get(i).getClave().length()); k++) {
				System.out.print(" ");
			}
            System.out.print("    "+estudiantes.get(i).getCarrera()+"    |");
            for (int k = 0; k < (15-estudiantes.get(i).getCarrera().length()); k++) {
				System.out.print(" ");
			}
            System.out.print("    "+estudiantes.get(i).getSemestre()+"    |");
            for (int k = 0; k < (15-estudiantes.get(i).getSemestre().length()); k++) {
				System.out.print(" ");
			}
            System.out.println("    "+String.valueOf(estudiantes.get(i).isSancion())+"    |");
           
             }
            System.out.println("");
             
         
        //fin de mostrar estudiantes
        
         
        
    }
    
    public static void verLaboratoristas(ArrayList<Laboratorista> laboratoristas){
        
        for(int i=0;i<laboratoristas.size();i++) {
            if(!laboratoristas.get(i).getNombre().equals("")){
			System.out.print((i+1)+". ");
			System.out.print("Nombre: " + laboratoristas.get(i).getNombre()+"  ");
			System.out.print( ", Apellido: " + laboratoristas.get(i).getApellido()+"  ");
			System.out.print( ", Documento: " + laboratoristas.get(i).getDocumento()+"  \n");
		}
        }
    }
    
    public static void verEquipos(ArrayList<Equipo> equipos){
        for(int i=0;i<equipos.size();i++) {
            
            if(!equipos.get(i).getEquipo().equals("")){
            System.out.print((i+1)+". ");
			System.out.print("Equipo: " + equipos.get(i).getEquipo()+"  ");
			System.out.print( ", Marca: " + equipos.get(i).getMarca()+"  ");
			System.out.print( ", Codigo: " + equipos.get(i).getCodigo()+"  ");
                        System.out.println(", Estado: "+ equipos.get(i).getEstado()+"  ");
                        System.out.println(", Disponibilidad: "+equipos.get(i).getDisposicion());  
            }
            
			          
	}
    }
    
    public final int iniciarSecion(ArrayList<Estudiante> estudiantes){
        int x=0,y=0,z=0,i=0,k=-1,aux=0;
        String nombre,contraseña;
        Scanner entrada=new Scanner(System.in);
        for( i=0;i<estudiantes.size();i++){
        while(x==0){
         
            System.out.println("\tESTUDIANTE");
            System.out.println("Usuario: ");
            nombre=entrada.nextLine();
          for( i=0;i<estudiantes.size();i++){
              
              if(estudiantes.get(i).getNombre().equals(nombre)){k=i;break;}
          }
                if(k!=-1){
                  while(z==0){
                  System.out.println("contraseña: ");
                  contraseña=entrada.nextLine();
                    if(contraseña.equals(estudiantes.get(k).getClave())){
                        x=1;
                        y=1;
                        z=1;
                        break;
                    }
                    else{
                        System.out.println("Contraseña Incorrecta, Intentelo Nuevamente");
                        x=0; z=0;}
                  } 
                                 }
                else{ System.out.println("Usuario Incorrecto, Intentelo Nuevamente");
                      x=0;}
            //}
                i++;
        }}
        return y;
    }
    
    
}
