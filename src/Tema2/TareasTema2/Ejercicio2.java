package Tema2.TareasTema2;

public class Ejercicio2 {
    public static void main(String[] args) {
        //DESCUENTOS EN TIENDA DE VIDEOJUEGOS

        //  Descuento base según el tipo de cliente:
        //        - "estudiante" -> 15%
        //        - "premium" -> 25%
        //        - "infantil" -> 10%
        //
        //        Descuento adicional:
        //   - 15% extra si es tu cumpleaños
        //   - 10% extra si compras más de tres juegos
        //   - 5% extra si es fin de semana


        //El descuento total acumulado no puede superar el 40%
        //Si el precio final es inferior a 10€ pagarás un mínimo de 10€


        // V.Entrada: totalPedido, tipoCliente, esCumple, esFinDe, numJuegosPedido
        // V.Salida: descuento aplicado y total del pedido menos el descuento

        //VARIABLES

        double totalPedido = 170.0;
        String tipoCliente = "premium";
        boolean esCumple = true, esFinDe = false;
        int numJuegosPedido = 4;

        double descuentoAplicado=0.0, totalPedidoConDescuento=0.0;

        //DESCUENTO DE TIPO CLIENTE
        switch (tipoCliente) {
            case "estudiante":
                descuentoAplicado = 0.15;
                break;
            case "premium":
                descuentoAplicado = 0.25;
                break;
            case "infantil":
                descuentoAplicado = 0.10;
                break;
            default:
        }

        //DESCUENTOS EXTRA
        if (esCumple) {
            descuentoAplicado += 0.15;
        }
        if (numJuegosPedido > 3) {
            descuentoAplicado += 0.10;
        }
        if (esFinDe) {
            descuentoAplicado += 0.05;
        }

        //El descuentoAplicado no puede superar el 40%
        if (descuentoAplicado > 0.40) {
            System.out.println("Descuento demasiado alto, se aplica el 40%");
            descuentoAplicado = 0.40;
        }

        //Calcular precio final restando el descuento
        totalPedidoConDescuento = totalPedido - (totalPedido * descuentoAplicado);

        //Si el precio final es menor que 10€, le subimos a 10€
        if (totalPedidoConDescuento < 10) {
            System.out.println("Precio demasiado bajo con descuentos, se aplica mínimo" +
                    " de 10€");
            totalPedidoConDescuento = 10;
        }

        System.out.println("El precio final del pedido es de "
                + totalPedidoConDescuento + " €");
        System.out.println("El descuento aplicado es de " + (descuentoAplicado * 100) + "%");


    }
}