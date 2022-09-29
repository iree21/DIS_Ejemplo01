package com.ufv.irene;

import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();

        System.out.println("Escribe tu nombre: ");
        p.setNombre(sc.nextLine());

        System.out.println("Escribe tu apellido: ");
        p.setApellidos(sc.nextLine());

        System.out.println("Escribe tu DNI sin letra: ");
        p.setDniSinLetra(Integer.parseInt(sc.nextLine())); //pasar de string a int mediante parse

        System.out.println("Escribe tu edad: ");
        p.setEdad(sc.nextInt()); //pasar de string a int mediante nextInt()

        System.out.println("Buenos dias : " + p.getNombre() + " " +
                p.getApellidos() + " con DNI " + (p.getDniSinLetra()) + " y " +
                (p.getEdad()) + " años de edad.");
    }
}