package edu.roberto_orozco.evidencia1;

import edu.roberto_orozco.evidencia1.ui.CLI;

import edu.roberto_orozco.evidencia1.data.Medicamento;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        CLI.launchApp(medicamentos);
        System.out.println(medicamentos);
    }
}