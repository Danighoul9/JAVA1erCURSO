package Tema5.TareasTema5.Electrodomesticos;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Lavadora("Bosch", "RT11", ConsumoEnergetico.C,
                500f, 70f, "Gris", 11));

        electrodomesticos.add(new Television("Samsung", "OLED G1", ConsumoEnergetico.A,
                1000f, 30f, "Negro", ResolucionTV._4K, TecnologiaTV.OLED, 55));


        for(Electrodomestico e: electrodomesticos) {
            System.out.println(e.getMarca() + " - " + e.getModelo() + " --> " + e.calcularPrecioFinal());
        }


    }
}
