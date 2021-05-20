/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import java.io.Serializable;
/**
 *
 * @author USUARIO
 */
public class Hospital implements Serializable {
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

