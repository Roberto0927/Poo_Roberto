package edu.roberto_orozco.reto9.process;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimpiadorDeTexto {
    // Método para obtener las palabras de un archivo de texto limpias de caracteres no alfabéticos
    public static List<String> obtenerPalabras(String filePath){
        List<String> palabras = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(filePath)); // Crear un Scanner para leer el archivo
            while (sc.hasNext()){ // Mientras haya una próxima palabra en el archivo
                String palabra = sc.next().toLowerCase().replaceAll("[^a-zA-ZñÑ´¨]", ""); // Leer y limpiar la palabra
                palabras.add(palabra); // Agregar la palabra al listado
            }
        } catch (FileNotFoundException e) { // Capturar la excepción en caso de que el archivo no sea encontrado
            e.printStackTrace(); // Imprimir la traza de la excepción para depuración
        }
        return palabras; // Devolver la lista de palabras limpias
    }
}