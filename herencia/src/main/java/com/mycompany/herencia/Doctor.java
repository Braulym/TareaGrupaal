package com.mycompany.herencia;

class Doctor extends Persona {
    // Atributo específico de Doctor
    String especialidad;

    // Constructor
    public Doctor(String nombre, int edad, String genero, String especialidad) {
        // Llamada al constructor de la clase base (Persona)
        super(nombre, edad, genero);
        this.especialidad = especialidad;
    }

    // Método específico de Doctor
    public void tratarPaciente() {
        System.out.println("La Doctora " + nombre + " esta operando a un paciente.");
    }
}