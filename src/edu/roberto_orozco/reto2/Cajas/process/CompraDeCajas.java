package edu.roberto_orozco.reto2.Cajas.process;


public class CompraDeCajas {

    int totalOperaciones = 0;
    int totalVentas = 0;
    int totalCompras = 0;
    double montoCaja = 0;
    double ingresosVentas = 0;
    double egresosCompras = 0;

    /**
     * Aqui le pedimos al cliente la cantidad de cajas a comprar y a que precio, despues multiplicamos estos
     * dos valores y le sumamos el resultado a "egresosCompra" y se lo restamos a "montoCaja"
     * Tambien le sumamos a "totalCompras" la cantidad de cajas compradas y sumamos un 1 a "totalOperaciones"
     * @param cantidad
     * @param costo
     */
    public void comprarCajas(int cantidad, double costo) {
        montoCaja -= cantidad*costo;
        egresosCompras += costo*cantidad;
        totalCompras += cantidad;
        totalOperaciones++;
        System.out.println("La compra realizada por " + cantidad + " cajas al costo " + costo +
                " es igual a " + (cantidad*costo));
    }

    /**
     * Aqui le pedimos al cliente la cantidad de cajas a vender y a que precio, despues multiplicamos estos
     * dos valores y le sumamos el resultado a "montoCaja" y a "ingresosVentas"
     * Tambien le sumamos a "totalVentas" la cantidad de cajas vendidas y sumamos un 1 a "totalOperaciones"
     * @param cantidad
     * @param precio
     */
    public void venderCajas(int cantidad, double precio) {
        montoCaja += cantidad*precio;
        ingresosVentas += precio*cantidad;
        totalVentas += cantidad
        ;
        totalOperaciones++;
        System.out.println("La venta realizada por " + cantidad + " cajas al precio de " + precio +
                " es igual a " + (cantidad*precio));
    }

    /**
     * Aqui se imprimen los totales de las variables ya previas declaradas para dar un reporte "final"
     */
    public void mostrarReporte() {
        System.out.println("Cantidad total de ventas: " + totalVentas);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("Monto en la caja: " + montoCaja);
    }

    public int getTotalOperaciones() {
        return totalOperaciones;
    }

    /**
     * Aqui tenemos el mensaje de despedida que se imprimira en caso de seleccionar la opcion 4 en CLI
     */
    public void mostrarDespedida() {
        System.out.println("\nResumen de actividades:");
        System.out.println("Cantidad total de operaciones realizadas: " + totalOperaciones);
        System.out.println("Cantidad total de ventas: " + totalVentas);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Monto en la caja: " + montoCaja);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("Gracias por comprar y vender cajas con nosotros.");
    }
}
