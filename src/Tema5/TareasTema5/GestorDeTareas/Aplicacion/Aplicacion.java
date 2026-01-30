package Tema5.TareasTema5.GestorDeTareas.Aplicacion;

import Tema5.TareasTema5.GestorDeTareas.Modelos.EstadoTarea;
import Tema5.TareasTema5.GestorDeTareas.Modelos.PrioridadTarea;
import Tema5.TareasTema5.GestorDeTareas.Modelos.TareaProgramada;
import Tema5.TareasTema5.GestorDeTareas.Modelos.TareaUrgente;
import Tema5.TareasTema5.GestorDeTareas.Servicios.GestorTareas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Aplicacion {
    static void main() {

        TareaUrgente TU1 = new TareaUrgente("Programar Java", "Practicar los ejercicios para el examen",
                48);

        TU1.mostrarDetalle();
        TU1.getTipo();
        TU1.ejecutar();
        TU1.mostrarDetalle();

        IO.println(TU1.estaVencida());

        TareaProgramada TP1 = new TareaProgramada("ExamenAna", "Exame de SSII", PrioridadTarea.ALTA,
                LocalDate.of(2026, 1, 23), LocalTime.of(18,0));

        TP1.mostrarDetalle();
        IO.println(TP1.obtenerDiasSemana());


        System.out.println("-----------------------------GESTOR DE TAREAS----------------------------------------------");
        GestorTareas gt = new GestorTareas("Daniel Diaz");
        gt.addTarea(TU1);
        gt.addTarea(TP1);
        gt.listarTareas();

        System.out.println("---------------------------------------------------------------------");
        gt.listarTareasPendientes();

        System.out.println("---------------------------------------------------------------------");
        IO.println(gt.getTareasPorEstado(EstadoTarea.COMPLETADA));







    }
}
