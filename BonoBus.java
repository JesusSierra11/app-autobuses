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
public class BonoBus {

    protected static final int PRECIO_BILLETE = 2;

    private final int id;
    protected float saldo = 0;
    private final Calendar FECHA_CREACION;
    protected Calendar FECHA_VALIDEZ;
    private static int cantidadBonoBus;

    public BonoBus() {
        this.id = cantidadBonoBus++;
        Calendar cal = Calendar.getInstance();
        FECHA_CREACION = cal;
        cal.add(cal.YEAR, +2);
        FECHA_VALIDEZ = cal;
    }

    public boolean pagarUnViaje() {
        boolean subirse, bonoJoven, bonoJubilado;
        bonoJoven = this.getClass() == BonoJoven.class;
        bonoJubilado = this.getClass() == BonoJubilado.class;
        subirse = saldo >= PRECIO_BILLETE;
        if (bonoJoven) {
            saldo -= PRECIO_BILLETE / 2;
        } else if (bonoJubilado && subirse) {
            saldo -= PRECIO_BILLETE / 3;
        } else if (subirse) {
            saldo -= PRECIO_BILLETE;
        }
        return subirse;

    }

    public boolean pagarNViajes(int cantidad) {
        boolean subirse;
        subirse = saldo >= cantidad * PRECIO_BILLETE;

        if (subirse) {
            saldo -= PRECIO_BILLETE;
        }

        return subirse;

    }

    public void recargarSaldo(float cantidad) {
        saldo += cantidad;
    }

    public float getSaldo() {
        return saldo;
    }

    public Calendar getFECHA_VALIDEZ() {
        return FECHA_VALIDEZ;
    }

}

