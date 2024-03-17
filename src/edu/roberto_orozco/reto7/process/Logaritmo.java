package edu.roberto_orozco.reto7.process;

/**
 * Clase para obtener el Logaritmo
 */
public class Logaritmo extends OperacionAritmetica{

    /**
     * Metodo para calcular el logaritmo
     */
    @Override
    public double calcular(double n1, double n2) {
        double logaritmoNumero = Math.log(n1);
        double logaritmoBase = Math.log(n2);

        Division division = new Division();
        return division.calcular(logaritmoNumero, logaritmoBase);
    }
}