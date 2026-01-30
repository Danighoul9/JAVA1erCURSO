package Tema5.TareasTema5.NotasCurso;

import java.time.LocalDate;

public class TestExpediente {
    public static void main(String[] args) {

        Expediente ex1 = new Expediente("Dani", "Fernández", Modalidad.GSUPERIOR,
                Sexo.HOMBRE, LocalDate.of(2000, 10, 5), 1);

        ex1.addCalificacion(new NotasCurso("Programación",1, 5.0, 6.0, 5.5));
        ex1.addCalificacion(new NotasCurso("BBDD",1, 3.0, 4.5, 5.0));
        ex1.addCalificacion(new NotasCurso("SSII",1, 7.0, 8.0, 9.5));

        System.out.println(ex1);
        System.out.println(ex1.getNombre() + " tiene " + ex1.getEdad());
        System.out.println(ex1.getNombre() + " titula " + ex1.titula());
        System.out.println(ex1.getNombre() + " media total " + ex1.mediaExpediente());



    }
}
