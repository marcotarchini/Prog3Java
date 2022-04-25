package com.utn2022.Guia3;

public class Staff extends Persona{

    private double salario;
    private boolean turno;

    public Staff(String nombre, String apellido, String mail, String direccion, String dni, double salario, boolean turno) {
        super(nombre, apellido, mail, direccion, dni);
        this.salario = salario;
        this.turno = turno;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public double getSalarioAnual(){
        return  salario*12;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mail='" + mail + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", salario=" + salario +
                ", turno=" + turno +
                '}';
    }
}
