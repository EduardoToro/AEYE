package businessLogic;

import data.Administrador;
import data.Equipo;
import data.Estudiante;
import data.Laboratorista;
import data.Profesor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestAlmacen {
        
    public static void main(String[] args) {
        
        
        //En esta parte instancio todos los equipos para después crearlos y leerlos
    	 ArrayList<Equipo> equipos=new ArrayList<>(20);
    	 Equipo equipo1=new Equipo(null,null,null,null);
    	 Equipo equipo2=new Equipo(null,null,null,null);
    	 Equipo equipo3=new Equipo(null,null,null,null);
    	 Equipo equipo4=new Equipo(null,null,null,null);
    	 Equipo equipo5=new Equipo(null,null,null,null);
    	 Equipo equipo6=new Equipo(null,null,null,null);
    	 Equipo equipo7=new Equipo(null,null,null,null);
    	 Equipo equipo8=new Equipo(null,null,null,null);
    	 Equipo equipo9=new Equipo(null,null,null,null);
    	 Equipo equipo10=new Equipo(null,null,null,null);
    	 Equipo equipo11=new Equipo(null,null,null,null);
    	 Equipo equipo12=new Equipo(null,null,null,null);
    	 Equipo equipo13=new Equipo(null,null,null,null);
    	 Equipo equipo14=new Equipo(null,null,null,null);
    	 Equipo equipo15=new Equipo(null,null,null,null);
    	 Equipo equipo16=new Equipo(null,null,null,null);
    	 Equipo equipo17=new Equipo(null,null,null,null);
    	 Equipo equipo18=new Equipo(null,null,null,null);
    	 Equipo equipo19=new Equipo(null,null,null,null);
    	 Equipo equipo20=new Equipo(null,null,null,null);
    	 equipos.add(equipo1);
    	 equipos.add(equipo2);
    	 equipos.add(equipo3);
    	 equipos.add(equipo4);
    	 equipos.add(equipo5);
    	 equipos.add(equipo6);
    	 equipos.add(equipo7);
    	 equipos.add(equipo8);
    	 equipos.add(equipo9);
    	 equipos.add(equipo10);
    	 equipos.add(equipo11);
    	 equipos.add(equipo12);
    	 equipos.add(equipo13);
    	 equipos.add(equipo14);
    	 equipos.add(equipo15);
    	 equipos.add(equipo16);
    	 equipos.add(equipo17);
    	 equipos.add(equipo18);
    	 equipos.add(equipo19);
    	 equipos.add(equipo20);
         //Aqui termina la instanciación de los equipos
         
         //contador para uso de txt
         int contador0=0,contador1=0;
         
         
        //**************EQUIPOS, leer txt**************************
         
         //Contar lineas
         long numeroLineas = 0;
    	 try{
             //Ojo aqui se debe poner la ubicacuión del archivo:
    		 	FileReader fr = new FileReader("C:\\Users\\Stiven\\Desktop\\datos.txt");
    	 		BufferedReader bf = new BufferedReader(fr);
    	 		
    	 		 
    	 		String cadena;
				while ((cadena = bf.readLine())!=null) {
    	 		  numeroLineas++;
    	 		}
    		} catch (FileNotFoundException fnfe){
    		  fnfe.printStackTrace();
    		} catch (IOException ioe){
    		  ioe.printStackTrace();
    		}
    	 System.out.println("El fichero tiene " + numeroLineas + " lineas");
    	 
         //Fin contar lineas
         
         
         	
    	 File archivo = null;
         FileReader fr = null;
         BufferedReader br = null;

         try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            //Ojo aqui se debe poner la ubicacuión del archivo:
            archivo = new File ("C:\\Users\\Stiven\\Desktop\\datos.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            
            ArrayList<String> guardador=new ArrayList<>();
        
            while((linea=br.readLine())!=null) {
            	contador1++;
            	guardador.add(linea);
            	
            	if(contador1==4) {
            		
                	
                	
                	equipos.get(contador0).setEquipo(guardador.get(0));
                	equipos.get(contador0).setMarca(guardador.get(1));
                	equipos.get(contador0).setCodigo(guardador.get(2));
                        equipos.get(contador0).setEstado(guardador.get(3));
                	guardador.clear();
                	contador0++;
                	contador1=0;
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
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
         
         
        //**************FIN EQUIPOS, leer txt**********************
        //mostrar equipos
         
         
         System.out.println("-------------------------------------------------------------------------------------");
         System.out.println("      |Nombre                        |Marca          |Codigo         |Estado       | ");
         for(int i=0;i<numeroLineas/4;i++) {
        	 int masa=equipos.get(i).getEquipo().length();
             System.out.print("|"+(i+1)+". ");
            if((i+1)>=10){System.out.print(" ");}
            else{System.out.print("  ");}
            System.out.print("|"+equipos.get(i).getEquipo());
            for (int k = 0; k < (30-masa); k++) {
				System.out.print(" ");
			}
            System.out.print("|"+equipos.get(i).getMarca());
            for (int k = 0; k < (15-equipos.get(i).getMarca().length()); k++) {
				System.out.print(" ");
			}
            System.out.print("|"+equipos.get(i).getCodigo());
            for (int k = 0; k < (15-equipos.get(i).getCodigo().length()); k++) {
				System.out.print(" ");
			}
            System.out.println("|    "+equipos.get(i).getEstado()+"    |");
             }
            System.out.println("");
             
         
        //fin de mostrar equipos
         
        Administrador administrador = new Administrador("Milena", "Diaz", "1122", "MileD");
        Laboratorista laboratorista = new Laboratorista("Juan", "Montenegro", "2233", "MonteB");
        Estudiante estudiante = new Estudiante("Eduardo", "Toro", "3344", "Edu23", "Ing. Electronica", "2", true, null, false);
        Profesor profesor = new Profesor("Gabriel", "Tovar", "4455", "TovaG");
        Equipo equipo= new Equipo("Multimetro", "Flux", "1010","Bueno"); 
        ArrayList<Laboratorista> laboratoristas= new ArrayList<>(); 
        ArrayList<Estudiante> estudiantes= new ArrayList<>();
        equipos.add(equipo);
        estudiantes.add(estudiante);
        laboratoristas.add(laboratorista); 
        Scanner leer = new Scanner(System.in);
        int x = 0, y = 0, z=0;
        String contraseña, usuario, confirmar, accion;
        //**********************************************************************
        while (x == 0) {
            System.out.println("\t\tAlmacen De Equipos\n\t     Electricos Y Electronicos\n\n");
            System.out.println("1. Administrador");
            System.out.println("2. Laboratorista");
            System.out.println("3. Estudiante");
            System.out.println("4. Profesor");
            System.out.println("5. Salir");
            String menu = leer.nextLine();
            switch (menu) {
                //**************************************************************
                case "1":
                    while (y == 0) {
                        System.out.println("\tADMINISTRADOR\n");
                        System.out.println("Usuario: ");
                        usuario = leer.nextLine();
                        if (usuario.equals(administrador.getNombre())) {
                            while (y == 0) {
                                System.out.println();
                                System.out.println("Contraseña:");
                                contraseña = leer.nextLine();
                                if (contraseña.equals(administrador.getClave())) {
                                    //InicioSesion
                                    y=1; 
                                } else {
                                    System.out.println("Contraseña Incorrecta, Intentelo Nuevamente");
                                    y = 0;
                                }
                            }
                        } else {
                            System.out.println("Usuario Incorrecto, Intentelo Nuevamente");
                            y = 0;
                        }
                        while(z==0){
                        System.out.println("\nFUNCIONES ADMINISTRADOR\n");
                            System.out.println("1. Crear Laboratorista");
                            System.out.println("2. Crear Estudiante");
                            System.out.println("3. Editar Estudiante");
                            System.out.println("4. Eliminar Estudiante");
                            System.out.println("5. Añadir Equipo");
                            System.out.println("6. Lista Laboratoristas");
                            System.out.println("7. Lista Estudiantes");
                            System.out.println("8. Regresar");
                            String submenu1= leer.nextLine(); 
                            switch (submenu1) {
                                case "1":
                                    System.out.println();
                                    System.out.println("DATOS PERSONALES\n");
                                    System.out.println("Nombre: ");
                                    String nombre = leer.nextLine();
                                    System.out.println("Apellido: ");
                                    String apellido = leer.nextLine();
                                    System.out.println("Documento: ");
                                    String documento = leer.nextLine();
                                    System.out.println("Contraseña: ");
                                    String clave = leer.nextLine();
                                    Laboratorista laboratoristax= new Laboratorista(nombre, apellido, documento, clave); 
                                    Administrador.crearLaboratorista(laboratoristas, laboratoristax);
                                    System.out.println("\nDesea Regresar: ");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    confirmar= leer.nextLine(); 
                                    if(confirmar.equals("1")){
                                        y=0;
                                    }else{y=1;}
                                    break;
                                    //******************************************
                                case "2": 
                                    System.out.println();
                                    System.out.println("DATOS PERSONALES\n");
                                    System.out.println("Nombre: ");
                                    String nombreE = leer.nextLine();
                                    System.out.println("\nApellido: ");
                                    String apellidoE = leer.nextLine();
                                    System.out.println("\nDocumento: ");
                                    String documentoE = leer.nextLine();
                                    System.out.println("\nContraseña: ");
                                    String claveE = leer.nextLine();
                                    System.out.println("\nCarrera Universitaria: ");
                                    String carreraE = leer.nextLine();
                                    System.out.println("\nSemestre: ");
                                    String semestreE = leer.nextLine();
                                    Estudiante estudiantex= new Estudiante(nombreE, apellidoE, documentoE, claveE, carreraE, semestreE);
                                    Administrador.crearEstudiante(estudiantes, estudiantex); 
                                    System.out.println("\nDesea Regresar: ");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    confirmar= leer.nextLine(); 
                                    if(confirmar.equals("1")){
                                        y=0;
                                    }else{y=1;}
                                    break;
                                    //******************************************
                                case "3": 
                                    System.out.println("\nSeleccione el estudiante que desea editar: \n");
                                    Administrador.verEstudiantes(estudiantes);
                                    accion= leer.nextLine(); 
                                    int confirmacion= Integer.parseInt(accion)-1; 
                                    Administrador.editarEstudiante(estudiantes.get(confirmacion));
                                    System.out.println("El estudiante ha sido editado exitosamente.");
                                    break; 
                                case "4": 
                                    System.out.println("\nSeleccione el estudiante que desea eliminar: \n");
                                    Administrador.verEstudiantes(estudiantes);
                                    accion= leer.nextLine();
                                    int ejecutarAccion= Integer.parseInt(accion)-1; 
                                    Administrador.eliminarCliente(estudiantes, ejecutarAccion);
                                    System.out.println("\nEl estudiante ha sido eliminado correctamente");
                                    System.out.println("\nDesea Regresar: ");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    confirmar= leer.nextLine(); 
                                    if(confirmar.equals("1")){
                                        y=0;
                                    }else{y=1;}
                                    break; 
                                //**********************************************
                                case "5": 
                                    System.out.println();
                                    System.out.println("DATOS EQUIPO\n");
                                    System.out.println("Nombre: ");
                                    String nombreEquipo = leer.nextLine();
                                    System.out.println("Marca: ");
                                    String marca = leer.nextLine();
                                    System.out.println("Codigo: ");
                                    String codigo = leer.nextLine();
                                    Equipo equipox= new Equipo(nombreEquipo, marca, codigo,"Bueno"); 
                                    //Administrador.añadirEquipo(equipos, equipox);
                                    
                                    //aqui se escriben los equipos en el txt
                                    
                                    int catidadEquipos=(int) (numeroLineas/4);
                                    equipos.get(catidadEquipos+1).setEquipo(equipox.getEquipo());
                                    equipos.get(catidadEquipos+1).setMarca(equipox.getMarca());
                                    equipos.get(catidadEquipos+1).setCodigo(equipox.getCodigo());
                                    equipos.get(catidadEquipos+1).setCodigo(equipox.getEstado());
                                    
                                    BufferedWriter bw = null;
                                    FileWriter fw = null;

                                     try {

                                      
                                        File file = new File("C:\\Users\\Stiven\\Desktop\\datos.txt");
                                         // Si el archivo no existe, se crea!
                                         if (!file.exists()) {
                                             file.createNewFile();
                                         }
                                         // flag true, indica adjuntar información al archivo.
                                         fw = new FileWriter(file.getAbsoluteFile(), true);
                                         bw = new BufferedWriter(fw);

                                         bw.write(equipox.getEquipo());
                                         bw.newLine();
                                         bw.write(equipox.getMarca());
                                         bw.newLine();
                                         bw.write(equipox.getCodigo());
                                         bw.newLine();
                                         bw.write(equipox.getEstado());
                                         bw.newLine();
                                         System.out.println("información agregada!");
                                     } catch (IOException e) {
                                         e.printStackTrace();
                                     } finally {
                                         try {
                                                         //Cierra instancias de FileWriter y BufferedWriter
                                             if (bw != null)
                                                 bw.close();
                                             if (fw != null)
                                                 fw.close();
                                         } catch (IOException ex) {
                                             ex.printStackTrace();
                                         }
                                     }
          
                                    
                                    //fin de escribir equipos
                         
                                    System.out.println("\nDesea Regresar: ");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    confirmar= leer.nextLine(); 
                                    if(confirmar.equals("1")){
                                        y=0;
                                    }else{y=1;}
                                    break;
                                //**********************************************
                                case "6":
                                    System.out.println();
                                    Administrador.verLaboratoristas(laboratoristas);
                                    System.out.println();
                                    System.out.println("\nDesea Regresar: ");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    confirmar= leer.nextLine(); 
                                    if(confirmar.equals("1")){
                                        y=0;
                                    }else{y=1;}
                                    break; 
                                //**********************************************
                                case "7":
                                    Administrador.verEstudiantes(estudiantes);
                                    System.out.println();
                                    System.out.println("\nDesea Regresar: ");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    confirmar= leer.nextLine(); 
                                    if(confirmar.equals("1")){
                                        y=0;
                                    }else{y=1;}
                                    break; 
                                //**********************************************
                                case "8": 
                                    System.out.println("A tu servicio :)");
                                    z=1;
                                    y=1; 
                                    break;      
                            }
                          } 
                        }
                    break;
                //**************************************************************
                case "2":
                    while (y == 0) {
                        System.out.println("\tLABORATORISTA");
                        System.out.println("Usuario: ");
                        usuario = leer.nextLine();
                        if (usuario.equals(laboratorista.getNombre())) {
                            while (y == 0) {
                                System.out.println("Contraseña:");
                                contraseña = leer.nextLine();
                                if (contraseña.equals(laboratorista.getClave())) {
                                    //Inicio Seseion
                                    y = 1;
                                } else {
                                    System.out.println("Contraseña Incorrecta, Intentelo Nuevamente");
                                    y = 0;
                                }
                            }
                        } else {
                            System.out.println("Usuario Incorrecto, Intentelo Nuevamente");
                            y = 0;
                        }
                    }
                    break;
                //**************************************************************
                case "3":
                    while (y == 0) {
                        System.out.println("\tESTUDIANTE");
                        System.out.println("Usuario: ");
                        usuario = leer.nextLine();
                        if (usuario.equals(estudiante.getNombre())) {
                            while (y == 0) {
                                System.out.println("Contraseña:");
                                contraseña = leer.nextLine();
                                if (contraseña.equals(estudiante.getClave())) {
                                    //Inicio Sesion
                                    y = 1;
                                } else {
                                    System.out.println("Contraseña Incorrecta, Intentelo Nuevamente");
                                    y = 0;
                                }
                            }
                        } else {
                            System.out.println("Usuario Incorrecto, Intentelo Nuevamente");
                            y = 0;
                        }
                    }
                    break;
                //**************************************************************
                case "4":
                    while (y == 0) {
                        System.out.println("\tPROFESOR");
                        System.out.println("Usuario: ");
                        usuario = leer.nextLine();
                        if (usuario.equals(profesor.getNombre())) {
                            while (y == 0) {
                                System.out.println("Contraseña:");
                                contraseña = leer.nextLine();
                                if (contraseña.equals(profesor.getClave())) {
                                    //Inicio Sesion
                                    y = 1;
                                } else {
                                    System.out.println("Contraseña Incorrecta, Intentelo Nuevamente");
                                    y = 0;
                                }
                            }
                        } else {
                            System.out.println("Usuario Incorrecto, Intentelo Nuevamente");
                            y = 0;
                        }
                    }
                    break;
                //**************************************************************
                case "5":
                    x = 1;
                    break;
            }

        }
    }
}
