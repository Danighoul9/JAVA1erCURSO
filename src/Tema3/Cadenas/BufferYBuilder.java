package Tema3.Cadenas;

public class BufferYBuilder {
    public static void main(String[] args) {

        //Cada vez que utilizamos el + para concatenar cadenas,
        //se crea un nuevo objeto String
        //String es un objeto no mutable -> son constantes, su valor no se modifica
        String texto = "Hola" + " "; //He creado 3 objetos String
        //char[] texto1 = {'H','o','l','a'};        //tamaño 4
        //char[] texto2 = {' '};                    //tamaño 1
        //char[] texto3 = {'H','o','l','a', ' '};   //tamaño 5
        //texto1 = texto3;
        texto = "Pepe"; //se crea otro objeto String

        //Para crear cadenas mutables usamos StringBuilder y StringBuffer
        //Podemos modificar la cadena sin crear un nuevo objeto.
        //Crece en tamaño de forma dinámica
        StringBuilder sb = new StringBuilder("Hola");
        sb.append(" ");
        sb.append("Pepe");
        System.out.println(sb); //Solo hay un objeto StringBuilder

        //Darle la vuelta al StringBuffer
        sb.reverse();
        System.out.println(sb);

        //Replace, sustituye una parte de la cadena
        sb.replace(0, 3, "Mundo");
        System.out.println(sb);

        //Insertar subcadena en cadena, desplaza a la derecha el resto de la cadena
        sb.insert(0, "Hola ");
        System.out.println(sb);

        //Buscar una subcadena en una cadena, en qué posición empieza
        System.out.println(sb.indexOf("Mundo"));
        System.out.println(sb.indexOf("Munda"));

        //Modificar un caracter concreto por otro
        sb.setCharAt(0, 'P'); //sb[0] = 'P'
        System.out.println(sb);

        //StringBuffer
        StringBuffer sb2 = new StringBuffer("Hola");
        sb2.append(" ");
        sb2.append("Pepe");
        System.out.println(sb2);

        //Pasar de String a StringBuilder
        String cadena = "Hola"; //Inmutable
        StringBuilder sb3 = new StringBuilder(cadena); //Mutable
        sb3.setCharAt(2,'L');
        System.out.println(sb3);

        //Pasar de StringBuilder a String --> toString
        String cadenaConvertida = sb3.toString();
        System.out.println(cadenaConvertida);





    }
}
