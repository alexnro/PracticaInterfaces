package org.lasencinas.figuras;

import org.lasencinas.draw.Drawable;

public abstract class FiguraGeometrica implements Drawable {

    private String nombre;

    public FiguraGeometrica() {
        this.nombre = "Desconocido";
    }

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double area();
}