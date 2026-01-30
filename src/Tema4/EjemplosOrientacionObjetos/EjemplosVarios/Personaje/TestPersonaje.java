package Tema4.EjemplosOrientacionObjetos.EjemplosVarios.Personaje;

import java.util.Scanner;

public class TestPersonaje {
    static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       Personaje pj1 = new Personaje("Robingo", "Mago", 50, 5, 2);
       Personaje pj2 = new Personaje("Matias", "Espadachin", 50, 1, 2);

       //Personajes
       System.out.println("-------------------------------PERSONAJES-----------------------------------");
       System.out.println(pj1);
       System.out.println(pj2);
       System.out.println();

       //Contadores de nuestros PJ
       int contadorWinsRobingo = 0;
       int contadorWinsMatias = 0;

       //Daño de los personajes
       int golpePj1;
       int golpePj2;


       //PJ1 VS PJ2 (El primero en matar al otro 2 veces gana)
       while (true){

          //Hacemos que se ataquen
          golpePj1 = pj1.atacar(pj2);
          golpePj2 = pj2.atacar(pj1);

          //Mostramos el daño qe hizo cada uno
          System.out.println("----------------------------------------ATAQUE----------------------------------------");
          System.out.println(pj1.getNombre() + " quito -" + golpePj1 + "pts de salud a Pj2, y lleva " + contadorWinsRobingo + " kills.");
          System.out.println(pj2.getNombre() + " quito -" + golpePj2 + "pts de salud a Pj1, y lleva " + contadorWinsMatias + " kills.");
          System.out.println("-------------------------------------------------------------------------------------");

          //Comprobación de salud para revivirlo si tiene 0 + contador de kills de cada uno
          if(pj1.getSalud() <= 0){
             pj1.revivir();
             contadorWinsRobingo++;
             pj2.subirNivel();
             System.out.println("Salud inicial de " + pj2.getNombre() + " +20HP");
             System.out.println(pj2.getNombre() + " adquiere +1 nivel por matar a " + pj1.getNombre());
             System.out.println("Reviviendo a " + pj1.getNombre() + "...");
          }
          if(pj2.getSalud() <= 0){
             pj2.revivir();
             contadorWinsMatias++;
             pj1.subirNivel();
             System.out.println("Salud inicial de " + pj1.getNombre() + " +20HP");
             System.out.println(pj1.getNombre() + " adquiere +1 nivel por matar a " + pj2.getNombre());
             System.out.println("Reviviendo a " + pj2.getNombre() + "...");

          }

          //Comprobación de kills
          if (contadorWinsRobingo == 2){
             System.out.println("Robingo es el ganador de esta batalla");
             break;
          }
          if (contadorWinsMatias == 2){
             System.out.println("Matias es el ganador de esta batalla");
             break;
          }

          //Salud de los pj informativa
          System.out.println("**SALUD ACTUAL**");
          System.out.println(pj1.getNombre() + " " + pj1.getSalud() + "HP");
          System.out.println(pj2.getNombre() + " " + pj2.getSalud() + "HP");
          System.out.println();


          //Botón para continuar
          System.out.println("Presina ENTER para seguir viendo la batalla...");
          sc.nextLine();

       }

    }
}
