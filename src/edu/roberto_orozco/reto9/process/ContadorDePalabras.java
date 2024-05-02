package edu.roberto_orozco.reto9.process;

import edu.roberto_orozco.reto9.ui.Idiomas;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContadorDePalabras {
    private static final HashMap<String, String> librosDisponibles = new HashMap<>(); /** HashMap que almacena los libros disponibles**/

    static {
        librosDisponibles.put("1", "src/edu/roberto_orozco/reto9/resource/libro1.txt");
        librosDisponibles.put("2", "src/edu/roberto_orozco/reto9/resource/libro2.txt");
        librosDisponibles.put("3", "src/edu/roberto_orozco/reto9/resource/libro3.txt");
        librosDisponibles.put("4", "src/edu/roberto_orozco/reto9/resource/libro4.txt");
        librosDisponibles.put("5", "src/edu/roberto_orozco/reto9/resource/libro5.txt");
    }


    public static void setLibrosDisponibles(String libroSeleccionado) {
        /**
         * Obtener la ruta del archivo del libro seleccionado
         */
        String filePath = librosDisponibles.get(libroSeleccionado);

        /**
         * Obtener las palabras del libro, limpiarlas, contarlas y mostrar el top 10
         */
        List<String> palabras = LimpiadorDeTexto.obtenerPalabras(filePath); /**Obtener palabras del libro**/
        Map<String, Integer> frecuenciaPalabras = contarPalabras(palabras); /** Contar la frecuencia de las palabras**/
        List<Map.Entry<String, Integer>> listaOrdenada = ordenarFrecuencia(frecuenciaPalabras); /** Ordenar por frecuencia**/
        imprimirPalabras(listaOrdenada, palabras); // Se pasa la lista de palabras como argumento

    }
    public static List<String> obtenerPalabras(String rutaArchivo) {
        List<String> palabras = new ArrayList<>();

        try {
            palabras = Files.lines(Paths.get(rutaArchivo), StandardCharsets.UTF_8)
                    .flatMap(linea -> Stream.of(linea.split("\\s+")))
                    .map(String::trim)
                    .filter(palabra -> !palabra.isEmpty())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return palabras;
    }

    /** Método para contar la frecuencia de las palabras**/
    public static @NotNull Map<String, Integer> contarPalabras(List<String> palabras){
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String palabra : palabras){
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0)+1); /** Incrementar la frecuencia de la palabra**/
        }
        return frecuencia;
    }

    /**
     *  Método para ordenar las palabras por frecuencia
     * @param frecuencia
     * @return
     */
    public static @NotNull List<Map.Entry<String, Integer>> ordenarFrecuencia(Map<String, Integer> frecuencia){
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(frecuencia.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue())); /**Ordenar por frecuencia descendente**/
        return listaOrdenada;
    }
    public static long contarVocales(@NotNull List<String> palabras){
        /**
         * Metodo para contar vocales con lambda
         */
        long totalVocales = palabras.stream()
                .flatMapToInt(CharSequence::chars)
                .mapToObj(c ->(char) c)
                .filter(c ->"aeiouAEIOU".indexOf(c)!=-1)
                .count();
        System.out.println(Idiomas.TOTAL_VOCALES + totalVocales);
        return totalVocales;
    }
    public static boolean situacionVocales(@NotNull List<String> palabras){
        Optional<String> palabraCumpleCondicion = palabras.stream()
                .filter(p -> p.matches("^[aeiouAEIOU].*[aeiouAEIOU]$") && p.length() >= 5)
                .findFirst(); /** Encuentra la primera palabra que cumple la condición **/

        if (palabraCumpleCondicion.isPresent()) {
            String palabra = palabraCumpleCondicion.get();
            System.out.println(Idiomas.SITUACION_VOCALES + "true. Palabra: " + palabra);
            return true;
        } else {
            return false;
        }
    }


    public static void imprimirPalabrasVocales(@NotNull List<String> palabras){
        palabras.stream()
                .filter(p->p.length() > 0 && "aeiouAEIOU".indexOf(p.charAt(0))!=-1)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
    public static void imprimirPalabrasImpares(@NotNull List<String> palabras){
        palabras.stream()
                .filter(p -> p.length() %2 !=0)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
    public static String palabraMasLarga(List<String> palabras){
        Optional<String> palabraMasLarga = palabras.stream()
                .max(Comparator.comparing(String::length));
        palabraMasLarga.ifPresent(System.out::println);
        return palabraMasLarga.orElse(null);
    }
    public static String palabraMasCorta(@NotNull List<String> palabras){
        Optional<String> palabraMasCorta = palabras.stream()
                .filter(p -> p.length() > 1) /** Filtrar palabras con más de un carácter **/
                .min(Comparator.comparing(String::length));
        palabraMasCorta.ifPresent(System.out::println);
        return palabraMasCorta.orElse(null);
    }

    public static void imprimirPalabras(List<Map.Entry<String, Integer>> listaOrdenada, List<String> palabras){
        /**
         * Mostrar las 10 palabras más comunes
         */
        int contador = 0;
        for (Map.Entry<String, Integer> entrada : listaOrdenada) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " "+ Idiomas.VECES); /**Mostrar palabra y frecuencia**/
            contador++;
            if (contador == 10) break; /**Salir del bucle después de mostrar las primeras 10 palabras**/
        }
        contarVocales(palabras);
        System.out.println(Idiomas.PALABRAS_VOCAL);
        imprimirPalabrasVocales(palabras);
        System.out.println(Idiomas.PALABRAS_IMPAR);
        imprimirPalabrasImpares(palabras);
        System.out.println(Idiomas.PALABRA_LARGA);
        palabraMasLarga(palabras);
        System.out.println(Idiomas.PALABRA_CORTA);
        palabraMasCorta(palabras);
        situacionVocales(palabras);
    }
}