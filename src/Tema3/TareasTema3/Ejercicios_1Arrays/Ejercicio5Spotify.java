package Tema3.TareasTema3.Ejercicios_1Arrays;

public class Ejercicio5Spotify {
    static void main(String[] args) {

        String canciones[] = {
                "blackout",
                "no tiene sentido",
                " tu jardin con enanitos",
                "La perla", "Que pasaría",
                "OHNANA",
                "La plena",
                "QLOO*",
                "Montinha 2.0",
                "Mi refe"};

        String autores[]= {
                "Emilia,Tini,Nicki Nicole",
                "Béele",
                "Roze oficial",
                "ROSALIA",
                "Rauw alejandro",
                "Kapo",
                "W sound",
                "Young",
                "Denis",
                "Morcillo"};


        int duraciones[] ={
                182,
                158,
                175,
                195,
                191,
                156,
                150,
                148,
                118,
                159};


        int duracionTotalSeg = 0;


        for(int i = 0; i < canciones.length; i++){
            System.out.println((canciones[i] + " - " + autores[i] + " - " + duraciones[i/60] ));
        }


        //ACUMULADOR PARA SACAR EL TIEMPO TOTAL DE LA PLAYLIST
        for(int i =0; i < duraciones.length; i++){
            duracionTotalSeg += duraciones[i];
        }
        System.out.println("La duracion de la playlist es de " + duracionTotalSeg/60 + " minutos");



        //CANCIÓN RANDOM
        System.out.println(canciones[(int) (Math.random() * 10) + 1 ]);
    }


}
