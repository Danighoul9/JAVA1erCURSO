package Tema1.TareasTema1;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Un conductor de coche quiere saber cuánta gasolina consume en un viaje.
        //Su coche consume 5.8 litros de gasolina cada 100km
        //Cuantos litros consume en un viaje de 750km

        //Ahora haz el mismo ejercicio pero pensando que el coche es híbrido y
        //tiene una batería cargada completamente de 120km

        //Muestra con un operador condicional, si el gasto en litros de gasolina
        //es mayor en el primer coche o en el segundo

        //Cada gasolina vale 1,43€, ¿cuanto gastaría en cada viaje?



        //1.Datos/Variables (1er Problema)
        final double VALORGASOLINA = 1.43;
        int costoGasolina1;
        double gasolinaConsumida1;
        final double GASOLINACADA100KM = 5.8; //Esto es una constante ya que el gasto es fijo por lo tanto
                                              // tambien vale para el segundo problema
        double viajekm1 = 750;

        //2.Hacemos una regla de 3 para resolver el primer problema
              //100km - 5.8 L
             //750km - x L
        gasolinaConsumida1 = (viajekm1 * GASOLINACADA100KM) / 100;
        costoGasolina1 = (int) (VALORGASOLINA * gasolinaConsumida1);

        //3.Mostramos resultado en pantalla con un sout
        System.out.println("Los litros de gasolina que gastaría este conductor son de unos " + gasolinaConsumida1 +
                "Litros");
        System.out.println("El valor de esos litros de gasolina son de unos " + costoGasolina1 + " € ");

        //4.Datos/Variables (2do Problema)
        int costoGasolina2;
        double gasolinaConsumida2;
        double viajekm2 = viajekm1;
        final double BATERIA = 120;
        double kmRestantes;

        //5.Calculos
            // viajekm - BATERIA = 750km - 120km = x
                //100KM - 5.8 L
                // x KM - x L
        kmRestantes = viajekm2 - BATERIA;
        gasolinaConsumida2 = (kmRestantes * GASOLINACADA100KM) / 100;
        costoGasolina2 = (int) (VALORGASOLINA * gasolinaConsumida2);

        System.out.println("En caso de ser un coche hibrido con una bateria de unos 120km de autonomía el consumo seria" +
                " de unos " + gasolinaConsumida2 + "Litros");
        System.out.println("El valor de esos litros de gasolina son de unos " + costoGasolina2 + " € ");

        //6.Mostramos si un coche SIN bateria consume mas o menos que un coche CON bateria
        System.out.println("Resultado 43.5L > 36.54L = " + (gasolinaConsumida1>gasolinaConsumida2));
        if (gasolinaConsumida1>gasolinaConsumida2) {
            System.out.println("El coche de gasolina consume más");
        } else {
            System.out.println("El coche hibrido consume más");
        }
    }
}