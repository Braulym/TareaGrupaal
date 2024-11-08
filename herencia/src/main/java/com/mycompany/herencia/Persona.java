package com.mycompany.herencia;

class Persona {
    // Atributos comunes
    String nombre;
    int edad;
    String genero;

    // Constructor
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Método común
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }
}