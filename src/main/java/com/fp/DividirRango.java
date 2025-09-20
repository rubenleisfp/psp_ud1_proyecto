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
        List<Rango> rangos = new ArrayList<>();
        int totalNumeros = maximo - minimo + 1;  // Total de números a sumar
        int salto = totalNumeros / numRangos;  // Cantidad de números por proceso
        for (int i = 1; i <= numRangos; i++) {
            int resultadoSumaConSalto = minimo + salto - 1;

            // Si es el último proceso, sumamos el resto al último rango
            if (i == numRangos) {
                resultadoSumaConSalto = maximo;
            }

            Rango rango = new Rango(minimo,resultadoSumaConSalto);
            rangos.add(rango);
            minimo = resultadoSumaConSalto + 1;
        }
        return rangos;
    }

    public static void main(String[] args) {
        DividirRango dividirRango = new DividirRango();
        List<Rango> rangos = dividirRango.dividir(5, 14, 3);
        for (Rango rango : rangos) {
            System.out.println(rango);
        }
    }

}