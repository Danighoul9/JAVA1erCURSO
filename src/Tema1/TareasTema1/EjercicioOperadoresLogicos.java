package Tema1.TareasTema1;

public class EjercicioOperadoresLogicos {
    public static void main(String[] args) {

        final int numClasesAnio = 120;
        int numAsiste = 101;
        int practicasEntregadas = 4;
        boolean  autorizacionEspecial = false;
        boolean resultado;

        //Condicion para presentarse a examen final
        //Ha asistido al menos al 80% de las clases Y ha entregado más de 3 practicas
        //0 tiene una autorizacion especial para presentarse

        resultado = (numAsiste >= (numClasesAnio * 0.8)) && (practicasEntregadas > 3) || autorizacionEspecial;

        System.out.println(resultado);


    }
}
