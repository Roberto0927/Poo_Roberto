package edu.roberto_orozco.reto9.test.processTest;

import edu.roberto_orozco.reto9.process.ContadorDePalabras;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import static org.junit.Assert.*;

public class ContadorDePalabrasTest {

    /**
     * Test 1
     */
    @Test
    public void testContarPalabras(){
        List<String> palabras = Arrays.asList("Hola", "Mundo", "Mundo", "Carro", "Carro", "Carro");
        Map<String, Integer> resultado = ContadorDePalabras.contarPalabras(palabras);
        Assert.assertEquals(1, resultado.get("Hola").intValue());
        Assert.assertEquals(2, resultado.get("Mundo").intValue());
        Assert.assertEquals(3, resultado.get("Carro").intValue());
    }

    /**
     * Test 2
     */
    @Test
    public void testLibroVacio(){
        /** Collections.emptyList() Crea una lista vacía de palabras**/
        Map<String, Integer> resultado = ContadorDePalabras.contarPalabras(Collections.emptyList());

        /** Verificar que el resultado sea un mapa vacío**/
        assertTrue(resultado.isEmpty());
    }

    /**
     * Test 3
     */
    @Test
    public void testObtenerPalabrasLibroVacio(){
        String libroVacio= "src/edu/roberto_orozco/reto9/resource/libroVacio.txt";
        List<String> palabras = ContadorDePalabras.obtenerPalabras(libroVacio);
        assertTrue(palabras.isEmpty());
    }

    /**
     * Test 4
     */
    @Test
    public void test1PalabraDiferente(){
        /**Crear una lista con una sola palabra**/
        List<String> palabras = Collections.singletonList("Palabra");

        Map<String, Integer> resultado = ContadorDePalabras.contarPalabras(palabras);

        /** Verificar que la palabra se cuenta correctamente**/
        Assert.assertEquals(1, resultado.get("Palabra").intValue());
    }

    /**
     * Test 5
     */
    @Test
    public void testMezclaMayusculasMinusculas() {
        List<String> palabras = Arrays.asList("Mundo", "mundo","mundo","hola", "hola", "HOLA");
        Map<String, Integer> resultado = ContadorDePalabras.contarPalabras(palabras);

        /**Verificar que las palabras se cuentan correctamente sin distinguir entre mayúsculas y minúsculas**/
        Assert.assertEquals(2, resultado.get("mundo").intValue());
        Assert.assertEquals(2, resultado.get("hola").intValue());
    }

    /**
     * Test 6
     */
    @Test
    public void testPalabrasConCaracteresEspeciales() {
        List<String> palabras = Arrays.asList("árbol","árbol", "árbol", "árbol", "arbol","arbol","arbol", "¿Cómo?", "gracias");
        Map<String, Integer> resultado = ContadorDePalabras.contarPalabras(palabras);

        /** Verifica que las palabras con caracteres especiales se cuenten correctamente**/
        Assert.assertEquals(4, resultado.get("árbol").intValue());
        Assert.assertEquals(1, resultado.get("¿Cómo?").intValue());
        Assert.assertEquals(1, resultado.get("gracias").intValue());
    }

    /**
     * Test 7
     */
    @Test
    public void testOrdenarFrecuencia() {
        /** Crear un mapa con palabras y sus frecuencias desordenadas**/
        Map<String, Integer> frecuenciasDesordenadas = new HashMap<>();
        frecuenciasDesordenadas.put("hola", 3);
        frecuenciasDesordenadas.put("mundo", 1);
        frecuenciasDesordenadas.put("carro", 2);
        List<Map.Entry<String, Integer>> listaOrdenada = ContadorDePalabras.ordenarFrecuencia(frecuenciasDesordenadas);

        /** Verificar que la lista esté ordenada correctamente**/
        Assert.assertEquals("hola", listaOrdenada.get(0).getKey());
        Assert.assertEquals(Integer.valueOf(3), listaOrdenada.get(0).getValue());
        Assert.assertEquals("carro", listaOrdenada.get(1).getKey());
        Assert.assertEquals(Integer.valueOf(2), listaOrdenada.get(1).getValue());
        Assert.assertEquals("mundo", listaOrdenada.get(2).getKey());
        Assert.assertEquals(Integer.valueOf(1), listaOrdenada.get(2).getValue());
    }

    /**
     * Test 8
     */
    @Test
    public void testContarVocales() {
        List<String> palabras = Arrays.asList("hola", "mundo", "java");
        long totalVocales = ContadorDePalabras.contarVocales(palabras);
        Assert.assertEquals(6, totalVocales);
    }

