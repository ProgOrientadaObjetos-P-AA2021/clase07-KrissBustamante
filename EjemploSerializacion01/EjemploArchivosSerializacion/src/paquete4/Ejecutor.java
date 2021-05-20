/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author nixon
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombreArchivo = "hospitales.txt";

        Hospital h1 = new Hospital("Hospital Isidro ayora", 45, 304.5);
        Hospital h2 = new Hospital("Hospital UTPL", 67, 857.6);
        Hospital h3 = new Hospital("Hospital Loja", 56, 756.4);

        Hospital[] lista = {h1, h2, h3};

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        // establecer el valor del atributo registro
        archivo.establecerRegistro(h1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerLista();
        
        
        System.out.println(lectura);
    }
}
