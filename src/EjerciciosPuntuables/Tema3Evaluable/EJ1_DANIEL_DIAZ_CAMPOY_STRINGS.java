package EjerciciosPuntuables.Tema3Evaluable;

public class EJ1_DANIEL_DIAZ_CAMPOY_STRINGS {

    public static String reemplazoVocales(String texto) {
        StringBuffer sb = new StringBuffer(texto);

        for(int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            switch (letra) {
                case 'a': case 'A': sb.setCharAt(i, '4'); break;
                case 'e': case 'E': sb.setCharAt(i, '3'); break;
                case 'i': case 'I': sb.setCharAt(i, '1'); break;
                case 'o': case 'O': sb.setCharAt(i, '0'); break;
                case 'u': case 'U': sb.setCharAt(i, '9'); break;
            }
        }

        return sb.toString();
    }

    public static String invertirPalabra(String palabra) {
        StringBuilder sb = new StringBuilder();

        for(int i = palabra.length() - 1; i >= 0; i--) {
            sb.append(palabra.charAt(i));
        }

        return sb.toString();
    }

    public static String encriptar(String texto) {
        String textoEnc = texto;

        // 1. Reemplazar vocales
        textoEnc = reemplazoVocales(texto);

        // 2. Separar palabras
        String[] separarPalabras = textoEnc.split(" ");

        // 3. Invertir cada palabra
        StringBuilder resultado = new StringBuilder();

        for(int i = 0; i < separarPalabras.length; i++) {
            resultado.append(invertirPalabra(separarPalabras[i]));
            if (i < separarPalabras.length - 1) {
                resultado.append(" ");
            }
        }

        return resultado.toString();
    }

    static void main(String[] args) {

        String texto = "Buenos dias Eva";

        //Mostramos el texto normal
        System.out.println(texto);
        //Mostramos el texto encriptado
        System.out.println(encriptar(texto));

    }
}

