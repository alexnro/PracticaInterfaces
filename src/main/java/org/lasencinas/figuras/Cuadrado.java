package org.lasencinas.figuras;

import org.lasencinas.draw.Drawable;

public class Cuadrado extends FiguraGeometrica {

    private double lado = 0;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(getLado(), 2);
    }
}