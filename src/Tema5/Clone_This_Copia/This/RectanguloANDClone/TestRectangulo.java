package Tema5.Clone_This_Copia.This.RectanguloANDClone;

public class TestRectangulo {
    static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(10, 20);
        Rectangulo r2 = new Rectangulo(15, 10);


        //Podemos ir encadenando llamadas al mismo objeto
        //porque devuelven la referencia al mismo
        r1.incrementarAlto() //R1
                .incrementarAncho() //R1
                .incrementarAncho(); //R1


        r2.incrementarAncho() //R2
                .incrementarAlto() //R2
                .incrementarAlto(); //R2

        System.out.println("R1 " +r1);
        System.out.println("R2 " +r2);

        Rectangulo r3 = r1;//Esto no copia, hace que los dos objetos
                           // sean el mismo y que a los dos le afecten los metodos por igual

        r3.incrementarAncho();
        System.out.println("R1 " +r1);
        System.out.println("R3 " + r3);

        //Clone
        Rectangulo r4 = r1.clone();//El objeto se clona pero al incrementar el ancho u alto de esto se convierte en uno
                                   //completamente diferente a r1

        r4.incrementarAlto()
                .incrementarAlto()
                .incrementarAlto();

        System.out.println("R4 " + r4);








    }
}
