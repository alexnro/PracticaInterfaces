package org.lasencinas.figuras;

import org.lasencinas.draw.Drawable;

import static java.lang.Math.PI;

public class Elipse extends FiguraGeometrica {

    private double ejeMayor = 0;
    private double ejeMenor = 0;

    public Elipse() {
        super();
    }

    public Elipse(double ejeMayor, double ejeMenor) {
        super();
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    public Elipse(String nombre, double ejeMayor, double ejeMenor) {
        super(nombre);
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    public double getEjeMayor() {
        return this.ejeMayor;
    }

    public double getEjeMenor() {
        return this.ejeMenor;
    }

    public void setEjeMayor(double ejeMayor) {
        this.ejeMayor = ejeMayor;
    }

    public void setEjeMenor(double ejeMenor) {
        this.ejeMenor = ejeMenor;
    }

    @Override
    public double area() {
        return PI * getEjeMayor() * getEjeMenor();
    }
}