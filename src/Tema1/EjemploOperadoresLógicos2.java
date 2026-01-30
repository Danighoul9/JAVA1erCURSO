package Tema1;

public class EjemploOperadoresLógicos2 {
    public static void main(String[] args) {

        double precio1 = 9.99;
        double precio2 = 8.99;
        double descuento = 1.0;

        boolean resultado;

        //1. precio1 >= 9 && descuento >= 1
        //           T       &&         F  = F

        resultado = (precio1 >= 9 && descuento >= 1);
        System.out.println(resultado);

        //2. precio1 >= 10  O precio2 <= 10
        //          F      ||       T      = T

        resultado = (precio1 >= 10 ||precio2 <= 10);
        System.out.println(resultado);

        //3. ! (precio1 >= 9 Y precio2 >= 5 Y descuento > 0.5)
        //          T     &&        T    &&         T         = F

        resultado = !(precio1 >= 9 && precio2 >= 5 && descuento > 0.5);
        System.out.println(resultado);

        //4. (!(precio1 >= precio2)) O (precio2 < 9)
        //            T-->F          ||     T       = T
        resultado = (!(precio1 >=precio2)) || (precio2 < 9);
        System.out.println(resultado);

        //5. ( (precio1 <= precio2) O (descuento > 1) ) && (precio2 < 10)
        //           (  F           ||         F   ) = F     &&     T    = F


        resultado = ( ( precio1 <= precio2) || (descuento > 1) ) && (precio2 < 10);
        System.out.println(resultado);


    }
}
