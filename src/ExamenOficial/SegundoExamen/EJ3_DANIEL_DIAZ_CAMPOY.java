package SegundoExamen;

import java.util.Scanner;

public class EJ3_DANIEL_DIAZ_CAMPOY {

    public static void inicializarTablero(char[][] tablero, int tamano) {
        int fila, columna;
        boolean solapado = false;

        do {
            fila = (int) (Math.random() * 7);
            columna = (int) (Math.random() * 7);

            if (fila <= 7 - tamano) { //Vertical
                //Comprobar que no se solapen
                solapado = false;
                for (int i = 0; i < tamano; i++) {
                    if (tablero[fila + i][columna] == 'B') {
                        solapado = true;
                    }
                }
                //Si no se solapa, continuar
                if (!solapado) {
                    for (int i = 0; i < tamano; i++) {
                        tablero[fila + i][columna] = 'B';
                    }
                    break; //Bomba colocado
                } else {
                    System.out.println("solapado");
                }
            }


        } while (true) ;
    }

    public static int contarMinasAdyacentes(char[][] tablero, int fila, int columna){
        int contadorMinas = 0;

        //CONTADOR DE ABAJOS
        try{
            //Comprobamos abajo/derecha
            if(tablero[fila+1][columna+1] == 'B'){contadorMinas++;}
        }catch(ArrayIndexOutOfBoundsException e){}

        try{
            //Comprobamos abajo/izquierda
            if(tablero[fila+1][columna-1] == 'B'){contadorMinas++;}
        }catch(ArrayIndexOutOfBoundsException e){}

        try{
            //Comprobamos abajo
            if(tablero[fila+1][columna] == 'B'){contadorMinas++;}

        }catch(ArrayIndexOutOfBoundsException e){}


            //CONTADOR DE ARRIBAS
        try{
            //Comprobamos arriba/derecha
            if(tablero[fila-1][columna-1] == 'B'){contadorMinas++;}
        }catch(ArrayIndexOutOfBoundsException e){}

        try{
            //Comprobamos arriba/izquierda
            if(tablero[fila-1][columna+1] == 'B'){contadorMinas++;}
        }catch(ArrayIndexOutOfBoundsException e){}

        try{
            //Comprobamos arriba
            if(tablero[fila-1][columna] == 'B'){contadorMinas++;}
        }catch(ArrayIndexOutOfBoundsException e){}



            //CONTADOR DE LADOS
        try{
            //Comprobamos izquierda
            if(tablero[fila][columna+1] == 'B'){contadorMinas++;}
        }catch(ArrayIndexOutOfBoundsException e){}

        try{
            //Comprobamos a la derecha
            if(tablero[fila][columna-1] == 'B'){contadorMinas++;}
        }catch (ArrayIndexOutOfBoundsException e){}

        return contadorMinas;
    }

