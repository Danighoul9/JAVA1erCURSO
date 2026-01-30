package Tema3.TareasTema3.Ejercicios_1Arrays;

public class EmpiezaPor {

    public static String[] comprobarEmpieza(String[] nombres, char letra) {
        //Los String son como un array de caracteres
        //"Aragorn" --> ['A', 'r', 'a', 'g', 'o', 'r', 'n']
        //El primer caracter sería "Aragorn".charAt(0) -> 'A'

        //Contar cuantas palabras empiezan por 'a'
        int contadorPalabras=0;
        for(int i=0; i < nombres.length; i++) {
            if (nombres[i].toLowerCase().charAt(0) == letra) {
                contadorPalabras++;
            }
        }

        //Crear el array de ese tamaño
        String[] nombresEmpiezan = new String[contadorPalabras];

        //Guardar los nombres que empiezan por 'a'
        int contador=0;
        for(int i=0; i < nombres.length; i++) {
            if (nombres[i].toLowerCase().charAt(0) == letra) {
                nombresEmpiezan[contador] = nombres[i]; //No puedo acceder a las mismas posiciones del array original
                contador++;
            }
        }

        return nombresEmpiezan;
    }

    public static void main(String[] args) {

        //Dado un array de String con nombres élficos, genera una función que devuelva
        //un nuevo array con los nombres que empiezan por 'a' (mayúscula o minúscula) --> toLowerCase() o toUpperCase()
        //Pista: primero cuenta cuántos empiezan por 'a' para crear el array del tamaño adecuado.

        String[] elfos = {"AraGorn", "Legolas", "Celeborn", "Arwen", "Elrond", "Galadriel", "Thranduil", "Aegnor"};

        String[] nombres = comprobarEmpieza(elfos, 'a');
        for(int i=0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

    }
}
