package EjerciciosPuntuables.Tema3Evaluable;

import java.util.Scanner;

public class EjericioRepasoComplicadisimo {

    public static void pintarMatriz(char[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%2c", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void generarSalida(char[][]m){
        int salida = (int) (Math.random()*3 +1);
        System.out.println(salida);

        switch (salida){
            case 1:
                m[0][(int)(Math.random()*7) +2]='#';
                break;

            case 2:
                m[9][(int)(Math.random()*9) +1]='#';
                break;

            case 3:
                m[(int)(Math.random()*7) +2][0]='#';
                break;

            case 4:
                m[(int)(Math.random()*9) +1][9]='#';
                break;
        }
    }

    public static void generarBomba(char[][]m, boolean mostrarBomba){

        int bombaI=(int) (Math.random()*8 +1);
        int bombaJ=(int) (Math.random()*8 +1);

        if(mostrarBomba){
            m[bombaI][bombaJ]='Ç';
        }else{
            m[bombaI][bombaJ]='.';
        }

    }

    public static void menuOpciones(){
        System.out.println("1.Derecha");
        System.out.println("2.Izquierda");
        System.out.println("3.Abajo");
        System.out.println("4.Arriba");
    }



    //LABERINTO. En este ejercicio vamos a implementar un juego de un laberinto. Para ello nos
    //crearemos una matriz de 20 x 20 caracteres.

    //La matriz será un eje de coordenadas donde la esquina superior izquierda será el inicio del
    //laberinto y deberás llegar a la salida. Las casillas válidas irán de (0,0) a (19,19).


    //Antes de jugar debes hacer lo siguiente:
    //- Deberás rellenar la matriz inicialmente con el carácter “.”.
    //- Los bordes superior e inferior los vas a rellenar con el carácter “-“.
    //- Los bordes derecho e izquierdo los vas a rellenar con el carácter “|”.
    //- Generar la salida del laberinto aleatoriamente. La salida debe estar en un borde y no
    //debe coincidir con el inicio (0,0). Debes generar aleatoriamente esa casilla y marcarla
    //con el carácter “#”.
    //- Genera una bomba, será una casilla aleatoria del tablero interior, no de los bordes. Ahí
    //habrá una bomba oculta, solo se sabrá por sus coordenadas, si pasas por esa
    //coordenada sin saberlo explotará y perderás.


    //Jugar:
    //- El jugador aparece pintado con una “@” en la casilla (0,0).
    //- Implementa una función pintar que pinte el tablero tras cada movimiento.
    //- Te aparecerá un menú con cuatro opciones: 1 (derecha), 2 (izquierda), 3 (abajo), 4
    //(derecha).
    //- Deberás mover la “@” una posición según la tecla pulsada.
    //- Si te sales de la matriz moviéndote habrás perdido el juego y este finalizará. Esto es lo
    //más complicado del juego, pues dependiendo de dónde te encuentres un movimiento
    //concreto podrá hacerte salir del tablero y debes comprobar todas las opciones
    //posibles.Truco: si usas control de excepciones (IndexOutOfBoundException) no
    //tendrías que comprobar con un if, sino que si sale esa excepción es que he intentado
    //salir del tablero y el juego termina.
    //- Si consigues llegar al carácter marcado con “#” habrás ganado. Muestra un mensaje
    //indicándolo y también indica el número de pasos que has dado desde el inicio hasta
    //encontrar la salida.

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char[][] tablero = new char[10][10];
        boolean mostrarBomba = true;
        boolean derrota = false;
        int fila=0,columna=0;

        //Armamos el tablero con las especificaciones dadas
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '.';
                tablero[0][j]='-';
                tablero[9][j]='-';
                tablero[i][0] = '|';
                tablero[i][9] = '|';
            }
        }

        //Generamos la salida en el tablero aleatoriamente
        generarSalida(tablero);

        //Generamos la bomba en posicion random, si el usuario la pisa explota y muere automaticamente
        generarBomba(tablero,mostrarBomba);


        int user;
        do{
            try{
                //Inicio del jugador
                tablero[fila][columna] = '@';

                //Mostramos el tablero con sus especificaciones, @(inicio) y #(salida)
                pintarMatriz(tablero);

                //Mostramos la opciones para que el usuario elija donde moverse
                menuOpciones();
                //Dejamos que el usuario elija lo que quiere hacer
                System.out.println("¿Que movimiento quieres realizar?");
                user = Integer.parseInt(sc.nextLine());


                if(user == 1){
                     columna++;
                } else if (user == 2) {
                     columna--;
                }else if (user == 3) {
                     fila++;
                }else if (user == 4) {
                     fila--;
                }


                //Condiciones que determinan el fin de la partida

                if(tablero[fila][columna] == 'Ç'){
                    System.out.println("Pisaste la bomba y moriste una lastima...");
                    break;
                }

                if(tablero[fila][columna] == '#'){
                    System.out.println("Encontraste la salida y no pisaste ninguna bomba, ¡ENHORABUENA!");
                    break;
                }

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Te has salido del tablero por lo tanto has perdido...");
                derrota = true;
            }

        }while (!derrota);

    }
}
