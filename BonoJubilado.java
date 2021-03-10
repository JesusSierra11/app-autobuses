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
public class BonoJubilado extends BonoJoven {

    private final Calendar FECHA_VALIDEZ;

    public BonoJubilado(String nombre, String apellidos, String dni, byte edad) {
        super(nombre, apellidos, dni, edad);
        Calendar cal = Calendar.getInstance();
        FECHA_VALIDEZ = cal;
        if (edad < 65) {
            this.nombre = " ";
            this.apellidos = " ";
            this.edad = 0;
            this.dni = " ";
        } else {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.dni = dni;
            this.edad = edad;

        }
    }

    @Override
    public boolean pagarUnViaje(String dni) {

        boolean bonoJubilado = this.dni.equals(dni);
        if (bonoJubilado) {
            super.pagarUnViaje();
        }
        return bonoJubilado;
    }
}
