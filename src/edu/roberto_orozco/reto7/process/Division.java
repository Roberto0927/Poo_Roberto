package edu.roberto_orozco.reto7.process;

/**
 * Clase para obtener la division
 */
public class Division extends OperacionAritmetica {

    /**
     * Metodo para calcular la division
     */
    @Override
    public double calcular(double n1, double n2) {
        double cociente = 0;
        while (n1 >= n2) {
            n1 = new Resta().calcular(n1, n2);
            cociente++;
        }
        return cociente;
    }
}