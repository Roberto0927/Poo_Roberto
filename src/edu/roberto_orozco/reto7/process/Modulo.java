package edu.roberto_orozco.reto7.process;

/**
 * Clase para obtener el modulo de una division
 */
public class Modulo extends Resta{

    /**
     * Metodo extendido de la clase Resta para calcular la multiplicación
     */
    @Override
    public double calcular(double n1, double n2) {
        while (n1 >= n2 ){
            n1 = new Resta().calcular(n1, n2);
        }
        return n1;
    }
}
