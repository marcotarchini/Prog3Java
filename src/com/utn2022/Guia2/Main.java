package com.utn2022.Guia2;

import com.utn2022.Guia2.Book;
import com.utn2022.Guia2.Autor;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Autor autorJoshua=new Autor("Joshua","Bloch","joshua@email.com",'M'); //Inicializar objeto
        System.out.println(autorJoshua);
        Autor autorMarco=new Autor("Marco","Tarchini","tarchinimarco@gmail.com",'M');

        Book EffectiveJava=new Book("Effective Java",450.00, 150, autorJoshua);
        System.out.println(EffectiveJava.getLibro());

        EffectiveJava.getPrecio(500);
        EffectiveJava.getStock(50);
        System.out.println("\n\n");
        System.out.println(EffectiveJava.getLibro());
    }
}
