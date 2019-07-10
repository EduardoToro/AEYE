package businessLogic;

import data.Administrador;
import data.Estudiante;
import data.Laboratorista;
import data.Profesor;
import java.util.Scanner;

public class TestAlmacen {

    public static void main(String[] args) {

        Administrador administrador = new Administrador("Milena", "Diaz", "1122", "MileD");
        Laboratorista laboratorista = new Laboratorista("Juan", "Montenegro", "2233", "MonteB");
        Estudiante estudiante = new Estudiante("Eduardo", "Toro", "3344", "Edu23", "Ing. Electronica", "2", true, null, false);
        Profesor profesor = new Profesor("Gabriel", "Tovar", "4455", "TovaG");
        Scanner leer = new Scanner(System.in);
        int x = 0, y = 0, z=0;
        String contraseña, usuario, confirmar;
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
                        System.out.println("\tADMINISTRADOR");
                        System.out.println("Usuario: ");
                        usuario = leer.nextLine();
                        if (usuario.equals(administrador.getNombre())) {
                            while (y == 0) {
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
