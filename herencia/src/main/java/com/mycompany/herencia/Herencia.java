package com.mycompany.herencia;

public class Herencia {

    public static void main(String[] args) {
         // Ejemplo de uso
        Persona persona = new Persona("Estudiante UTH", 30, "Masculino");
        persona.saludar();
        System.out.println();

        Doctor doctor = new Doctor("La Dra. Reyna Ventura", 40, "Femenino", "Cardiología");
        doctor.saludar();
        doctor.tratarPaciente();
         System.out.println();

        Deportista deportista = new Deportista("Roberto Carlos", 25, "Masculino", "Futbol");
        deportista.saludar();
        deportista.entrenar();
    }
}