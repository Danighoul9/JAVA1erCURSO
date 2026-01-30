package ExamenesDePrueba.SegundoExamen;


public class EjerciciO3_CODIFICADOR {
    /**
     *
     * Crea un función en Java que tome una frase como parámetro y aplique varias
     * transformaciones para codificar un mensaje de salida según las siguientes reglas:
     * a. Primera letra al final: Mueve la primera letra de cada palabra al final de la palabra.
     * b. Reemplazo de vocales: Reemplaza las vocales de la palabra con caracteres
     * especiales: a -> @, e -> &, i -> $, o -> º, u -> #.
     * c. Invertir cada palabra: Si la longitud de la palabra es impar, invierte la palabra
     * resultante antes de añadirla al mensaje codificado.
     * Realiza otro función para desencriptar el mensaje y comprueba que funciona
     * desencriptando el mismo mensaje encriptado, y viendo que el resultado es el original.
     *
     */

    /**
     * Método que devuelve la primera letra de cada palabra del texto al final de cada palabra
     * @param texto
     * @return
     *       "Hola mundo cruel"
     *       "aolH oundm lruec"
     *
     *       1. Split para tener un array de palabras
     *       2. Recorrer el array
     *       3. En cada palabra sustituyo palabra[i] por palabra[long-1]
     *       4. Unir palabras en una frase separado por espacios
     */
    /*
    public static String primeraFinal(String texto) {
        String[] palabras = texto.split(" ");
        for(int i=0; i < palabras.length; i++) {
            String palabra = palabras[i];
            //palabra.charAt(0)
            String letraInicial = palabra.substring(0, 1);
            //palabra.charAt(palabra.length()-1)
            String letraFinal = palabra.substring(palabra.length()-1);

            //No se intercambian en palabras de una sola letra
            if (palabras[i].length() > 1) {
                palabras[i] = letraFinal + palabras[i].substring(1, palabra.length() - 1) + letraInicial;
            }
        }

        //Unir palabras en una frase separado por espacios
        StringBuffer sb = new StringBuffer();
        for(int i=0; i < palabras.length; i++) {
            sb.append(palabras[i] + " ");
        }
        return sb.toString().trim();
    }
    */


    public static String primeraFinal(String texto) {
        String[] palabras = texto.split(" ");
        for(int i=0; i < palabras.length; i++) {
            StringBuffer sbuf = new StringBuffer(palabras[i]);
            if (palabras[i].length() > 1) {
                char primerCaracter = sbuf.charAt(0);
                int longitud = palabras[i].length();
                sbuf.setCharAt(0, sbuf.charAt(longitud-1));
                sbuf.setCharAt(longitud-1, primerCaracter);
                palabras[i] = sbuf.toString();
            }
        }

        //Unir palabras en una frase separado por espacios
        StringBuffer sb = new StringBuffer();
        for(int i=0; i < palabras.length; i++) {
            sb.append(palabras[i] + " ");
        }
        return sb.toString().trim();
    }

    /**
     * Reemplaza las vocales de la palabra con caracteres especiales:
     * a -> @, e -> &, i -> $, o -> º, u -> #.
     * @param texto
     * @return
     */
    public static String reemplazoVocales(String texto) {
        StringBuffer sb = new StringBuffer(texto);
        for(int i=0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            switch (letra) {
                case 'a': sb.setCharAt(i, '@'); break;
                case 'e': sb.setCharAt(i, '&'); break;
                case 'i': sb.setCharAt(i, '$'); break;
                case 'o': sb.setCharAt(i, 'º'); break;
                case 'u': sb.setCharAt(i, '#'); break;
                case '@': sb.setCharAt(i, 'a'); break;
                case '&': sb.setCharAt(i, 'e'); break;
                case '$': sb.setCharAt(i, 'i'); break;
                case 'º': sb.setCharAt(i, 'o'); break;
                case '#': sb.setCharAt(i, 'u'); break;
            }
        }

        return sb.toString();
    }

    public static String invertirImpares(String texto) {
        String[] palabras = texto.split(" ");
        StringBuffer sbaux = new StringBuffer();
        for(int i=0; i < palabras.length; i++) {
            if (palabras[i].length() % 2 != 0) {
                sbaux = new StringBuffer(palabras[i]);
                sbaux.reverse();
                palabras[i] = sbaux.toString();
            }
        }

        //Unir palabras en una frase separado por espacios
        StringBuffer sb = new StringBuffer();
        for(int i=0; i < palabras.length; i++) {
            sb.append(palabras[i] + " ");
        }
        return sb.toString().trim();
    }

    public static String desencriptar(String texto) {
        String textoEnc = texto;
        textoEnc = invertirImpares(textoEnc);
        textoEnc = reemplazoVocales(textoEnc);
        textoEnc = primeraFinal(textoEnc);
        return textoEnc;
    }

    public static String encriptar(String texto) {
        String textoEnc = "";

        textoEnc = primeraFinal(texto);
        //System.out.println(textoEnc);
        textoEnc = reemplazoVocales(textoEnc);
        //System.out.println(textoEnc);
        textoEnc = invertirImpares(textoEnc);
        //System.out.println(textoEnc);

        return textoEnc;
    }

    public static void main(String[] args) {
        String texto = "Javi vamos a necesitar más de 6 horas para hacer el exámen, no te pases";

        System.out.println("Mensaje original:");
        System.out.println(texto);
        String textoEnc = encriptar(texto);
        System.out.println("Mensaje encriptado:");
        System.out.println(textoEnc);
        System.out.println("Mensaje desencriptado:");
        System.out.println(desencriptar(encriptar(texto)));

    }
}
