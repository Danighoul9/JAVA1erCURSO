package Tema1;

public class OperadoresDeAsignacion {
    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 3;

        System.out.println(num1 = num2); // --> n1 = 3
        System.out.println(num1 += num2); // --> n1 = n1+n2 = 3+3 = 6
        System.out.println(num1 *= 5); // --> n1 = n1*5 = 6*5 = 30
        System.out.println(num1 %= 2); // --> n1 = n1%2 = 30%2 = (resto de la division)
        System.out.println(num1); // Pinta resultado

        //EJEMPLO (++) (--)

        long numero = 6;
         //num++ --> primero evalua num, y al final de la operacion le suma 1
         //++num --> primero le suma 1, y luego evalua el valo

        System.out.println(numero++); //Pinta 6, luego suma 1
        System.out.println(numero); //Pinta 7

        System.out.println(++numero); //Pinta 8, primero suma luego pinta
        System.out.println(numero); //Pinta 8

        //EJEMPLO

        int turno = 14;
        turno++; // turno = turno+1 --> turno += 1

        System.out.println(turno);

        //Ejemplo de aplicación

        while ( turno > 0){
            System.out.println(turno);
            turno--;
        }



    }
}
