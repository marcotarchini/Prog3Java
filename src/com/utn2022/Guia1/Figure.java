package com.utn2022.Guia1;

public class Figure {

    private double width; //ancho. Dato encapsulado
    private double height;//alto. Dato encapsulado

    public Figure(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Figure(){ //Constructor
        width=5.6;
        height=7.8;
    }


    public String see_surface(){ // metodo getter
        return "The rectangle has a width of " + width + " and a height of "+ height;
    }

    public String see_area_and_perimeter(){ // metodo getter
        return "The value of the area is " + (width * height) +" and the perimeter is " + (2*(width*height)) ;
    }

    public void modifies_wh(){ // metodo setter
        width=3.2;
        height=9.9;
    }
}
/*1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
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