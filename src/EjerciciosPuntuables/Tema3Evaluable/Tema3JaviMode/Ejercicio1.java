package EjerciciosPuntuables.Tema3Evaluable.Tema3JaviMode;

public class Ejercicio1 {

    /**
     * Realiza una función que reciba como parámetro una cadena de texto y devuelva esa cadena con
     * las vocales cifradas según el siguiente patrón:
     * Vocal Sustituto
     * a/A 4
     * e/E 3
     * i/I 1
     * o/O 0
     * u/U 9
     * Además, debe invertir el orden de cada palabra (pero no el orden de las palabras en la frase)
     */

    /**
     * Encripta un texto, cambiando vocales e invirtiendo las palabras
     * @param texto
     * @return
     */
    public static String encriptar(String texto) {
        StringBuffer sb = new StringBuffer(texto);
        StringBuffer salida = new StringBuffer();
        //1. Cambiar vocales
        for(int i=0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            switch (letra) {
                case 'a','A': sb.setCharAt(i, '4'); break;
                case 'e','E': sb.setCharAt(i, '3'); break;
                case 'i','I': sb.setCharAt(i, '1'); break;
                case 'o','O': sb.setCharAt(i, '0'); break;
                case 'u','U': sb.setCharAt(i, '9'); break;
            }
        }

        //2. Invertir palabras
        String[] palabras = sb.toString().split(" ");
        for(int i=0; i < palabras.length; i++) {
            salida.append(new StringBuffer(palabras[i]).reverse()).append(" ");
        }

        //3. Devolver texto encriptado
        return salida.toString().trim();
    }

    public static void main(String[] args) {
        String textoEncriptado;
        String texto = "Buenos dias Eva";
        textoEncriptado = encriptar(texto);
        System.out.println("Texto encriptado: " + textoEncriptado);
    }

}
