package com.fp;

import java.io.*;
import java.util.List;

public class DistribuirPrimos {

    static final int NUM_PROCESOS = 2;
    static final String PREFIJO_FICHEROS = "fich";


    /**
     * Punto de entrada de la clase. Se encarga de lanzar los procesos que calculan el n mero de primos en un rango determinado
     * y de sumar los resultados parciales de cada proceso
     *
     * @throws IOException si hay un problemao al abrir el fichero
     * @throws InterruptedException si hay un problemao al esperar a que terminen los procesos
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        //1. Crear una instancia de lanzadorSumador
        LanzadorPrimos lanzadorPrimos = new LanzadorPrimos();

        //2. Obtener los valores minimo y maximo de nuestro rango
        int minimo = 1;
        int maximo = 100;

        System.out.println("Primer argumento: " + minimo);
        System.out.println("Segundo argumento: " + maximo);

        //3. Llamar a DividirRango para dividir el intervalo inicial entre el numero de procesos
        DividirRango dividirRango = new DividirRango();
        List<Rango> rangos = dividirRango.dividir(minimo, maximo, NUM_PROCESOS);

        //4. Iterar sobre los rangos obtenidos y llamar a lanzarPrimeros con el minimo, maximo y nombre de fichero(1,2,...n)
        int i=1;
        for (Rango rango: rangos) {
            String nombreFich = PREFIJO_FICHEROS + i;
            lanzadorPrimos.lanzarPrimos(rango.getMinimo(), rango.getMaximo(), nombreFich);
            i++;
        }

        //5. Esperamos un tiempo prudente para que todos los procesos terminen
        Thread.sleep(5000);

        //6. Llamar a getSumaTotal para obtener la suma parcial de cada proceso y sumarla
        int sumaTotal = getCalculoTotal(NUM_PROCESOS);

        //7. Mostrar el resultado por pantalla
        System.out.println("N mero total de primos: " + sumaTotal);
    }


    /**
     * Obtiene la suma total de los resultados parciales de cada fichero
     *
     * @param numFicheros numero de ficheros que quiero sumar
     * @return suma total de los resultados parciales
     */
    public static int getCalculoTotal(int numFicheros) {
        // Iterar sobre cada fichero creado y obtener el calculo parcial del mismo llamando a getResultadoFichero
        // Sumar los calculos parciales
        int sumaTotal = 0;
        for (int i = 1; i <= numFicheros; i++) {
            sumaTotal += getResultadoFichero(PREFIJO_FICHEROS + i);
        }
        return sumaTotal;
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
        int suma = 0;
        try (FileInputStream fichero = new FileInputStream(nombreFichero);
             InputStreamReader fir = new InputStreamReader(fichero);
             BufferedReader br = new BufferedReader(fir)) {

            String linea = br.readLine();
            suma = Integer.parseInt(linea); // Cambiado a parseInt

        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir " + nombreFichero);
        } catch (IOException e) {
            System.out.println("No hay nada en " + nombreFichero);
        } catch (NumberFormatException e) {
            System.out.println("Formato de número incorrecto en " + nombreFichero);
        }
        return suma;
    }
}