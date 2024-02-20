package edu.roberto_orozco.reto4.data;

import java.util.ArrayList;

public class Boleto {
    private final String nombreComprador;
    private final int cantidadBoletos;
    private final ArrayList<pasajero.Pasajero> listaPasajeros;

    /**
     * Constructor
     * @param nombreComprador
     * @param cantidadBoletos
     */
    public Boleto(String nombreComprador, int cantidadBoletos) {
        this.nombreComprador = nombreComprador;
        this.cantidadBoletos = cantidadBoletos;
        this.listaPasajeros = new ArrayList<>();
    }

    /**
     * gregamos pasajero adicional a nuestra lista
     * @param pasajero
     */
    public void AnadirPasajero(pasajero.Pasajero pasajero) {
        listaPasajeros.add(pasajero);
    }

    /**
     * Calculo del boleto
     * @return
     */
    public double calcularImporte() {
        return cantidadBoletos * 1250.50;
    }

    /**
     * Obtenemos la cantidad de boletos
     * @return
     */
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    /**
     * Devolvemos una representacion en cadena del boleto
     * @return
     */
    @Override
    public String toString() {
        return "Comprador: " + nombreComprador +
                ", Cantidad de Boletos: " + cantidadBoletos +
                ", Importe: $" + calcularImporte() +
                ", Pasajeros adicionales: " + listaPasajeros;
    }
}
