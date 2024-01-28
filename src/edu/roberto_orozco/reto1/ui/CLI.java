package edu.roberto_orozco.reto1.ui;

import java.util.Scanner;

public class CLI {
    public static void showMenu() {

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            /**
             * Aqui le pregunto al paciente que le gustaria calcular usando numeros para que sea mas intuitivo
             */
            while (true) {
                System.out.println("Menú:");
                System.out.println("********************************************************");
                System.out.println("1. Cálculo de masa corporal (índice de masa corporal)");
                System.out.println("2. Cálculo de masa corporal magra");
                System.out.println("3. Cálculo de metabolismo basal (gasto energético basal)");
                System.out.println("4. Salir");
                System.out.println("********************************************************");

                System.out.print("Seleccione una opción (A/B/C/D): ");
                char opcion = scanner.next().charAt(0);

                switch (opcion) {
                    case '1':
                        new CalculadoraIMC().calcular(scanner);
                        break;
                    case '2':
                        new CalculadoraMasaCorporalMagra().calcular(scanner);
                        break;
                    case '3':
                        new CalculadoraMetabolismoBasal().calcular(scanner);
                        break;
                    case '4':
                        System.out.println("Adios, Vuelva pronto");
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione 1, 2, 3, o 4.");
                }
            }
        }
    }