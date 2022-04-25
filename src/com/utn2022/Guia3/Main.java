package com.utn2022.Guia3;

import com.utn2022.Guia3.Estudiante;
import com.utn2022.Guia3.Persona;
import com.utn2022.Guia3.Staff;

public class Main {
    public static void main(String [] args){

        Estudiante marco =new Estudiante( "Marco", "Tarchini", "marco@mail.com", "Camet1234","29909079","01032000","1500","TUP");
        Estudiante mia=new Estudiante("Mia","Tarchini", "mia@mail.com","Camet123","49057349", "01032020","6000", "TUP");
        Estudiante tygro=new Estudiante("Tygro","Tarchini", "tygro@mail.com","Camet122","68541236", "01032021","5000","IS");
        Estudiante naruto=new Estudiante("Naruto","Uzumaki","naruto@mail.com", "Luro7826", "48000000", "01052005","8000","H");

        Staff juan=new Staff("Juan","Pepe","pepe@mail.com","Chubut 1234", "25456783",80000, "M");
        Staff pedro=new Staff("Pedro","Lolo","lolo@mail.com","Chubut 1284", "25786123",180000, "M");
        Staff matias=new Staff("Matias","Meme","meme@mail.com","Chubut 1134", "27856123",89000, "N");
        Staff jose=new Staff("Jose","Pipo","pipo@mail.com","Chubut 1294", "25456783",90000, "N");

        Persona[] institucion = new Persona[]{marco,mia,tygro,naruto,juan,pedro,matias,jose};// Arreglo de 8

        int countEstudiante=0;
        int countStaff=0;
        double total=0;

        for(Persona persona: institucion){
            if(persona!=null) {
                if (persona instanceof Estudiante) {   //instanciar casteo
                    countEstudiante++;
                    total += ((Estudiante) persona).getCuotaMensual();// casteo
                }
                if(persona instanceof Staff)
                    countStaff++;
            }
        }
        System.out.println("La cantidad de Estudiantes es: "+ countEstudiante+ "\nLa cantidad de Staff es: "+countStaff);

        System.out.println("El total de las cuotas que recibe de los estudiantes es: $"+total);
    }

}

