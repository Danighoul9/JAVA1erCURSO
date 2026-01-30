package Tema3.TareasTema3.Ejercicios_1Arrays;

public class GuardiasSeguidos {
    public static boolean comprobarVDani(boolean[] guardias) {
        //Recorrer el array de booleanos y verificar si hay tres seguidos
        //true

        int contadorGuardias=0;
        for(int i = 0; i < guardias.length; i++) {
            if (guardias[i]) {
                contadorGuardias++;
            } else {
                contadorGuardias=0;
            }

            if (contadorGuardias == 3) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Dado un array de booleanos que representan guardias (true) y no
        // guardias (false), escribe un programa que determine si hay al menos
        // tres guardias seguidos en el array.
        // Utiliza una función que reciba el array y devuelva true o false.
        // Ojo: el array puede tener cualquier tamaño.
        // Ojo!, te puedes pasar al comprobar

        boolean[] guardias = {true, true, false, true,false, true, false, true};

        if(comprobarVDani(guardias)) {
            System.out.println("Hay 3 guardias seguidos");
        }else {
            System.out.println("NO hay 3 guardias seguidos");
        }


    }
}
