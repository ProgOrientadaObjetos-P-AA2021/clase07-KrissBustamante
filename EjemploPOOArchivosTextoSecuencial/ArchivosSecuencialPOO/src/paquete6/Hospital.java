/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author nixon
 */
public class Hospital {
    // TODO code application logic here

    String nombre;
    int numeroCamas;
    double presupuesto;

    public Hospital(String n, int nc, double c) {
        nombre = n;
        numeroCamas = nc;
        presupuesto = c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumeroCamas(int n) {
        numeroCamas = n;
    }

    public void establecerPesupuesto(double n) {
        presupuesto = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPesupuesto() {
        return presupuesto;
    }
}

/* 
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
 */
