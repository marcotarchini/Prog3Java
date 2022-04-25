package com.utn2022.Guia1;

public class Venta {

    private int id;
    private String description;
    private int amount;
    private double unitprice;

    public Venta(int id, String description, int amount, double unitprice) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.unitprice = unitprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public double getTotalprice(){
        return unitprice * amount;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", unitprice=$" + unitprice +
                ", totalprice=$"+ getTotalprice() +
                '}';
    }
}

/*3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
total teniendo en cuenta el precio unitario y cantidad. Un método que permita
imprimir por pantalla los atributos del objeto de la siguiente forma:
ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
a. Inicialice el objeto con los atributos necesarios
b. Imprima por pantalla el objeto inicializado.*/