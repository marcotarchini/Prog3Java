package com.utn2022.Guia1;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    // Hora hora= new Hora (24,76,89); -> esto iria en la llamada del main por ejemplo

    public Hora(int hora, int minuto, int segundo){

        this.hora=(hora >=0 && hora< 24) ? hora :0; // if ternario, primario validacion y luego ? verdadero : falso
        this.minuto=(minuto>= 0 && minuto < 60) ? minuto: 0;
        this.segundo=(segundo>=0&&segundo<60)?segundo: 0;
    }
    //getters y setters

    private void sumarHora(){
        if (this.hora==23){
            this.hora=0;
        }
        else{
            this.hora++;
        }
    }

    private void sumarMinuto(){
        if(this.minuto==59){
            this.minuto=0;
            sumarHora();
        }
        else{
            this.minuto++;
        }
    }

    public void sumarSegundo(){
        if(this.segundo==59){
            this.segundo=0;
            sumarMinuto();
        }
        else{
            this.segundo++;
        }
    }

    private void retrocederHora(){
        if(this.hora==0){
            this.hora=23;
        }
        else{
            this.hora--;
        }
    }

    private void retrocederMinuto(){
        if(this.minuto==0){
            this.minuto=59;
            retrocederHora();
        }
        else{
            this.minuto--;
        }
    }

    public void retrocederSegundo(){
        if(this.segundo==0){
            this.segundo=59;
            retrocederMinuto();
        }
        else{
            this.segundo--;
        }
    }

    @Override
    public String toString() {
        return "Hora{" +
                 hora +
                ":" + minuto +
                ":" + segundo +
                '}';
    }
}
/*5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
Tenga en cuenta el rango de valores aceptados para cada uno de estos.
a. Hora: 0 … 23
b. Minuto: 0 … 59
c. Segundo: 0 … 59
Considere el siguiente comportamiento:
1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
usando zero a la izquierda ejemplo 13:04:22 .
2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
4. Instanciar el objeto y probar los métodos creados.*/