package Tema3.TareasTema3.Ejercicios_3Cadenas;

public class Ejercicio24EliminarEspacios {

    static void main(String[] args) {


        //Elimina los espacios (intermedios tambien) de la cadena de texto
        String cadena = "      Esto es una cadena con espacios,   muchos        ";
        System.out.println(cadena + ".");


        //Usar tirm para eliminar los espacios del principio  del final
        cadena = cadena.trim();
        System.out.println(cadena + ".");

        //Quitar espacios del intermedios
        //Sustituir cualquier combinación de espacios òr un solo espacio
        cadena = cadena.replaceAll( " +", " ");
        System.out.println(cadena);


    }
}
