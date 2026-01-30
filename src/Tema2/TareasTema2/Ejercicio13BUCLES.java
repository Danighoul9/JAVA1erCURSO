package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio13BUCLES {
    public static void main(String[] args) {
        //Numero elevado a otro numero, sin usar Math.pow

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado
        
        int i;
        int num;
        int elevado;
        int resultado = 1;
        
        System.out.println("Dime un numero:");
        num = sc.nextInt();
        System.out.println("A cuanto deseas elevar este numero?");
        elevado = sc.nextInt();
        
        for(i = 1; i <= elevado;i++){
            resultado= resultado*num;
        }
        System.out.println("EL resultado es:" + resultado);
        
        
        
        
    }
}
