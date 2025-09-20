package com.fp;

public class PrimoProcess {

    /**
     * Cuenta el numero de primos entre n1 y n2 (inclusive)
     * @param n1 inicio del rango
     * @param n2 fin del rango
     * @return el numero de primos entre n1 y n2
     */
    public int numeroPrimos(int n1, int n2) {
        int contador = 0;
        for (int i = n1; i <= n2; i++) {
            if (esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Comprueba si el numero es primo
     * @param n numero a comprobar
     * @return true si el numero es primo, false en caso contrario
     */
    private boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimoProcess process = new PrimoProcess();
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int resultado = process.numeroPrimos(n1, n2);
        System.out.println(resultado);
    }
}