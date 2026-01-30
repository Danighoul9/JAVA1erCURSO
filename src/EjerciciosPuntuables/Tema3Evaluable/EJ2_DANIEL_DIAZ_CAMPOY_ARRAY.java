package EjerciciosPuntuables.Tema3Evaluable;

public class EJ2_DANIEL_DIAZ_CAMPOY_ARRAY {

    public static int tiradaAleatoria() {
        return (int) (Math.random() * 36);
    }
    public static void determinarColor(int numeroRandom) {

        //Numeros que son determinados como ROJO (1 al 10 IMPARES) (19 al 28 IMPARES) (11 AL 18 PARES) (29 AL 36 PARES)
        if(numeroRandom >= 1 && numeroRandom <=10){
            if(numeroRandom % 2 != 0){
                System.out.println("ROJO");
            }
        }
        if(numeroRandom >= 19 && numeroRandom <=28){
            if(numeroRandom % 2 != 0){
                System.out.println("ROJO");
            }
        }
        if(numeroRandom >= 11 && numeroRandom <=18){
            if(numeroRandom % 2 == 0){
                System.out.println("ROJO");
            }
        }
        if(numeroRandom >= 29 && numeroRandom <=36){
            if(numeroRandom % 2 == 0){
                System.out.println("ROJO");
            }
        }

        //Numeros que son determinados como NEGRO (1 al 10 PARES) (19 al 28 PARES) (11 AL 18 IMPARES) (29 AL 36 IMPARES)
        if(numeroRandom >= 1 && numeroRandom <=10){
            if(numeroRandom % 2 == 0){
                System.out.println("NEGRO");
            }
        }
        if(numeroRandom >= 19 && numeroRandom <=28){
            if(numeroRandom % 2 == 0){
                System.out.println("NEGRO");
            }
        }
        if(numeroRandom >= 11 && numeroRandom <=18){
            if(numeroRandom % 2 != 0){
                System.out.println("NEGRO");
            }
        }
        if(numeroRandom >= 29 && numeroRandom <=36){
            if(numeroRandom % 2 != 0){
                System.out.println("ROJO");
            }
        }

        //Numeros que son determinados como VERDE (0)
        if(numeroRandom == 0){
            System.out.println("VERDE");
        }

    }

    public static int[] contarColores(int n){
        //Después, escribe una función llamada int[] contarColores(int n) que simule n tiradas de
        //ruleta y devuelva un array con tres posiciones: [cantidad_rojos, cantidad_negros,
        //cantidad_verdes] .

        int[] contarColores = new int[3];


        for(int i = 0; i < n; i++){
            int numeroRandom = (int) (Math.random() * 36);
            //Numeros que son determinados como ROJO (1 al 10 IMPARES) (19 al 28 IMPARES) (11 AL 18 PARES) (29 AL 36 PARES)
            if(numeroRandom >= 1 && numeroRandom <=10){
                if(numeroRandom % 2 != 0){
                    contarColores[0] += 1;
                }
            }
            if(numeroRandom >= 19 && numeroRandom <=28){
                if(numeroRandom % 2 != 0){
                    contarColores[0] += 1;
                }
            }
            if(numeroRandom >= 11 && numeroRandom <=18){
                if(numeroRandom % 2 == 0){
                    contarColores[0] += 1;
                }
            }
            if(numeroRandom >= 29 && numeroRandom <=36){
                if(numeroRandom % 2 == 0){
                    contarColores[0] += 1;
                }
            }

            //Numeros que son determinados como NEGRO (1 al 10 PARES) (19 al 28 PARES) (11 AL 18 IMPARES) (29 AL 36 IMPARES)
            if(numeroRandom >= 1 && numeroRandom <=10){
                if(numeroRandom % 2 == 0){
                    contarColores[1] += 1;
                }
            }
            if(numeroRandom >= 19 && numeroRandom <=28){
                if(numeroRandom % 2 == 0){
                    contarColores[1] += 1;
                }
            }
            if(numeroRandom >= 11 && numeroRandom <=18){
                if(numeroRandom % 2 != 0){
                    contarColores[1] += 1;
                }
            }
            if(numeroRandom >= 29 && numeroRandom <=36){
                if(numeroRandom % 2 != 0){
                    contarColores[1] += 1;
                }
            }

            //Numeros que son determinados como VERDE (0)
            if(numeroRandom == 0){
                contarColores[2] += 1;
            }

        }


        return contarColores;
    }


    static void main(String[] args) {

        //Simulador de Ruleta

        //Escriba un programa que simule una ruleta simplificada con números del 0 al 36. El programa
        //debe:

        //1. Generar tiradas aleatorias de la ruleta hasta que salga el número 0 (la banca gana).

        //2. Mostrar cada número que sale y clasificarlo como:

        //ROJO: Números impares del 1 al 10 y del 19 al 28, y números pares del 11 al 18 y del
        //29 al 36

        //NEGRO: El resto de números excepto el 0

        //VERDE: El número 0

        //3. Contar cuántas tiradas se realizaron hasta que salió el 0.

        //4. Mostrar la suma total de todos los números que salieron.

        //Después, escribe una función llamada int[] contarColores(int n) que simule n tiradas de
        //ruleta y devuelva un array con tres posiciones: [cantidad_rojos, cantidad_negros,
        //cantidad_verdes] .

        //Prueba el método con n = 50 y n = 200 .

        int numeroRandom = -1;
        int contador = 0;
        int sumaTotal = 0;




        for (int i = 1; i != 0 ; i++){

            //Tirada Aleatoria
            numeroRandom = tiradaAleatoria();

            //Acumulador para mostrar la suma de todos los números
            sumaTotal += numeroRandom;

            //MUESTRO EL NUMERO
            System.out.print(numeroRandom + " = ");

            //Determinamos el color del número según las instrucciones
            determinarColor(numeroRandom);
            System.out.println();

            //Si el numero es 0 salimos del for, si no sumamos 1 al contador
            if(numeroRandom == 0){
                break;
            }else{
                contador++;
            }
        }
        System.out.println("La suma total de todos los numeros que salieron es de: " + sumaTotal );
        System.out.println("Salio el numero 0 en " + contador + " tiradas");

        //PARTE DE CONTAR LOS COLORES CON (N) TIRADAS
        System.out.println("Ruleta de colores con (N) tiradas");
        int[] conteoDeColores;
        int n= 100;

        conteoDeColores = contarColores(n);
        System.out.println("Se hicieron " + n + " tiradas.");
        System.out.println("Salieron " + conteoDeColores[0] + " Rojos.");
        System.out.println("Salieron " + conteoDeColores[1] + " Negros.");
        System.out.println("Salieron " + conteoDeColores[2] + " Verdes.");

    }
}
