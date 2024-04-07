package edu.roberto_orozco.reto9;
import edu.roberto_orozco.reto9.ui.CLI;

public class Main {
    public static void main(String[] args){
        try {
            CLI.launchApp();
        }catch (Exception e){
            System.out.println("Ocurrrió un error inesperado");
        }

    }
}