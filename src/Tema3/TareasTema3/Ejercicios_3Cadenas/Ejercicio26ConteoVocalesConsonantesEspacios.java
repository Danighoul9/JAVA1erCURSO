package Tema3.TareasTema3.Ejercicios_3Cadenas;

import java.util.Scanner;

public class Ejercicio26ConteoVocalesConsonantesEspacios {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Diseña un programa en Java que solicite al usuario una cadena de
        //caracteres y muestre por pantalla un conteo de cuántas vocales,
        //consonantes y espacios en blanco contiene la cadena introducida.

        String cadena = "Javi tengo la cabeza loca ya, para!!!";

        System.out.println("Dime una cadena de caracteres y contaremos cuantas vocales contiene");
        String cadUser = sc.nextLine();
        int contadorVocales = 0;
        int contadorEspacios = 0;
        int contadorConsonantes = 0;


        //Modo lento
        for(int i = 0; i < cadUser.length(); i++){

            if(cadUser.charAt(i) == 'a' || cadUser.charAt(i) == 'e' || cadUser.charAt(i) == 'i' || cadUser.charAt(i) == 'o' ||
                    cadUser.charAt(i) == 'u' || cadUser.charAt(i) == 'á' || cadUser.charAt(i) == 'é' || cadUser.charAt(i) == 'í' ||
                    cadUser.charAt(i) == 'ó' || cadUser.charAt(i) == 'ú'){
                contadorVocales++;
            }else if(cadUser.charAt(i) == ' '){
                contadorEspacios++;
            }else if (cadUser.charAt(i) == ','){
                continue;
            }else{
                contadorConsonantes++;
            }
        }
        System.out.println("Hay " + contadorVocales + " vocales," + contadorConsonantes + " consonantes " +
                contadorEspacios + " espacios el texto : " + cadUser);
        

    }
}
