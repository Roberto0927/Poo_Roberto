package edu.roberto_orozco.reto1.process;

import java.util.Scanner;

/**
 * Esta clase sirve para realizar un calculos de masa corporal incluye los metodos:
 * Indice de masa corporal
 * Masa corporal madre
 **/
public class CalculadoraMasaCorporal {
    /**
     * Este metodo para calcular el indice de masa corporal de una persona en base a su peso
     * y altura
     * @param estatura estatura del paciente en cm
     * @param peso peso del paciente en Kg
     * @return indice de masa corporal
     */
    /**
     * Aqui le pido su peso en kg y la estatura en cm para despues convertir la estatura de cm a metros
     */
    class CalculadoraIMC {
        public void calcular(Scanner scanner) {
            System.out.print("Ingrese el peso en kg: ");
            double peso = scanner.nextDouble();

            System.out.print("Ingrese la estatura en cm: ");
            double estatura = scanner.nextDouble() / 100;

            double imc = peso / (estatura * estatura);

            System.out.println("IMC calculado: " + imc);

            /**
             * Aqui le arrojo los resultados del Indice de Masa Corporal al paciente depende del resultado
             * del cálculo
             */
            if (imc < 18.9) {
                System.out.println("Su peso es bajo");
            } else if (imc >= 18.5 && imc <= 24.99) {
                System.out.println("Su peso es normal");
            } else if (imc >= 25 && imc <= 29.99) {
                System.out.println("Usted tiene Sobrepeso");
            } else if (imc >= 30 && imc <= 34.99) {
                System.out.println("Usted tiene obesidad leve");
            } else if (imc >= 35 && imc <= 39.99) {
                System.out.println("Usted tiene obesidad media");
            } else {
                System.out.println("Usted tiene obesidad mórbida");
            }
        }
    }

    class CalculadoraMasaCorporalMagra {
        /**
         * Aqui le pido al paciente un dato mas que seria el sexo debido a que el cálculo es diferenre segun
         * el peso
         *
         * @param scanner
         */
        public void calcular(Scanner scanner) {
            System.out.print("Ingrese el peso en kg: ");
            double peso = scanner.nextDouble();

            System.out.print("Ingrese la estatura en cm: ");
            double estatura = scanner.nextDouble();

            System.out.print("Ingrese el sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            double masaCorporalMagra;

            if (sexo == 'M' || sexo == 'm') {
                masaCorporalMagra = (1.10 * peso) - 128 * (Math.pow(peso, 2) / Math.pow(estatura, 2));
            } else if (sexo == 'F' || sexo == 'f') {
                masaCorporalMagra = (1.07 * peso) - 148 * (Math.pow(peso, 2) / Math.pow(estatura, 2));
            } else {
                System.out.println("Respuesta no válida || Use M || O use F");
                return;
            }

            System.out.println("Masa corporal magra calculada: " + masaCorporalMagra + " kg");
        }
    }

    /**
     * Aqui ademas de los datos anteriores le pido al paciente su edad para el cálculo
     */
    class CalculadoraMetabolismoBasal {
        public void calcular(Scanner scanner) {
            System.out.print("Ingrese el peso en kg ");
            double peso = scanner.nextDouble();

            System.out.print("Ingrese la estatura en cm ");
            double estatura = scanner.nextDouble();

            System.out.print("Ingrese la edad ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese el sexo (M/F) ");
            char sexo = scanner.next().charAt(0);

            double metabolismoBasal;
            /**
             * Aqui depende de la edad del paciente y su sexo se hacen los cálculos
             */
            if (sexo == 'M' || sexo == 'm') {
                metabolismoBasal = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
            } else if (sexo == 'F' || sexo == 'f') {
                metabolismoBasal = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
            } else {
                System.out.println("Sexo no válido. Use M para masculino o F para femenino.");
                return;
            }

            System.out.println("Metabolismo basal calculado: " + metabolismoBasal + " kcal al día");
        }
    }
}