package businessLogic;

import data.Administrador;
import data.Equipo;
import data.Estudiante;
import data.Laboratorista;
import data.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class TestAlmacen {

    public static void main(String[] args) {

        Administrador administrador = new Administrador("Milena", "Diaz", "1122", "MileD");
        Laboratorista laboratorista = new Laboratorista("Juan", "Montenegro", "2233", "MonteB");
        Estudiante estudiante = new Estudiante("Eduardo", "Toro", "3344", "Edu23", "Ing. Electronica", "2", true, null, false);
        Profesor profesor = new Profesor("Gabriel", "Tovar", "4455", "TovaG");
        Equipo equipo= new Equipo("Multimetro", "Flux", "1010"); 
        ArrayList<Equipo> equipos= new ArrayList<>(); 
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
                                    Equipo equipox= new Equipo(nombreEquipo, marca, codigo); 
                                    Administrador.añadirEquipo(equipos, equipox);
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
