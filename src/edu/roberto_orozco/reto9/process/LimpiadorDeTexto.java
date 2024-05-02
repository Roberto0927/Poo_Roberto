package edu.roberto_orozco.reto9.process;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimpiadorDeTexto {
    /**
     * Obtiene las palabras de un archivo de texto limpias de caracteres no alfabéticos.
     *
     * @param filePath La ruta del archivo de texto.
     * @return Una lista de palabras limpias.
     */
    public static List<String> obtenerPalabras(String filePath) {
        List<String> palabras = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filePath))) {
            palabras = sc.tokens()
                    .map(String::toLowerCase) /** Convertir todas las palabras a minúsculas**/
                    .map(palabra -> palabra.replaceAll("[^a-zA-ZñÑ´¨]", "")) /** Limpiar la palabra de caracteres no alfabéticos**/
                    .collect(Collectors.toList()); /** Recolectar las palabras limpias en una lista**/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return palabras;
    }
}