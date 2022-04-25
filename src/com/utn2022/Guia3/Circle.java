package com.utn2022.Guia3;

public class Circle extends Figures {

    private double radio;

    public Circle(String color) {
        super(color);
        this.radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract double calcularArea() {
        return (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public abstract double calcularPerimetro(){
        return (2 * Math.PI * radio);
    }
}

