package edu.roberto_orozco.reto3.Diccionario.ui;

import java.util.Scanner;
import edu.roberto_orozco.reto3.Diccionario.process.Diccionario;

public class CLI {
    private static Diccionario diccionario = new Diccionario();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion;

        do {
            mostrarMenu();
            opcion = scanner.next();
            procesarOpcion(opcion);
        } while (!opcion.equalsIgnoreCase("S"));

        scanner.close();
    }

    /**
     * Aqui se le muestra al usuario sus 4 opciones a elegir
     */
    private static void mostrarMenu() {
        System.out.println("------Diccionario------:");
        System.out.println("A. Enlistar palabras del diccionario");
        System.out.println("B. Buscar palabras en el diccionario");
        System.out.println("C. Detalle del diccionario");
        System.out.println("S. Finalizar programa");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Aqui depende de la eleccion del usuario se manda a llamar un metodo distinto de la clase diccionario
     * @param opcion
     */
    private static void procesarOpcion(String opcion) {
        switch (opcion.toUpperCase()) {
            case "A":
                diccionario.listarPalabras();
                break;
            case "B":
                buscarPalabra();
                break;
            case "C":
                diccionario.detalleDiccionario();
                break;
            case "S":
                System.out.println("Finalizando programa.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
        }
    }

    /**
     * Aqui se le pide al usuario en caso de elegir la opcion B ingresar la palabra que desea buscar
     */
    private static void buscarPalabra() {
        System.out.print("Ingrese la palabra que desea buscar: ");
        String palabra = scanner.next();
        diccionario.buscarPalabra(palabra);
    }
}