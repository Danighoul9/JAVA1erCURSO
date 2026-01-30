package Tema2.Procedimientos;

import java.util.Scanner;

public class ProcedimientosEJ4 {
    static Scanner sc = new Scanner(System.in);

    public static void pintarMenu() {
        System.out.println("1. Área de un círculo");
        System.out.println("2. Área de un cuadrado");
        System.out.println("3. Área de un rectángulo");
        System.out.println("4. Área de un triángulo");
        System.out.println("5. Área de un rombo");
        System.out.println("6. Área de un hexágono");
        System.out.println("7. Salir");
    }

    public static double area(double valor1, double valor2, String tipo) {
        switch (tipo) {
            case "Circulo":
                return calcAreaCirculo(valor1);
            case "Cuadrado":
                return calcAreaCuadrado(valor1);
            case "Rectangulo":
                return calcAreaRectangulo(valor1, valor2);
            case "Triangulo":
                return ProcedimientoEJ3.areaTriangulo(valor1, valor2);
            case "Rombo":
                return calcAreaRombo(valor1,valor2);
            case "Hexágono":
                return calcAreaHexágono(valor1,valor2);
            default:
                return 0;
        }
    }

    public static double calcAreaCirculo(double rd) {
        return Math.PI * rd * rd;
    }

    public static double calcAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcAreaRombo(double diagonalMayor, double diagonalMenor) {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public static double calcAreaHexágono(double lado, double apotema) {
        return ((lado * 6) * apotema) / 2;
    }




    public static void main(String[] args) {
        //Menú para decir qué tipo de forma para calcular el área quieres

        Scanner sc = new Scanner(System.in);
        int opcion=-1;
        double radio, lado, base, altura, dMayor, dMenor, apotema;

        do {
            try {
                pintarMenu();
                System.out.println("Dime una opción (1-7)");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Dime radio: ");
                        radio = sc.nextDouble();
                        System.out.println("El área es "
                                + area(radio,radio,"Circulo"));
                        break;
                    case 2:
                        System.out.println("Dime lado: ");
                        lado = sc.nextDouble();
                        System.out.println("El área es "
                                + area(lado,lado,"Cuadrado"));
                        break;
                    case 3:
                        System.out.println("Dime base: ");
                        base = sc.nextDouble();
                        System.out.println("Dime altura: ");
                        altura = sc.nextDouble();
                        System.out.println("El área es "
                                + area(base, altura, "Rectangulo"));
                        break;
                    case 4:
                        System.out.println("Dime base: ");
                        base = sc.nextDouble();
                        System.out.println("Dime altura: ");
                        altura = sc.nextDouble();
                        System.out.println("El área es "
                                + area(base, altura, "Triangulo"));
                        break;
                    case 5:
                        System.out.println("Dime diagonal mayor: ");
                        dMayor = sc.nextDouble();
                        System.out.println("Dime diagonal menor: ");
                        dMenor = sc.nextDouble();
                        System.out.println("El área es "
                                + area(dMayor, dMenor, "Rombo"));
                        break;
                    case 6:
                        System.out.println("Dime lado: ");
                        lado = sc.nextDouble();
                        System.out.println("Dime apotema: ");
                        apotema = sc.nextDouble();
                        System.out.println("El área es "
                                + area(lado, apotema, "Hexágono"));
                        break;
                    case 7:
                        System.out.println("Gracias por usar nuestro programa");
                        break;
                    default:
                        System.out.println("Opción incorrecta");

                }
            } catch (Exception ex) {
                System.out.println(ex.toString());
                opcion = -1;
                sc = new Scanner(System.in);
            }

        } while(opcion != 7);


    }
}

