package Tema6.TareasTema6.EjercicioFechas.Entidades;

import java.time.LocalDate;

public class Utils {
    //Implementa una función que determine si una fecha cae en fin de semana
    public static boolean esFinDeSemana(LocalDate fecha) {
        return (fecha.getDayOfWeek().getValue() == 7 || fecha.getDayOfWeek().getValue() == 6);
    }
}
