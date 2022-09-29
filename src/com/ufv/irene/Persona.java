package com.ufv.irene;

public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;

    public void setNombre(String nom) {
        this.nombre = nom;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apell) {
        this.apellidos = apell;
    }
    public String getApellidos() {
        return apellidos;
    }

    public void setDniSinLetra(int dni) {
        this.dniSinLetra = dni;
    }
    public int getDniSinLetra() {
        return dniSinLetra;
    }

    public void setEdad(int ed) {
        if (ed > 0) {
            if (ed >= 18) {
                System.out.println("Estás hecho un chaval");
            }
            else {
                System.out.println("Ya eres talludito");
            }
            this.edad = ed;
        }
        else {
            this.edad = 0;
        }
    }
    public int getEdad() {
        return edad;
    }
}