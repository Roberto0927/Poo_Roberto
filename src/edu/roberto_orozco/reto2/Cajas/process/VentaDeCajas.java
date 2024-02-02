package edu.roberto_orozco.reto2.Cajas.process;

import java.util.Scanner;

public class VentaDeCajas {
    public void VentadeCajas(Scanner scanner){
        System.out.println("ingrese la cantidad de cajas a vender");
        double cantidadVenta = scanner.nextDouble();

        System.out.println("Ingrese el valor de las cajas");
        double valorVenta = scanner.nextDouble();

        double ventaTotal = cantidadVenta*valorVenta;

        System.out.println("La venta realizada por" + cantidadVenta +
                "cajas al precio de" + valorVenta + "es igual a" + ventaTotal);
    }
}


