package com.tresct.aplicacionweb;

public class Persona {
    private String nombre;
    private int calificacion;

    public Persona(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}
