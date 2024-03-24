package edu.roberto_orozco.reto7.ui;

/**
 * Esta clase es para el idioma español
 */
public class Espanol extends Idiomas {

    /**
     * Constructor para declarar al idioma español
     */
    public Espanol(){
        MENU = "---Calculadora---"+
                "\nElige una opción: \n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Módulo\n6.Potencia" +
                "\n7.Logaritmo\n8.Raiz"+
                "\nIngrese el número de la opción deseada:";

        INGRESAR_PRIMERNUMERO = "Ingrese el primer número:";
        INGRESAR_SEGUNDONUMERO = "Ingrese el segundo número:";
        INGRESA_NUMERO_A_SUMAR = "Ingrese el primer numero a sumar";
        INGRESAR_SUMA = "Ingrese el segundo numero a sumar";
        INGRESAR_NUMERO_A_RESTAR = "Ingrese numero al que le quieres restar";
        INGRESAR_RESTA = "Ingresa la resta";
        INGRESAR_DIVIDIENDO = "Ingrese el dividendo:";
        INGRESAR_DIVISOR = "Ingrese el divisor";
        INGRESAR_NUMERO_POTENCIA = "Ingresar numero al que se le va aplicar la potencia";
        INGRESAR_POTENCIA = "Ingrese a que potencia lo desea elevar:";
        INGRESAR_RAIZ = "Ingresar número que le va aplicar la raíz";
        INGRESAR_RAIZZ = "Raíz a aplicar";
        FINAL = "\nPrograma Finalizado";
        OPCION_INVALIDA = "Opción no válida";
        RESULTADO_UNO = "El resultado de la ";
        RESULTADO_DOS = " es: ";
    }
}
