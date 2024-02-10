package edu.roberto_orozco.reto3.Diccionario.process;

public class Diccionario {
    private String[] palabras;
    private String[] significados;
    private int cantidadPalabras;

    public Diccionario() {
        palabras = new String[10];
        significados = new String[10];
        cantidadPalabras = 0;

        agregarPalabra("casa", "Edificio para habitar.");
        agregarPalabra("perro", "Animal doméstico de la familia de los cánidos.");
        agregarPalabra("libro", "Conjunto de hojas de papel, pergamino, vitela, u otro material, cosidas o sujetas juntas.");
        agregarPalabra("ordenador", "Máquina electrónica que, mediante la ejecución de programas almacenados en su memoria, permite el tratamiento automático de la información.");
        agregarPalabra("playa", "Ribera del mar o de un río grande y extensa, formada generalmente de arena o piedras pequeñas, y a veces de ambos elementos.");
        agregarPalabra("computadora", "Máquina electrónica capaz de almacenar información y tratarla automáticamente mediante operaciones matemáticas y lógicas controladas por programas informáticos.");
        agregarPalabra("jardín", "Terreno donde se cultivan plantas ornamentales y se cuidan árboles, flores y plantas.");
        agregarPalabra("teléfono", "Aparato electrónico que sirve para establecer comunicación oral a distancia por medio de señales eléctricas.");
        agregarPalabra("ciudad", "Población considerable, con edificios y calles, que es centro de determinadas actividades de un país.");
        agregarPalabra("avión", "Aparato más pesado que el aire, provisto de alas, que puede volar sostenido por la acción de motores y cuyo objeto puede ser el transporte de personas o mercancías.");
    }

    public void agregarPalabra(String palabra, String significado) {
        if (cantidadPalabras < 10) {
            palabras[cantidadPalabras] = palabra;
            significados[cantidadPalabras] = significado;
            cantidadPalabras++;
        } else {
            System.out.println("El diccionario está lleno.");
        }
    }

    public void listarPalabras() {
        System.out.println("Palabras en el diccionario:");
        for (int i = 0; i < cantidadPalabras; i++) {
            System.out.println(palabras[i]);
        }
    }

    public void buscarPalabra(String palabra) {
        boolean encontrada = false;
        for (int i = 0; i < cantidadPalabras; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                System.out.println("Significado de " + palabra + ": " + significados[i]);
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La palabra '" + palabra + "' no existe en el diccionario.");
        }
    }

    public void detalleDiccionario() {
        System.out.println("Cantidad de palabras en el diccionario: " + cantidadPalabras);
        System.out.println("Detalles:");
        for (int i = 0; i < cantidadPalabras; i++) {
            System.out.println(palabras[i] + " - Longitud: " + palabras[i].length() + ", Significado: " + significados[i].length());
        }
    }
}