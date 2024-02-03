package edu.roberto_orozco.reto2.Cajas.process;

import java.util.Scanner;

public class CompraDeCajas {
    private double cantidadCompra;
    private double valorCompra;

    public void realizarCompra(Scanner scanner) {
        System.out.println("Ingrese la cantidad de cajas a comprar:");
        cantidadCompra = scanner.nextDouble();

        System.out.println("Ingrese el valor de las cajas:");
        valorCompra = scanner.nextDouble();
    }

    public double getCantidadCompra() {
        return cantidadCompra;
    }

    public double getValorCompra() {
        return valorCompra;

    }
}