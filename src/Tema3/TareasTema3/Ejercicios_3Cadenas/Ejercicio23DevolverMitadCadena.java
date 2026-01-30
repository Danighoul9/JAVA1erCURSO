package Tema3.TareasTema3.Ejercicios_3Cadenas;

public class Ejercicio23DevolverMitadCadena {
    public static String mitadCadena (String cad){
        return cad.substring(0,cad.length()/2);
    }

    public static String mitadCadenaFinal (String cad){
        return cad.substring(cad.length()/2);
    }

    static void main(String[] args) {
        //Escribe un metodo que te devuelva la mitad de una cadena

        String cadena = "Esta cadena es muy larga por lo tanto escribe solo la mitad";

        System.out.println(mitadCadena(mitadCadena(cadena)));
        System.out.println(mitadCadena(mitadCadenaFinal(cadena)));


    }

}
