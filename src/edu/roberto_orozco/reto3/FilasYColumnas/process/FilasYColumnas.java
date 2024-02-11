package edu.roberto_orozco.reto3.FilasYColumnas.process;

import java.util.Random;

/**
 * En esta clase se esta generando la matriz con números aleatorios con la cantidad de filas y columnas
 * que el usuario haya ingresado
 */
public class FilasYColumnas {
    public static int[][] generarMatriz(int filas, int columnas) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
        return matriz;
    }

    /**
     * En este metodo se esta contando la cantidad de pares e impares de cada columna e imprimiendo
     * el conteo de filas y columnas
     * * @param matriz
     */
    public static void contarParesImpares(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        System.out.println("\nConteo por filas:");
        for (int i = 0; i < filas; i++) {
            int pares = 0, impares = 0;
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Fila " + (i + 1) + ": Pares = " + pares + ", Impares = " + impares);
        }

        System.out.println("\nConteo por columnas:");
        for (int j = 0; j < columnas; j++) {
            int pares = 0, impares = 0;
            for (int i = 0; i < filas; i++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Columna " + (j + 1) + ": Pares = " + pares + ", Impares = " + impares);
        }
    }

    public static int sumarMatriz(int[][] matriz) {
        int sumaTotal = 0;
        for (int[] fila : matriz) {
            for (int numero : fila) {
                sumaTotal += numero;
            }
        }
        return sumaTotal;
    }
}