package edu.roberto_orozco.reto7.process;

/**
 * Clase para obtener el Logaritmo
 */
public class Logaritmo extends Division{

    /**
     * Metodo etendido de la clase Division para calcular el logaritmo
     */
    @Override
    public double calcular(double n1, double n2) {
        double logaritmo = 0;
        double argumento = n1;
        while (argumento > 1) {
            argumento = super.calcular(argumento, n2);
            logaritmo++;
        }
        return logaritmo;
    }
}