package Tema4.EjemplosOrientacionObjetos.EjemplosVarios.Viaje;

import java.time.LocalDate;

public class TestViaje {

    public static void main(String[] args) {
        Viaje v1 = new Viaje("Madrid", "Barcelona", 15, LocalDate.of(2025, 12, 20), 200.0);
        System.out.println(v1);
        System.out.println("Vuelves en: " + v1.getFechaLlegada());
    }
}
