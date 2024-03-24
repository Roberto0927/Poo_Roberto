package edu.roberto_orozco.reto7.process;


/**
 * Clase para la obtener la resta
 */
public class Resta extends OperacionAritmetica {

    /**
     * Metodo extendido de la clase OperacionAritmetica para calcular la resta
     */
    @Override
    public double calcular(double n1, double n2) {
        return n1 - n2;
    }
}