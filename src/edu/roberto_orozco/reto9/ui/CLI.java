package edu.roberto_orozco.reto9.ui;

import edu.roberto_orozco.reto9.process.ContadorDePalabras;

import java.util.Scanner;

public class CLI {
    public static Idiomas idiomas = new Esp(); // Idioma por defecto al iniciar la aplicación

    public static void showMenu() {
        // Mostrar el menú para que el usuario elija el idioma
        System.out.println("------------------Idioma------------------" +
                "\nDigite el idioma (Type the language)" +
                "\n1- Español (ESP)" +
                "\n2- English (ENG)" +
                "\n------------------------------------------");
    }

    public static void launchApp() {
        Scanner sc = new Scanner(System.in);
        showMenu();
        String idioma = sc.next();

        // Establecer el idioma seleccionado
        switch (idioma.toUpperCase()) {
            case "ESP":
                idiomas = new Esp();
                break;
            case "ENG":
                idiomas = new Eng();
                break;
        }

        System.out.println(idiomas.MENU);
        String libroSeleccionado = sc.next();

        // Mostrar el nombre del libro seleccionado en el idioma seleccionado
        switch (libroSeleccionado) {
            case "1":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.LIBRO1);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "2":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.LIBRO2);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "3":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.LIBRO3);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "4":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.LIBRO4);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "5":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.LIBRO5);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            default:
                System.out.println(Idiomas.ERROR_LIBRO); // Mostrar mensaje de error si el libro seleccionado no es válido
        }

        ContadorDePalabras.setLibrosDisponibles(libroSeleccionado);// Llamar al método para contar las palabras del libro seleccionado
    }
}