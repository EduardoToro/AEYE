package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Inventario {

    public static ArrayList<Equipo> equipos = new ArrayList<>();

    public static void agregarEquipo(ArrayList<Equipo> equipos, Equipo equipo) {

        //Contar lineas
        long numeroLineas = 0;
        try {
            FileReader fr = new FileReader("src/datos/datos.txt");
            BufferedReader bf = new BufferedReader(fr);

            String cadena;
            while ((cadena = bf.readLine()) != null) {
                numeroLineas++;
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("El fichero tiene " + numeroLineas + " lineas");

        //Fin contar lineas
        int catidadEquipos = (int) (numeroLineas / 5);
        equipos.get(catidadEquipos + 1).setEquipo(equipo.getEquipo());
        equipos.get(catidadEquipos + 1).setMarca(equipo.getMarca());
        equipos.get(catidadEquipos + 1).setCodigo(equipo.getCodigo());
        equipos.get(catidadEquipos + 1).setEstado(equipo.getEstado());
        equipos.get(catidadEquipos + 1).setDisposicion(equipo.getDisposicion());

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            //ojo cambiar
            File file = new File("src/datos/datos.txt");
            // Si el archivo no existe, se crea!
            if (!file.exists()) {
                file.createNewFile();
            }
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(equipo.getEquipo());
            bw.newLine();
            bw.write(equipo.getMarca());
            bw.newLine();
            bw.write(equipo.getCodigo());
            bw.newLine();
            bw.write(equipo.getEstado());
            bw.newLine();
            bw.write(equipo.getDisposicion());
            bw.newLine();
            System.out.println("información agregada!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        //fin de escribir equipos
    }

}
