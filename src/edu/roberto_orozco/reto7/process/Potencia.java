package edu.roberto_orozco.reto7.process;


/**
 * Clase para obtener la potencia
 */
public class Potencia extends OperacionAritmetica{

    /**
     *  Metodo para calcular la potencia
     */
    @Override
    public double calcular(double n1, double n2) {
        double resultado = 1;
        for(int i = 0; i < n2; i++){
            resultado = new Multiplicacion().calcular(resultado,n1);
        }
        return resultado;
    }
}
