package edu.roberto_orozco.reto2.Cajas.ui;

import edu.roberto_orozco.reto2.Cajas.process.CompraDeCajas;
import edu.roberto_orozco.reto2.Cajas.process.VentaDeCajas;
import edu.roberto_orozco.reto2.Cajas.process.Reporte;

import java.util.Scanner;

public class CLI {

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        /**
         * Aquí le pregunto al cliente que le gustaría hacer (Comprar,vender o mostrar el reporte de las cajas
         * de papel)
         */
        while (true) {
            System.out.println("Menú:");
            System.out.println("********************************************************");
            System.out.println("1. Comprar cajas de papel)");
            System.out.println("2. Vender cajas de papel");
            System.out.println("3. Mostrar reporte");
            System.out.println("4. Salir");
            System.out.println("********************************************************");

            System.out.print("Seleccione una opción (1/2/3/4): ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    new CompraDeCajas().realizarCompra(scanner);
                    break;
                case 2:
                    new VentaDeCajas().VentadeCajas(scanner);
                    break;
                case 3:
                    new Reporte().reporteFinal(scanner);
                    break;
                case 4:
                    System.out.println("Adiós, vuelva pronto");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione 1, 2, 3, o 4.");
            }
        }
    }

    public static void main(String[] args) {
        showMenu();
    }
}