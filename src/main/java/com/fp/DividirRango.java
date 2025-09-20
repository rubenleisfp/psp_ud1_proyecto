package com.fp;

import java.util.ArrayList;
import java.util.List;

public class DividirRango {


    /**
     * Divide el rango entre minimo y maximo en numRangos sub-rangos
     * @param minimo inicio del rango
     * @param maximo fin del rango
     * @param numRangos numero de sub-rangos a dividir
     * @return una lista de sub-rangos (Rango) que dividieron el rango
     */
    public List<Rango> dividir(int minimo , int maximo, int numRangos) {
        throw new UnsupportedOperationException("A completar por el estudiante");
    }

    public static void main(String[] args) {
        DividirRango dividirRango = new DividirRango();
        List<Rango> rangos = dividirRango.dividir(5, 14, 3);
        for (Rango rango : rangos) {
            System.out.println(rango);
        }
    }

}