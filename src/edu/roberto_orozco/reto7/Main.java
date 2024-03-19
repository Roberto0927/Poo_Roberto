package edu.roberto_orozco.reto7;

import edu.roberto_orozco.reto7.ui.CLI;
public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchCalculadora();
        }catch (Exception e){
            System.out.println("Error, Intenta de nuevo");
        }
    }
}