package Tema6.PolimorfismoClases;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main() {

        //Poliformismo casting -----------------------------------------------------------------------
        Vehiculo v1 = new Vehiculo("Ford", "Focus", "Rojo", "8541-NLK");

        Furgoneta f1 = new Furgoneta("Ford", "Combi", "Blanco", "4444-NAB",
                1000.0);

        //Un objeto de la clase hija se puede ver como de la clase padre
        //Pero la referencia sigue apuntando al objeto de la clase hija
        IO.println( ((Vehiculo) f1).metodoPolimorfico() ); //Llama al de la clase hija
        //IO.println( ((Vehiculo) f1).getCargaMaxima(); //No existe en la clase padre

        //Un objeto de la clase padre no puede convertirlo (castearlo) a la clase hija
        //Excepción ClassCastException
        //( (Furgoneta) v1).getCargaMaxima();


        //Poliformismo ArrayList -----------------------------------------------------------------------
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(v1); //Meto Vehiculo
        vehiculos.add(f1); //Meto Furgoneta

        for(Vehiculo obj :vehiculos) {
            //Con la furgoneta hace obj = ((Vehiculo) f1)
            IO.println(obj.metodoPolimorfico()); //Llama a la versión del método en la clase hija

            //La limitación es que obj solo puede invocar métodos que estén en Vehiculo
            //No puede llamar a métodos que sólo estén en Furgoneta - getCargaMaxima()

            //SOLUCIÓN: preguntar si el objeto es de la clase correspondiente, y
            //una vez que lo sé seguro, hago el casting
            if(obj instanceof Furgoneta) {
                Furgoneta f = (Furgoneta) obj;
                IO.println(f.getCargaMaxima());
            }
        }


        //Polimorfismo en la construcción del objeto
        Vehiculo v2 = new Furgoneta("Ford", "Focus", "Rojo", "8541-NLK",
                1000.0);
        IO.println(v2.metodoPolimorfico());


        //Polimorfismo de interfaz en una colección
        List<Vehiculo> listaVehiculos = new ArrayList<>();

    }
}
