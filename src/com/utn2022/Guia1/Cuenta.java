package com.utn2022.Guia1;

public class Cuenta {

    private int id;
    private String nombre;
    private double balance;

    public Cuenta (int id, String nombre, double balance){// Constructor*********************
        this.id=id;
        this.nombre=nombre;
        this.balance=balance;
    }

    public int getId(){
        return id;
    }//getter

    public String getNombre(){
        return nombre;
    }//getter

    public double balance(){
        return balance;
    }//getter

    public double credito (double monto){
        this.balance+= monto;// balance = balance + monto
        return this.balance;
    }

    public double debito (double monto){
        if(this.balance<monto){
            System.out.println("Balance insuficiente");
        }
        else{
            this.balance-= monto; // balance = balace - monto
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }

}
/*4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
y balance. Considere los getters, setters y constructores necesarios. Tenga en
cuenta los siguientes métodos.
a. El método crédito que representa un depósito de dinero en la cuenta. Este
método debe devolver el balance luego de la operación.
b. El método débito que representa una sustracción de dinero de la cuenta.
Este método debe devolver el balance luego de la operación. Si el dinero en
la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
pantalla un aviso.
c. Un método que imprima por pantalla las características del objeto.
Realice las siguientes operaciones:
1. Inicialice una cuenta con un monto inicial de 15000.
2. Realice una operación de crédito de 2500.
3. Realice una operación de compra de 1500.
4. Realice una operación de compra de 30000.
5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
correcto.

*/