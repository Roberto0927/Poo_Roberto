package edu.roberto_orozco.reto1.ui;

import edu.roberto_orozco.reto1.process.CalculadoraMasaCorporal;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        System.out.println("Hola Persona");
        System.out.println("********************");
        System.out.println("Elige una opción");
        System.out.println("1. Calculo de masa corporal");
        System.out.println("2. ");
        System.out.println("3. Calculo de metabolismo basal.");
        System.out.println("4. Salir");
    }
    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);
        showMenu();
        int opcion = scanner.nextInt();

      switch(opcion){
          case 1:
              double imc = CalculadoraMasaCorporal.calcularIndiceMasaCorporal();
              String estado =
          }
              System.out.printf("Tu indice de masa corporal es %f por lo que se considera estas en un estado de %s")
              break;
        case 2:
            double imc = CalculadoraMasaCorporal.calcularIndiceMasaCorporal();
            String estado =
    }
              System.out.printf("Tu indice de masa corporal es %f por lo que se considera estas en un estado de %s")
                      break;
      }
    }
}
