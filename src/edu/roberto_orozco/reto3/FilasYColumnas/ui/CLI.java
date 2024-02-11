package edu.roberto_orozco.reto3.FilasYColumnas.ui;

import java.util.Scanner;
import edu.roberto_orozco.reto3.FilasYColumnas.process.FilasYColumnas;

/**
 * en esta clase de le pedirá al usuario que ingrese la cantidad de filas y columnas a imprimir para despues
 * generar una matriz
 */
public class CLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = FilasYColumnas.generarMatriz(filas, columnas);

        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int numero : fila) {
                System.out.print(numero + "\t");
            }
            System.out.println();
        }

        FilasYColumnas.contarParesImpares(matriz);

        int sumaTotal = FilasYColumnas.sumarMatriz(matriz);
        System.out.println("\nSuma de todos los números en la matriz: " + sumaTotal);
    }
}