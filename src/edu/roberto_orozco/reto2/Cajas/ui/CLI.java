package edu.roberto_orozco.reto2.Cajas.ui;

import java.util.Scanner;
import edu.roberto_orozco.reto2.Cajas.process.CompraDeCajas;

public class CLI {
    public static void showMenu() {

        Scanner scanner = new Scanner(System.in);
        CompraDeCajas controlCajasPapel = new CompraDeCajas();

        boolean salir = false;
/**
 * Primero le pregunto al cliente si le gustaria comprar cajas,vender cajas,mostrar el reporte de la compra
 * y venta de cajas o salir del programa
 */
        while (!salir) {
            System.out.println("////////////////////////////////////");
            System.out.println("Menú:");
            System.out.println("1. Comprar cajas de papel");
            System.out.println("2. Vender cajas de papel");
            System.out.println("3. Mostrar reporte");
            System.out.println("4. Salir del programa");
            System.out.print("Seleccione una opción: ");
            System.out.println("\n////////////////////////////////////");

            int opcion = scanner.nextInt();
/**
 * En caso de escoger la opcion 1, se le pide al cliente el numero de cajas a comprar y el precio de cada
 * una de ellas
 */
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de cajas a comprar: ");
                    int cajasCompra = scanner.nextInt();
                    System.out.print("Ingrese el costo de las cajas a comprar: ");
                    double costoCompra = scanner.nextDouble();
                    controlCajasPapel.comprarCajas(cajasCompra, costoCompra);
                    break;
/**
 * En caso de escoger la opcion 2, se le pide al cliente el numero de cajas a vender y el precio de cada
 *  una de ellas
 */
                case 2:
                    System.out.print("Ingrese el número de cajas a vender: ");
                    int cajasVenta = scanner.nextInt();
                    System.out.print("Ingrese el precio de las cajas a vender: ");
                    double precioVenta = scanner.nextDouble();
                    controlCajasPapel.venderCajas(cajasVenta, precioVenta);
                    break;
/**
 * En caso de escoger la opcion 3 se le mostrara el reporte de las ventas y compras de cajas arrojando un
 * total en cada una de ellas
 */
                case 3:
                    controlCajasPapel.mostrarReporte();
                    break;
/**
 * Y en caso de escoger la opcion 4 el programa se cerrara imprimiendo todos los datos hasta el momento
 * con un mensaje de despedida
  */
                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }

        controlCajasPapel.mostrarDespedida();
    }
}
