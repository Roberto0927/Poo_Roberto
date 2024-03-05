package edu.roberto_orozco.reto5.ejercicio3;
import java.util.ArrayList;

public class Carrito {
    private ArrayList <ItemsLista> productos;

    public void setProductos(ArrayList<ItemsLista> productos) {
        this.productos = productos;
    }

    public void agregarProductos(){
    }

    public void elimmiarProductos(){
    }

    public double generarImporteTotal(){
        double total = 0;
        for (ItemsLista producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}