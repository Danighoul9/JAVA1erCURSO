package Tema5.TareasTema5.GestorDeTareas.Modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TareaUrgente extends TareaBase{

    private Integer plazoHoras;

    public TareaUrgente(String titulo, String descripcion, Integer plazoHoras) {
        super(titulo, descripcion,PrioridadTarea.URGENTE);
        this.plazoHoras = plazoHoras;
    }


    //Getters y Setters
    public Integer getPlazoHoras() {
        return plazoHoras;
    }

    public void setPlazoHoras(Integer plazoHoras) {
        this.plazoHoras = plazoHoras;
    }


    @Override
    public String getTipo() {
        return "URGENTE";
    }


    /**
     * Metodos propios
     */

    /**
     * Metodo para saber is la tarea esta vencida
     */
    public boolean estaVencida(){
         /*
        if (this.estado != EstadoTarea.COMPLETADA && this.plazoHoras < 24) {
            return false;
        } else {
            return true;
        }
        */

        //Si la fechaCreación + plazoHoras < fechaHoraActual
        //1. Sacamos la fecha y hora actual
        LocalDateTime fechaActual = LocalDateTime.now();

        //2. Convertimos la fecha de creación a LocalDateTime
        LocalDateTime fechaCreacionLDT = fechaCreacion.atTime(0,0);
        fechaCreacionLDT = fechaCreacionLDT.plusHours(plazoHoras);

        //3. Comparamos las dos fechas
        return fechaActual.isAfter(fechaCreacionLDT);
    }



















}
