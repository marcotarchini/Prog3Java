package com.utn2022.Guia2;

public class Book {
    //titulo precio stock y autor

    private String titulo;
    private Autor autor;
    private double precio;
    private int stock;

    public Book(String titulo, Autor autor, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    public String getLibro(){
        return ("Titulo: "+this.titulo+"\n"+this.autor+"\nPrecio: "+this.precio+"\nStock: "+stock);
    }

    public void getPrecio(double aumento){
        this.precio = aumento;
    }

    public void getStock(int aumento){
        this.stock += aumento;
    }

    public String getTitulo(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.titulo=tituto;
    }

    public String imprimirMsj(){
        return "El libro, "+titulo+" de "+ autores[0].getNombre() +" . Se vende a $"+this.precio+ "pesos.";
    }

    public String imprimirArreglo(){
        String variable="";
        for(Autor autor :autores){
            if(autor !=null){
                variable+= autor.getNombre()+ ""+ autor.getApellido();
            }
        }
        return variable;
    }

    @Override
    public String toString(){
        return "";
    }
}
/*1. Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
        precio, stock y Autor, este último posee las características de nombre, apellido,
        email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
        único autor. Ejecute las siguientes instrucciones:
        a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        b. Imprima por pantalla al autor previamente instanciado.
        c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        pesos con una cantidad de 150 copias.
        d. Imprima por pantalla el libro instanciado.
        e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        cantidad en 50 copias.
        f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        Libro “Effective Java”.
        g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        siguiente mensaje:
        “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
        cambios necesarios en el método del punto g, para imprimir un nuevo
        mensaje que liste los autores que contribuyeron a ese libro.*/
