package com.fp;

import java.io.*;
import java.util.List;

public class DistribuirPrimos {

    static final int NUM_PROCESOS = 5;
    static final String PREFIJO_FICHEROS = "fich";


    /**
     * Punto de entrada de la clase. Se encarga de lanzar los procesos que calculan el numero de primos
     * en un rango determinado y de sumar los resultados parciales de cada proceso
     *
     * @throws IOException si hay un problemao al abrir el fichero
     * @throws InterruptedException si hay un problemao al esperar a que terminen los procesos
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        //1. Crear una instancia de LanzadorPrimos
        //2. Obtener los valores minimo y maximo de nuestro rango
        //3. Llamar a DividirRango para dividir el intervalo inicial entre el numero de procesos
        //4. Iterar sobre los rangos obtenidos y llamar a LanzadorPrimos con el minimo, maximo y nombre de fichero(1,2,...n)
        //5. Esperamos un tiempo prudente para que todos los procesos terminen
        //6. Llamar a getCalculoTotal para obtener el resultado parcial de cada fichero
        //7. Mostrar el resultado por pantalla
        throw new UnsupportedOperationException("A completar por el estudiante");

    }


    /**
     * Obtiene la suma total de los resultados parciales de cada fichero
     *
     * @param numFicheros numero de ficheros
     * @return suma total de los resultados parciales
     */
    public static int getCalculoTotal(int numFicheros) {
        // Iterar sobre cada fichero creado y obtener el calculo parcial del mismo llamando a getResultadoFichero
        // Sumar los calculos parciales
        throw new UnsupportedOperationException("A completar por el estudiante");
    }


    /**
     * Obtiene el contenido del fichero recibido como argumento
     * y me devuelve el resultado de un calculo parcial de primos
     *
     * @param nombreFichero ruta del fichero que quiero abrir para obtener el resultado parcial de la suma
     *                      fich1, fich2, ... ,fichn
     * @return
     */
    public static int getResultadoFichero(String nombreFichero) {
        throw new UnsupportedOperationException("A completar por el estudiante");
    }
}