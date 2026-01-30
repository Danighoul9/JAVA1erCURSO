package Tema2.Bucles;

public class WhileEJ {
    public static void main(String[] args) {

        //Números impar del 1-100, pintalos seguidos separados por comas

        int contador = 1;

        while (contador <= 100){
            System.out.print(contador + ",");
            contador += 2;
        }
    }
}
