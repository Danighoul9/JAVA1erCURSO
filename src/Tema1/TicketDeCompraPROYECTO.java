package Tema1;

public class TicketDeCompraPROYECTO {
    public static void main(String[] args) {
        //Nombre del comprador
        String miNombre = "Daniel";
        //Nombre del producto
        String Producto = "PS5";
        //Mostramos el nombre del comprador en el ticket
        System.out.println(" Comprador = " + miNombre);
        // Incluimos la variable de la edad
        int edad = 19;
        //Mostramos la edad del comprador
        System.out.println(" El usuario tiene = " + edad + " años ");
        //Usamos double al tener decimales e incluimos el precio sin iva del producto
        double precio = 0.0;
        precio = 599.99;
        //Añadimos la constante IVA
        double iva = 0.0;
        iva = precio * 0.21;
        //Procedemos a mostras con el comando sout el resto del ticket
        System.out.println(" Costo del producto = " + Producto + " → " + precio);
        System.out.println(" IVA incluido = " + iva);
        System.out.println(" Precio Total + IVA incluido = " + (precio + iva));
    }
}
