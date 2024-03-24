package edu.roberto_orozco.reto7.ui;
import edu.roberto_orozco.reto7.process.*;
import java.util.Scanner;


    public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    private static double n1;
    private static double n2;
        /**
         *  Se declara con el idioma Español de predeterminado
         */
    private static Idiomas idiomas = new Espanol();

    /**
     * Clase para escoger idioma (Ingles/Español)
     */
    public static void showMenu(){

        System.out.println("Escoga un idioma (Choose a language:): ");
        System.out.println("A. Español (Spanish)");
        System.out.println("B. Ingles (English)");
        String idioma = scanner.nextLine();

        switch (idioma){
            case "A":
                idiomas = new Espanol();
                break;
            case "B":
                idiomas = new Ingles();

                break;
        }
        System.out.println(idiomas.MENU);
    }

    public static void launchCalculadora(){
        showMenu();
        int opcion = scanner.nextInt();
        OperacionAritmetica operacion = null;
        switch (opcion){
            case 1:
                /**
                 * Aqui se manda a llamar las variables de idiomas de los textos
                 */
                System.out.println(idiomas.INGRESA_NUMERO_A_SUMAR);
                n1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_SUMA);
                n2 = scanner.nextDouble();
                operacion = new Suma();
                break;
            case 2:
                System.out.println(idiomas.INGRESAR_NUMERO_A_RESTAR);
                n1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_RESTA);
                n2 = scanner.nextDouble();
                operacion = new Resta();
                break;
            case 3:
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                n1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
                n2 = scanner.nextDouble();
                operacion = new Multiplicacion();
                break;
            case 4:
                System.out.println(idiomas.INGRESAR_DIVIDIENDO);
                n1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_DIVISOR);
                n2 = scanner.nextDouble();
                operacion = new Division();
                break;
            case 5:
                System.out.println(idiomas.INGRESAR_DIVIDIENDO);
                n1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_DIVISOR);
                n2 = scanner.nextDouble();
                operacion = new Modulo();
                break;
            case 6:
                System.out.println(idiomas.INGRESAR_NUMERO_POTENCIA);
                n1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_POTENCIA);
                n2 = scanner.nextDouble();
                operacion = new Potencia();
                break;
            case 7:
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                n1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
                n2 = scanner.nextDouble();
                operacion = new Logaritmo();
                break;
            case 8:
                System.out.println(idiomas.INGRESAR_RAIZ);
                n1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_RAIZZ);
                n2 = scanner.nextDouble();
                operacion = new Raiz();
                break;
        }
        if (operacion != null) {
            printResult(operacion,n1,n2);
            System.out.println(idiomas.FINAL);
        } else {
            System.out.println(idiomas.OPCION_INVALIDA);

        }
    }

    /**
     * Metodo para imprimir los resultados de las operaciones
     */
    public static void printResult(OperacionAritmetica operacion, double num1, double num2 ){
        System.out.println(idiomas.RESULTADO_UNO + operacion.getClass().getSimpleName() + idiomas.RESULTADO_DOS
                + operacion.calcular(num1,num2));
    }
}