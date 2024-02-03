package edu.roberto_orozco.reto2.Cajas.process;
import edu.roberto_orozco.reto2.Cajas.process.CompraDeCajas;
import java.util.Scanner;

public class Reporte {
public static double totalVenta;
    public void reporteFinal(Scanner scanner){
        CompraDeCajas compraDeCajas = new CompraDeCajas();
        // Realiza la compra antes de obtener los valores
        compraDeCajas.realizarCompra(scanner);

        // Obtener los valores de la compra
        double cantidadCompra = compraDeCajas.getCantidadCompra();
        double valorCompra = compraDeCajas.getValorCompra();

        // Realizar operaciones con las variables
        double compraTotal = cantidadCompra * valorCompra;

        totalVenta = (cantidadCompra*valorCompra);

        // Imprimir resultados
        System.out.println("Cantidad total de cajas compradas: " + cantidadCompra);
        System.out.println("Valor unitario de las cajas: " + valorCompra);
        System.out.println("Compra total: " + compraTotal);
    }
}
