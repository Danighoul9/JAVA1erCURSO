package Tema2.IFELSEIF;

public class Ejemplo_IF_ELSE {
    public static void main(String[] args) {

        int dado;
        dado= (int) (Math.random() * 6 + 1);

        System.out.println("En el dado te ha salido el número: "+dado);

        //dado == 6 si es true --> se ejecuta lo que hay dentro
        //dado == 6 si es false --> no se ejecuta nada

        if (dado == 6){
            System.out.println("Has ganado");
        } else {
            System.out.println("Más suerte la próxima vez ");
        }

    }
}
