package Tema2.Procedimientos;

import java.util.Scanner;

public class ProcedimientosEJ5_lol {

    //PINTAMOS EL MENU DE OPCIONES CON UN VOID
    public static void pintarMenu() {
        System.out.println("1. Calcular tus monedas a Bitcoin");
        System.out.println("2. Calcular tus monedas a Ethereum");
        System.out.println("3. Calcular tus monedas a Dogecoin");
        System.out.println("4. Calcular tus monedas a XRP");
        System.out.println("5. Salir");
    }

    //DEPENDIENDO EL STRING SE LLAMA A UN CÁLCULO
    public static double tipoMoneda(double valor1,String tipo) {
        switch (tipo) {
            case "Bitcoin":
                return calcMonedasABitcoin(valor1);
            case "Ethereum":
                return calcMonedasAEthereum(valor1);
            case "Dogecoin":
                return calcMonedasADogecoin(valor1);
            case "XRP":
                return calcMonedasAXRP(valor1);
            default:
                return 0;
        }
    }

    //FUNCIONES DE CALCULOS PARA CADA MONEDA (BITCOIN/ETH/DOGE/XRP)

    //BITCOIN
    public static double calcMonedasABitcoin(double monedas) {
        return monedas * 115375 * 0.86;
    }

    //ETHEREUM
    public static double calcMonedasAEthereum(double monedas) {
        return monedas * 4206 * 0.86;
    }

    //DOGECOIN
    public static double calcMonedasADogecoin(double monedas) {
        return monedas * 0.2044 * 0.86;
    }

    //XRP
    public static double calcMonedasAXRP(double monedas) {
        return monedas * 2.68 * 0.86;
    }




    public static void main(String[] args) {

        //Hacer una app que te permita saber cuantos euros son
        //x monedas de un criptomoneda
        //1.Bitcoin -> 115375 dólares
        //2.Ethereum -> 4206 dólares
        //3.Dogecoin -> 0.2044 dólares
        //4.XRP -> 2.68 dólares
        //
        //Cambio 1 dolar -> 0.86€
        //El programa sera un menú que te permita elegir el tipo de cripto
        // luego te preguntara la cantidad de monedas (double) y te mostrará
        // el resultado en euros
        // se valorará el uso de funciones y control de excepciones

        Scanner sc = new Scanner(System.in);
        int opcion;
        double monedas;
        do {
            try {
                pintarMenu();
                System.out.println("Dime una opción (1-5)");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Dime cuantas monedas tienes: ");
                        monedas = sc.nextDouble();
                        System.out.println("Tus monedas a bitcoin equivalen a " + tipoMoneda(monedas, "Bitcoin")
                                + " €");
                        break;
                    case 2:
                        System.out.println("Dime cuantas monedas tienes: ");
                        monedas = sc.nextDouble();
                        System.out.println("Tus monedas a ethereum equivalen a " + tipoMoneda(monedas, "Ethereum")
                                + " €");
                        break;
                    case 3:
                        System.out.println("Dime cuantas monedas tienes: ");
                        monedas = sc.nextDouble();
                        System.out.println("Tus monedas a dogecoin equivalen a " + tipoMoneda(monedas, "Dogecoin")
                                + " €");
                        break;
                    case 4:
                        System.out.println("Dime cuantas monedas tienes: ");
                        monedas = sc.nextDouble();
                        System.out.println("Tus monedas a XRP equivalen a " + tipoMoneda(monedas, "XRP")
                                + " €");
                        break;
                    case 5:
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

        } while(opcion != 5);


    }
}
