package edu.roberto_orozco.reto7.ui;
import edu.roberto_orozco.reto7.process.Suma;
import edu.roberto_orozco.reto7.process.Resta;
import edu.roberto_orozco.reto7.process.Division;
import edu.roberto_orozco.reto7.process.Modulo;
import edu.roberto_orozco.reto7.process.Multiplicacion;
import edu.roberto_orozco.reto7.process.Logaritmo;
import edu.roberto_orozco.reto7.process.Potencia;
import edu.roberto_orozco.reto7.process.OperacionAritmetica;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    private static double n1;
    private static double n2;

    public static void showMenu(){
        System.out.println("---Calculadora---");

        System.out.println("Elige una opción: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Modulo");
        System.out.println("6. Potencia");
        System.out.println("7. Logaritmo");
        System.out.println("Ingrese el numero de la opción deseada: ");

    }

    public static void launchCalculadora(){
        showMenu();
        int opcion = scanner.nextInt();
        OperacionAritmetica operacion = null;
        switch (opcion){
            case 1:
                System.out.println("Ingrese el primer número:");
                n1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                n2 = scanner.nextDouble();
                operacion = new Suma();
                break;
            case 2:
                System.out.println("Ingrese el primer número:");
                n1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                n2 = scanner.nextDouble();
                operacion = new Resta();
                break;
            case 3:
                System.out.println("Ingrese el primer número:");
                n1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                n2 = scanner.nextDouble();
                operacion = new Multiplicacion();
                break;
            case 4:
                System.out.println("Ingrese el dividendo:");
                n1 = scanner.nextDouble();

                System.out.println("Ingrese el divisor:");
                n2 = scanner.nextDouble();
                operacion = new Division();
                break;
            case 5:
                System.out.println("Ingrese el dividendo:");
                n1 = scanner.nextDouble();

                System.out.println("Ingrese el divisor:");
                n2 = scanner.nextDouble();
                operacion = new Modulo();
                break;
            case 6:
                System.out.println("Ingrese el número:");
                n1 = scanner.nextDouble();

                System.out.println("Ingrese a que potencia lo desea elevar:");
                n2 = scanner.nextDouble();
                operacion = new Potencia();
                break;
            case 7:
                System.out.println("Ingrese el primer número:");
                n1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                n2 = scanner.nextDouble();
                operacion = new Logaritmo();
                break;
            default:
                System.out.println("Opcion no valida, intenta de nuevo");
        }
        if (operacion != null) {
            System.out.println("El resultado es: " + operacion.calcular(n1, n2));
            System.out.println("\nGracias por usar el programa");
        } else {
            System.out.println("Opción no válida, intenta de nuevo");
        }
    }
}