package edu.roberto_orozco.reto4.data;

public class pasajero {

    /**
     * Clase del Pasajero
     */
    public static class Pasajero {
        private final String nombre;

        /**
         * Aqui se guarda el nombre del pasajero
         * @param nombre
         */
        public Pasajero(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Aqui regresa Pasajero y el nombre del pasajero
         * @return
         */
        @Override
        public String toString() {
            return "Pasajero: " + nombre;
        }
    }

}