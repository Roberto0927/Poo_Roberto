package edu.roberto_orozco.reto5.ejercicio3;

public class Producto {
    private String nombre;
    double precio;
    private String categoria;

    public Producto(String nombre, int precio, String categoria){
        this.nombre=nombre;
        this.precio=precio;
        this.categoria=categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void actualizarInformacion(){
    }
}
