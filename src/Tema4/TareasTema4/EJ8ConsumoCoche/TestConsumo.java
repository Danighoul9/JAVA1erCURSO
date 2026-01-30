package Tema4.TareasTema4.EJ8ConsumoCoche;

public class TestConsumo {
    static void main(String[] args) {

        Consumo coche1 = new Consumo(500, 40, 100, 1.65);

        System.out.println(coche1);
        System.out.println("Tiempo empleado: " + coche1.getTiempo() + " horas");
        System.out.println("Consumo medio: " + coche1.consumoMedio() + " L/100km");
        System.out.println("Consumo en euros: " + coche1.consumoEuros() + " €/100km");


    }
}
