package com.utn2022.Guia1;

import java.util.Random;

public class Rectangulo {//Herencia de Figures

    private double base;
    private double altura;

    public Rectangulo(double base, double altura){//constructor
        this.base=base;
        this.altura=altura;
    }

   /* public Rectangulo(double base, double altura){
        this.base=new Random().nextInt(bound 1000);
        this.altura=new Random().nextInt(bound 1000);
    }

    public Rectangulo(String color,double base, double altura){
        super(color);
        this.base=base;
        this.altura=altura;
    }*/

    public double getBase(){
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcArea(){
        return altura*base;
    }
    public double calcPerimeter(){
        return 2*(altura+base);
    }
}

/* 1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
siguientes pruebas:
a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
b. Imprimir por pantalla el alto y ancho.
c. Imprimir por pantalla el área y perímetro.
d. Modificar el alto y el ancho de la instancia.
e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
*/
