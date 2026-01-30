package Tema5.TareasTema5.BibliotecaDigital;

public class Test {
    static void main(String[] args) {

        Biblioteca b1 =  new Biblioteca("Biblioteca del IES Jaroso");

        AudioLibro elPrincipito = new AudioLibro("El principito", "Elvis presley",
                1965, 170,250,"Ezequiel Martinez");


        Ebook detrasDeTi = new Ebook("Detras de ti", "Charlie Macconajiu",
                1911, 89,130,"Isandro Dernotme");

        Libro lb1 = new Libro("Java for dummies","Michigan Heathon",2003);

        //Añadir contenido digital a la biblioteca
        b1.addContenido(elPrincipito);
        b1.addContenido(detrasDeTi);
        b1.addContenido(lb1);

        for (Libro bd : b1.getContenidos()){
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println(bd);
            System.out.println(bd.getTipo());
            //System.out.println(bd.reproducir());
            System.out.println("-----------------------------------------------------------------------------");
        }



    }
}
