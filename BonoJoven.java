/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Calendar;

/**
 *
 * @author Alumno
 */
public class BonoJoven extends BonoBus {

    protected String nombre;
    protected String apellidos;
    protected byte edad;
    protected String dni;

    public BonoJoven(String nombre, String apellidos, String dni, byte edad) {
        if (edad > 24) {
            this.nombre = " ";
            this.apellidos = " ";
            this.edad = 0;
            this.dni = " ";
        } else {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.edad = edad;
            FECHA_VALIDEZ = Calendar.getInstance();
        }

    }

    public boolean pagarUnViaje(String dni) {

        boolean bonoJoven = this.dni.equals(dni);
        if (bonoJoven) {
            super.pagarUnViaje();
        }
        return bonoJoven;
    }
}

