package edu.roberto_orozco.reto5.ejercicio5;
import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private ArrayList<Producto> productos;
    private int cantidad;
    private double total;

    public Pedido(int numeroPedido, ArrayList<Producto> productos, int cantidad, double total) {
        this.numeroPedido = numeroPedido;
        this.productos = productos;
        this.cantidad = cantidad;
        this.total = total;
    }

    public void procesarCompra() {
    }

    public double totalImpuesto() {
        return total;
    }

    public void mostrarTicket() {
    }
}