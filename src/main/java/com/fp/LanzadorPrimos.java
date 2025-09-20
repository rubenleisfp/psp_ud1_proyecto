package com.fp;

import java.io.File;

public class LanzadorPrimos {


    /**
     * Lanza un proceso que calculara el numero de primos entre n1 y n2
     * y escribe el resultado en el fichero especificado
     *
     * @param n1      primer numero del rango
     * @param n2      segundo numero del rango
     * @param fichResultado      nombre del fichero donde se escribira el resultado
     */
    public void lanzarPrimos(Integer n1, Integer n2, String fichResultado) {
        throw new UnsupportedOperationException("A completar por el estudiante");
    }

    public static void main(String[] args) {
        LanzadorPrimos l = new LanzadorPrimos();
        l.lanzarPrimos(1, 5, "result1.txt");
        l.lanzarPrimos(6, 10, "result2.txt");
        System.out.println("Ok");
    }
}