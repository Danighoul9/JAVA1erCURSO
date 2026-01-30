package ExamenOficial.SegundoExamen;

import java.util.Locale;

public class EJ1_DANIEL_DIAZ_CAMPOY {

    public static String encriptar(String texto){

        StringBuilder sb = new StringBuilder(texto.toLowerCase());
        StringBuilder salida = new StringBuilder(sb);

        //Transformar a mayusculas
        for(int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) == 'a') {sb.setCharAt(i,'A');}
            else if(texto.charAt(i) == 'e'){sb.setCharAt(i,'E');}
            else if(texto.charAt(i) == 'i'){sb.setCharAt(i,'I');}
            else if(texto.charAt(i) == 'o'){sb.setCharAt(i,'O');}
            else if(texto.charAt(i) == 'u'){sb.setCharAt(i,'U');}
        }

        //CONSONANTES
        char[] consonantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'c',
        'v', 'w', 'x','y','z'};


        for(int i= 0; i < texto.length(); i++){
            for(int j = 0; j < consonantes.length; j++){
                if (texto.charAt(i)==consonantes[j]){
                    if(texto.charAt(i)=='z'){
                        sb.setCharAt(i,'b');
                    }else {
                        sb.setCharAt(i, consonantes[j + 1]);
                    }
                }
            }
        }

        String[] palabras = sb.toString().split(" ");
        for(int i=0; i < palabras.length; i++) {
            salida.append(new StringBuffer(palabras[i]).reverse()).append(" ");
        }

        return salida.toString().trim();
    }

    public static String desencriptar(String texto){

        String textoEnc = texto;
        textoEnc = encriptar(textoEnc);
        return textoEnc;

    }



    static void main(String[] args) {

        //Ejercicio 1. Transformador de texto (3 puntos)

        //Desarrolla una clase TransformadorTexto con dos métodos estáticos:

        //1.1 Método encriptar (1.75 puntos)
        //Recibe un texto y lo convierte según estas transformaciones, aplicándose en este orden:
        //Cambia todas las consonantes por su siguiente letra en el abecedario (z pasa a b).
        //Las vocales a, e, i, o, u pasan a mayúsculas.
        //Invierte el orden de las letras en cada palabra individual.
        //Por ejemplo:
        //Entrada: hola mundo
        //Salida: Alpm Ovnpe


        //1.2 Método desencriptar (1.25 puntos)
        //Recibe un texto encriptado y realiza el proceso inverso para recuperar el texto original:
        //Invierte el orden de las letras en cada palabra.
        //Las vocales mayúsculas A, E, I, O, U pasan a minúsculas.
        //Cambia cada consonante por su letra anterior en el abecedario (b pasa a z).
        //Por ejemplo:
        //Entrada: Alpm Ovnpe
        //Salida: hola mundo


        //Indicaciones:
        //No se pueden usar estructuras dinámicas como ArrayList.
        //Usa preferentemente char[] o StringBuilder .
        //Debes implementar ambos métodos: String encriptar(String texto) y String
        //desencriptar(String texto) .
        //Programa principal debe demostrar que encriptar y luego desencriptar devuelve el texto
        //original.

        String textoEncriptado;
        String texto= "Hola mundo";
        textoEncriptado= encriptar(texto);


        System.out.println("Texto normal: " + texto);
        System.out.println("Texto Encriptado: " + textoEncriptado);
        System.out.println("Texto Desencriptado: " + desencriptar(encriptar(texto)));
    }
}
