package Tema1;

public class EjemploEnumeradores {
    public static void main(String[] args) {

        enum Notas { SOBRESALIENTE, NOTABLE, APROBADO, SUSPENSO }

        //Declaración de una variable de tipo Notas
        Notas miNota = Notas.SOBRESALIENTE;
        System.out.println(miNota);

        miNota = Notas.NOTABLE;
        System.out.println(miNota);

        miNota = Notas.APROBADO;
        System.out.println(miNota);

    }
}