    public static void mostrarTablero(char[][] matriz, boolean mostrarMinas) {
        for(int i=0; i < matriz.length; i++) {
            System.out.print(i + " |");
            for(int j=0; j < matriz[i].length; j++) {
                if (mostrarMinas && matriz[i][j] == 'B') { //Ver al principio si me pone los barcos
                    System.out.printf("%2c |", matriz[i][j]);
                } else if (!mostrarMinas && matriz[i][j] == 'B') {
                    System.out.printf("%2c |", '_');
                } else {
                    System.out.printf("%2c |", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static boolean haGanado(char[][] tablero){
        boolean victoria = true;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j] == 'B'){
                    victoria = false;
                }
            }
        }

        return victoria;
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ejercicio 3 (opción 1).
        // Juego: Buscaminas (5 puntos)

        //Desarrolla el siguiente juego por consola usando una matriz 7x7:

        //La matriz contiene 5 minas ocultas (valor 'M') y el resto es vacío ('_').

        //En cada intento, introduce fila y columna:

        //Si acierta una mina: pierde la partida y se muestran todas las minas.

        //Si acierta vacío: marca la casilla mostrando un número del 0 al 8 que indica cuántas
        //minas hay en las casillas adyacentes (horizontal, vertical y diagonal).

        //Si el número es 0 (sin minas alrededor), se muestra '0'.

        //Si intenta descubrir una casilla ya descubierta: no consume intento.

        //El juego termina cuando el usuario descubre todas las casillas seguras o pisa una mina.

        //Muestra el tablero después de cada intento (sin mostrar las minas no reveladas).


        //Requisitos:
        //void inicializarTablero(char[][] tablero) para colocar minas aleatorias (sin que
        //coincidan).
        //int contarMinasAdyacentes(char[][] tablero, int fila, int columna) que devuelve el
        //número de minas alrededor de una posición (máximo 8).
        //void mostrarTablero(char[][] tablero, boolean mostrarMinas) para mostrar el tablero.
        //boolean haGanado(char[][] tablero) para comprobar victoria.
        //Validar que las coordenadas introducidas sean correctas (rango 0-6).
        //Controlar excepciones al leer datos de entrada.
        //Al descubrir una casilla, debe mostrar el número de minas adyacentes en lugar de 'D'.

        //Ejemplo de visualización:
        //0 │ _ │ _ │ 1 │ 0 │ 0 │ _ │ _ │
        //1 │ _ │ 2 │ 1 │ 0 │ 1 │ 2 │ _ │
        //2 │ _ │ _ │ _ │ 0 │ 0 │ 1 │ _ │
        //3 │ _ │ _ │ _ │ 1 │ 1 │ 1 │ _ │
        //4 │ _ │ _ │ _ │ _ │ _ │ _ │ _ │
        //5 │ _ │ _ │ _ │ _ │ _ │ _ │ _ │
        //6 │ _ │ _ │ _ │ _ │ _ │ _ │ _ │
        //Casillas descubiertas: 12 / 44
        //Introduce fila (0-6):

        char[][] tablero = new char[7][7];
        boolean mostrarBombas = true;
        boolean derrota = false;
        int casillasDescubiertas =0;
        int numMinas;
        int fila = 0,columna = 0;

        //Armamos el tablero con las especificaciones dadas
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '_';

            }
        }

        //Colocamos 5 bombas
        inicializarTablero(tablero, 1);
        inicializarTablero(tablero, 1);
        inicializarTablero(tablero, 1);
        inicializarTablero(tablero, 1);
        inicializarTablero(tablero, 1);


        do {
            mostrarTablero(tablero,mostrarBombas);
            try{
                System.out.println("Introduce una fila (0-6):");
                fila =sc.nextInt();
                System.out.println("Introduce una columna (0-6):");
                columna =sc.nextInt();

                //ESTE IF TENIA QUE IR ARRIBA PARA QUE ACTUARA ANTES DE PONER EL CARACTER DE MINAS
                if (tablero[fila][columna] == 'B'){
                    System.out.println("Has pisado una mina, has explotado...");
                    derrota = true;
                    break;
                }else{
                    ++casillasDescubiertas;
                    System.out.println("Casillas descubiertas: " + casillasDescubiertas + "/44");
                }

                tablero[fila][columna]= (char) contarMinasAdyacentes(tablero,fila,columna);

                //Numero minas cerca de donde hemos disparado
                numMinas = contarMinasAdyacentes(tablero,fila,columna);
                tablero[fila][columna]= Integer.toString(numMinas).charAt(0);


                //AÑADIDO AHORA EN CASA
                if(casillasDescubiertas == 44){
                    System.out.println("Has ganado sin pisar ninguna mina, enhorabuena.");
                    break;
                }

                //Comprobación de la victoria
                haGanado(tablero);
            }catch (Exception e){
                System.out.println("Introduce unas cordenadas validas");
                sc.nextLine();
            }

        }while(true);

        //AÑADIDIDO AHORA EN CASA
        if (derrota == true){
            System.out.println("Las bombas se encontraban en las siguientes casillas");
            mostrarTablero(tablero,mostrarBombas = true);
        }
    }
}
