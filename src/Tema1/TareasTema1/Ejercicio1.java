package Tema1.TareasTema1;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Me dicen la distancia a la Tierra de la estrella Proxima Centaur1, 4.24 años luz
        //Tengo que mostrar la distancia en km y el tiempo en segundos que tardaría
        //una nave que pudiera viajar a una velocidad cercana a la velocidad de
        // la luz -> 298.000 km/s

        //Pista1 -> distancia en km, es pasar 4.24 años luz a km
        //Pista2 -> tiempo en segundos, una vez se los km, se la velocidad a la que voy
        //pues despejar los segundos
        //Pista 3-> velocidad de la luz 299.900 km/s

        //1.DECLARAMOS LAS VARIABLES
        final double VELOCIDADLUZ = 299900; //Su valor no cambia puesto que es una constante
        final double VELOCIDADNAVE = 298000;//Su valor no cambia puesto que es una constante
        double tiempoNaveProximaSeg;
        double tiempoNaveProximaAnos;
        double distanciaCentaur1 = 4.24;
        double segundosAno = (365.25 * 24 * 60 * 60);
        double anoluzenKm;
        double distanciaKm;
        double tiempoSeg;


        //2.Calculo
        anoluzenKm = VELOCIDADLUZ * segundosAno;
        distanciaKm = distanciaCentaur1 * anoluzenKm;
        tiempoSeg = distanciaCentaur1 * segundosAno;
        tiempoNaveProximaSeg = distanciaKm / VELOCIDADNAVE;
        tiempoNaveProximaAnos = tiempoNaveProximaSeg / 365 / 24 / 60 / 60;

        //3.Mostramos en pantalla los resultados

        System.out.println("La distancia de la estrella Centaur1 es de: " + distanciaCentaur1);
        System.out.println("Sabiendo que 1 año luz es 299.900km");
        System.out.println("Sabremos cuanto km y cuantos segundos nos llevara llegar a Centaur1");
        System.out.println("La distancia en km hasta Centaur1 es de: " + distanciaKm + " km");
        System.out.println("La distancia en segundos hasta Centaur1 es de: " + tiempoSeg + " segundos");
        System.out.println("La nave tardaría: " + tiempoNaveProximaAnos + " años en llegar");

    }
}
