package com.sofka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona Estudiante = new Persona();

        Scanner Est = new Scanner(System.in);
        String Nombre, Apellidos, ID, Correo_Electronico, Pais;
        int Edad;

        System.out.print("Ingrese su nombre: ");
        Nombre = Est.next();
        Estudiante.setNombre(Nombre);

        System.out.print("Ingrese uno de sus apellidos: ");
        Apellidos = Est.next();
        Estudiante.setApellidos(Apellidos);

        System.out.print("Ingrese su ID (Identificacion): ");
        ID = Est.next();
        Estudiante.setID(ID);

        System.out.print("Ingrese su correo electronico: ");
        Correo_Electronico = Est.next();
        Estudiante.setCorreo_Electronico(Correo_Electronico);

        System.out.print("Ingrese su pais de residencia: ");
        Pais = Est.next();
        Estudiante.setPais(Pais);

        System.out.print("ingrese su edad: ");
        Edad = Est.nextInt();
        Estudiante.setEdad(Edad);

        System.out.println("\n----- DATOS DEL ESTUDIANTE -----" +
                "\nNombre: " + Estudiante.getNombre() +
                "\nApellidos: " + Estudiante.getApellidos() +
                "\nID: " + Estudiante.getID() +
                "\nCorreo ELectronico: " + Estudiante.getCorreo_Electronico() +
                "\nPais: " + Estudiante.getPais() +
                "\nEdad: " + Estudiante.getEdad());

        Persona Estu = new Persona("Cristian", "Tironi", "12345", "ctironi@correo.com", "Uruguay", 28);

        System.out.println("\n----- DATOS DEL ESTUDIANTE -----" +
                "\nNombre: " + Estu.getNombre() +
                "\nApellidos: " + Estu.getApellidos() +
                "\nID: " + Estu.getID() +
                "\nCorreo ELectronico: " + Estu.getCorreo_Electronico() +
                "\nPais: " + Estu.getPais() +
                "\nEdad: " + Estu.getEdad());
    }
}