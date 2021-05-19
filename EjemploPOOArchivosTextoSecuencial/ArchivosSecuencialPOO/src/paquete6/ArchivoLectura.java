/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nixon
 */
public class ArchivoLectura {

    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Hospital> lista;

    public ArchivoLectura(String n) {
        nombreArchivo = n;

        rutaArchivo = String.format("data/%s",
                obtenerNombreArchivo());
        File f = new File(rutaArchivo);
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
            } // fin de try
            catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    // establecer valores de cada línea
    // en la lista de tipo Profesor
    public void establecerLista() {
        lista = new ArrayList<>();
        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")));
                Hospital h = new Hospital(linea_partes.get(0),
                        Integer.parseInt(linea_partes.get(1)),
                        Double.parseDouble(linea_partes.get(2).replace(",",
                                ".")));
                lista.add(h);

            } // fin de while
        }
    }

    public ArrayList<Hospital> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "Lista de Hospitales:\n";

        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%s(%d) %s ; %d| %.2f\n", cadena,
                    i + 1,
                    obtenerLista().get(i).obtenerNombre(),
                    obtenerLista().get(i).obtenerNumeroCamas(),
                    obtenerLista().get(i).obtenerPesupuesto());
        }

        return cadena;
    }
}
