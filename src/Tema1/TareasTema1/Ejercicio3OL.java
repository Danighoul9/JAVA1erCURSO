package Tema1.TareasTema1;

public class Ejercicio3OL {
    public static void main(String[] args) {
        //Un cliente recibe un descuento especial si se cumplen estas condiciones:
        //Es miembro VIP y su compra supera 100€ O
        //No es VIP pero es su cumpleaños y la compra es mayor a 50€
        //En ningún caso hay descuento si el cliente tiene pagos pendientes

        boolean clienteVip;
        double valorCompra;
        boolean esCumpleaños;
        boolean tienePagosPendientes;
        boolean condicionesDescuento;
        boolean resultado;

        //Dar valor a las variables de entrada
        //Poner la condición
        //Ver lo que debe dar y comprobar el resultado pintándolo

        clienteVip = true;
        valorCompra =119.99;
        esCumpleaños = true;
        tienePagosPendientes = false;

        //1. resultado = (VIP && valorCompra > 100€) O ((!VIP) && esCumpleaños && valorCompra > 50€)) O tiene pagos pendientes
        //                 T  &&  T =             T  || (  F   &&         T)) =    T || F = T

        condicionesDescuento = (clienteVip && valorCompra > 100) || (!clienteVip && esCumpleaños && valorCompra > 50);
        System.out.println("¿Tiene el cliente derecho a descuento?: " + condicionesDescuento);

        System.out.println("¿Tiene el cliente pagos pendientes?: " + tienePagosPendientes);

        resultado = condicionesDescuento && !tienePagosPendientes;
        System.out.println("Analizando los valores y operaciones logicas, ¿tendria el cliente derecho a este " +
                "descuento especial?: " + resultado);



    }
}
