package com.utn2022.Guia1;
import com.utn2022.Guia1.Rectangulo;
import com.utn2022.Guia1.Cuenta;
import com.utn2022.Guia1.Employee;
import com.utn2022.Guia1.Figure;


public class Main {

    public static void main(String[] args) {

     //Ejercicio1***************************
       System.out.println("//Ejercicio1***************************\n");
        Rectangulo rectangulo = new Rectangulo(20, 10);
        System.out.println("La altura es: " + rectangulo.getAltura());
        System.out.println("La base es: " + rectangulo.getBase());

        System.out.println("\nEl area es: " + rectangulo.calcArea());
        System.out.println("El perimetro es: " + rectangulo.calcPerimeter());

        rectangulo.setAltura(20.5);
        rectangulo.setBase(12.5);

        System.out.println("\nEl area es: " + rectangulo.calcArea());
        System.out.println("El perimetro es: " + rectangulo.calcPerimeter());

        Rectangulo rectanguloDefault = new Rectangulo(12,45);
        System.out.println("\nLa altura del rectangulo default es: " + rectanguloDefault.getAltura());
        System.out.println("La base del rectangulo default es: " + rectanguloDefault.getBase());


//Ejercicio2*******************************
        System.out.println("\nEjercicio2*******************************\n");
        Employee carlosG = new Employee ("23456345", "Carlos", "Gutierrez", 25000);
        Employee anaS = new Employee("34234123", "Ana", "Sanchez", 27500);

        System.out.println(carlosG);
        System.out.println(anaS);

        carlosG.calc_percent_salary(15);
        System.out.println("\nEl salario anual de " + carlosG.getName() + " es $" + carlosG.calc_anual_salary());



       // Ejercicio 3*****************************
        System.out.println("\nEjercicio 3*****************************\n");
        Venta itemVenta = new Venta(1, "Boligrafo de punta fina", 10, 10.50);
        System.out.println(itemVenta);


        // Ejercicio 4******************************
        System.out.println("\nEjercicio 4******************************\n");
        Cuenta cuenta = new Cuenta(1, "Carlos Gutierrez", 1500.00);
        System.out.println("Se realizo un deposito, el balance es de $" + cuenta.credito(2500));
        System.out.println("Se realizo una compra, el balance es de $" + cuenta.debito(1500));
        System.out.println(", el balance es $" + cuenta.debito(30000));
        System.out.println(cuenta);

       //Ejercicio 5*********************************
        System.out.println("\nEjercicio 5*********************************\n");
        Hora hora = new Hora(23, 59, 59);
        System.out.println(hora);

        hora.sumarSegundo();
        System.out.println(hora);

        hora.retrocederSegundo();
        System.out.println(hora);

    }

}

