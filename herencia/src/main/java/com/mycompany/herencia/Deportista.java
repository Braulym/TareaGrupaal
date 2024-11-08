package com.mycompany.herencia;

class Deportista extends Persona {
    // Atributo específico de Deportista
    String deporte;

    // Constructor
    public Deportista(String nombre, int edad, String genero, String deporte) {
        // Llamada al constructor de la clase base (Persona)
        super(nombre, edad, genero);
        this.deporte = deporte;
    }

    // Método específico de Deportista
    public void entrenar() {
        System.out.println(nombre + " esta entrenando para la copa mundial de: " + deporte + ".");
    }
}