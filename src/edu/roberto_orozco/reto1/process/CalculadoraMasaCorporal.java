package edu.roberto_orozco.reto1.process;

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
    public static double calcularIndiceMasaCorporal(double estatura, double peso) {
        return peso / Math.pow(estatura, 2);


    }
}

