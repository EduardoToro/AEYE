package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Laboratorista extends Persona {

    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private String horario;

    public static Equipo recibirEquipos(Equipo equipox) {

        String equipoN = "0";
        if (!equipoN.equals("0")) {
            equipox.setEquipo(equipoN);
        }
        String marcaN = "0";
        if (!marcaN.equals("0")) {
            equipox.setMarca(marcaN);
        }
        String codigoN = "0";
        if (!codigoN.equals("0")) {
            equipox.setCodigo(codigoN);
        }
        String estadoN = "0";
        if (!estadoN.equals("0")) {
            equipox.setEstado(estadoN);
        }
        String disposicionN = "Disponible";
        if (!disposicionN.equals("0")) {
            equipox.setDisposicion(disposicionN);
        }
        return equipox;
    }

    public static Equipo editarEquipo(Equipo equipox) {

        System.out.println("\nSi no desea editar algun dato presione 0\n");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nuevo Equipo: ");
        String equipoN = entrada.nextLine();

        if (!equipoN.equals("0")) {
            equipox.setEquipo(equipoN);
        }
        System.out.println("\nNueva Marca: ");
        String marcaN = entrada.nextLine();

        if (!marcaN.equals("0")) {
            equipox.setMarca(marcaN);
        }
        System.out.println("\nNuevo Codigo: ");
        String codigoN = entrada.nextLine();
        if (!codigoN.equals("0")) {
            equipox.setCodigo(codigoN);
        }
        System.out.println("\nNuevo Estado: ");
        String estadoN = entrada.nextLine();
        if (!estadoN.equals("0")) {
            equipox.setEstado(estadoN);
        }
        System.out.println("\nNueva Disponibilidad: ");
        String disponibilidadN = entrada.nextLine();
        if (!disponibilidadN.equals("0")) {
            equipox.setDisposicion(disponibilidadN);
        }
        return equipox;
    }

    public static void eliminarEquipo(ArrayList<Equipo> equipos, int ejecutarAccion) {
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

    public static void agregarEstudiante(ArrayList<Estudiante> estudiantes, Estudiante estudiantex) {
        //Contar lineas
        long numeroLineas2 = 0;
        try {
            FileReader fr2 = new FileReader("src/datos/estudiantes.txt");
            BufferedReader bf2 = new BufferedReader(fr2);

            String cadena2;
            while ((cadena2 = bf2.readLine()) != null) {
                numeroLineas2++;
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("El fichero tiene " + numeroLineas2 + " lineas");

         //Fin contar lineas
         //aqui se escriben los estudiantes en el txt
        int cantidadEstudiantes = (int) (numeroLineas2 / 7);
        estudiantes.get(cantidadEstudiantes + 1).setNombre(estudiantex.getNombre());
        estudiantes.get(cantidadEstudiantes + 1).setApellido(estudiantex.getApellido());
        estudiantes.get(cantidadEstudiantes + 1).setDocumento(estudiantex.getDocumento());
        estudiantes.get(cantidadEstudiantes + 1).setClave(estudiantex.getClave());
        estudiantes.get(cantidadEstudiantes + 1).setCarrera(estudiantex.getCarrera());
        estudiantes.get(cantidadEstudiantes + 1).setCarrera(estudiantex.getSemestre());
        estudiantes.get(cantidadEstudiantes + 1).setSancion(estudiantex.getSancion());
        BufferedWriter bw2 = null;
        FileWriter fw2 = null;

        try {

            File file2 = new File("src/datos/estudiantes.txt");
            // Si el archivo no existe, se crea!
            if (!file2.exists()) {
                file2.createNewFile();
            }
            // flag true, indica adjuntar información al archivo.
            fw2 = new FileWriter(file2.getAbsoluteFile(), true);
            bw2 = new BufferedWriter(fw2);

            bw2.write(estudiantex.getNombre());
            bw2.newLine();
            bw2.write(estudiantex.getApellido());
            bw2.newLine();
            bw2.write(estudiantex.getDocumento());
            bw2.newLine();
            bw2.write(estudiantex.getClave());
            bw2.newLine();
            bw2.write(estudiantex.getCarrera());
            bw2.newLine();
            bw2.write(estudiantex.getSemestre());
            bw2.newLine();
            bw2.write(String.valueOf(estudiantex.getSancion()));
            bw2.newLine();
            System.out.println("información agregada!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw2 != null) {
                    bw2.close();
                }
                if (fw2 != null) {
                    fw2.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

      //fin de escribir estudian<tes 
    }

}
