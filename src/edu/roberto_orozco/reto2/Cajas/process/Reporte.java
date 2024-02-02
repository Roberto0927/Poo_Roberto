package edu.roberto_orozco.reto2.Cajas.process;

import java.util.Scanner;
import edu.roberto_orozco.reto2.Cajas.process.CompraDeCajas;
import edu.roberto_orozco.reto2.Cajas.process.VentaDeCajas;

public class Reporte {
    public void ReporteFinal(Scanner scanner){
        System.out.println("Cantidad total de ventas: " + ventaTotal);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("Monto en la caja: " + montoCaja);
    }

}
