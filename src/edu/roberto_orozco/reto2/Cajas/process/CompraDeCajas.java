package edu.roberto_orozco.reto2.Cajas.process;

import java.util.Scanner;
public class CompraDeCajas {
    public void CompradeCajas(Scanner scanner){
        System.out.println("ingrese la cantidad de cajas a comprar");
        double cantidadCompra = scanner.nextDouble();

        System.out.println("Ingrese el valor de las cajas");
        double valorCompra = scanner.nextDouble();

        double compraTotal =cantidadCompra*valorCompra;

        System.out.println("La venta realizada por" + cantidadCompra +
                "cajas al precio de" + valorCompra + "es igual a" + compraTotal);

    }
}
