package Tema3.TareasTema3.Ejercicios_3Cadenas;

public class Ejercicio31TecladodalceT {
    static void main(String[] args) {


        String cadena = "teclado";

        //Version StringBuffer
        StringBuffer cadenaInvertida = new StringBuffer(cadena);
        StringBuffer resultado = new StringBuffer();
        //System.out.println(cadenaInvertida.reverse());

       resultado.append(cadenaInvertida)
                .append(cadenaInvertida.reverse().substring(1));

       System.out.println(resultado);


       //Con String

        String resuStr = cadena;
        for(int i = cadena.length()-2 ; i >= 0; i--){
            resuStr += cadena.charAt(i);
        }

        System.out.println(resuStr);




    }
}
