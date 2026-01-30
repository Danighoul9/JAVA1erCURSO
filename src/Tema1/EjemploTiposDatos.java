package Tema1;

public class EjemploTiposDatos {
    public static void main(String[] args) {

        //ENTEROS
        int edad = 22;
        long distancia = 1000000000;

        //DECIMALES
        float precio = 100.95f;
        double lecturaTemp = 49.5;
        double dineroMusk = 25e18;
        float dineroMusk1 = 25e33f; //Sale error ya que es un número demasiado grande como para ser un float

        //CARACTER
        char letra = 'A';
        char simbolo = '#';

        //CADENA (cero o más caracteres)
        String nombre = "Daniel";
        String texto = "";
        String categoria = "Móviles";

        //BOOLEANOS (Para verdadero o falso)
        boolean mayorEDAD = true;
        boolean vendido = false;
    }
}
