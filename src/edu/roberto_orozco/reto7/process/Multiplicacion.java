package edu.roberto_orozco.reto7.process;

/**
 * Clase para obtener la multiplicación
 */
public class Multiplicacion extends Suma{

    /**
     * Metodo extendido de la clase Suma para calcular la multiplicación
     */
    @Override
    public double calcular(double n1, double n2) {
        double resultado=0;
        for (int i = 0; i < n2; i++){
            resultado= new Suma().calcular(resultado,n1);
        }
        return resultado;
    }
}