    /**
     * Test 9
     */
    @Test
    public void testImprimirPalabrasVocales(){
        List<String> palabras = Arrays.asList("hola", "adiós", "amigo", "elefante", "iglesia");
        ContadorDePalabras.imprimirPalabrasVocales(palabras);
    }

    /**
     * Test 10
     */
    @Test
    public void testImprimirPalabrasVocalesArchivo() throws IOException {
        String rutaArchivo = "src/edu/roberto_orozco/reto9/resource/libroVocalesTest.txt";
        List<String> palabras = null;
        palabras = Files.readAllLines(Paths.get(rutaArchivo));
        ContadorDePalabras.imprimirPalabrasVocales(palabras);
    }


    /**
     * Test 11
     */
    @Test
    public void testImprimirPalabrasVocalesOrdenadasDesdeArchivo() {
        String rutaArchivo = "src/edu/roberto_orozco/reto9/resource/libro2.txt";
        ContadorDePalabras.imprimirPalabrasVocales(ContadorDePalabras.obtenerPalabras(rutaArchivo));
    }

    /**
     * Test 12
     */
    @Test
    public void testSituacionVocales() {
        List<String> palabras = Arrays.asList("hola", "adiós", "amigo", "elefante", "iglesia");
        boolean palabraCumpleCondiciones = ContadorDePalabras.situacionVocales(palabras);
        Assert.assertTrue(palabraCumpleCondiciones);
    }

    /**
     * Test 13
     */
    @Test
    public void testImprimirPalabrasImpares(){
        List<String> palabras = Arrays.asList("hola", "adiós", "amigo", "elefante", "iglesia");
        ContadorDePalabras.imprimirPalabrasImpares(palabras);
    }

    /**
     * Test 14
     */
    @Test
    public void testImprimirPalabrasImparesDesdeArchivo() {
        String rutaArchivo = "src/edu/roberto_orozco/reto9/resource/libro1.txt";
        ContadorDePalabras.imprimirPalabrasImpares(ContadorDePalabras.obtenerPalabras(rutaArchivo));
    }

    /**
     * Test 15
     */
    @Test
    public void testPalabraMasLarga() {
        List<String> palabras = Arrays.asList("hola", "adiós", "amigo", "elefante", "iglesia");
        String palabraMasLarga = ContadorDePalabras.palabraMasLarga(palabras);
        Assert.assertEquals("elefante", palabraMasLarga);
    }

    /**
     * Test 16
     */
    @Test
    public void testPalabraMasCorta() {
        List<String> palabras = Arrays.asList("hola", "adiós", "amigo", "elefante", "iglesia");
        String palabraMasCorta = ContadorDePalabras.palabraMasCorta(palabras);
        Assert.assertEquals("hola", palabraMasCorta);
    }

    /**
     * Test 17
     */
    @Test
    public void testPalabraMasCortaDesdeArchivo() throws IOException {
        String rutaArchivo = "src/edu/roberto_orozco/reto9/resource/libro3.txt";
        List<String> palabras = ContadorDePalabras.obtenerPalabras(rutaArchivo);
        String palabraMasCorta = ContadorDePalabras.palabraMasCorta(palabras);
        Assert.assertEquals("de", palabraMasCorta);
    }

    /**
     * Test 18
     */
    @Test
    public void testPalabraMasLargaDesdeArchivo() throws IOException {
        String rutaArchivo = "src/edu/roberto_orozco/reto9/resource/libro2.txt";
        List<String> palabras = ContadorDePalabras.obtenerPalabras(rutaArchivo);
        String palabraMasLarga = ContadorDePalabras.palabraMasLarga(palabras);
        Assert.assertEquals("________________________________________", palabraMasLarga);
    }

    /**
     * Test 19
     */
    @Test
    public void testSituacionVocalesDesdeArchivo() throws IOException {
        String rutaArchivo = "src/edu/roberto_orozco/reto9/resource/libro4.txt";
        List<String> palabras = ContadorDePalabras.obtenerPalabras(rutaArchivo);
        boolean palabraCumpleCondiciones = ContadorDePalabras.situacionVocales(palabras);
        Assert.assertTrue(palabraCumpleCondiciones);
    }

    /**
     * Test 20
     */
    @Test
    public void testSituacionVocalesListaVacia() {
        List<String> palabras = Collections.emptyList();
        boolean palabraCumpleCondiciones = ContadorDePalabras.situacionVocales(palabras);
        assertFalse(palabraCumpleCondiciones);
    }
}