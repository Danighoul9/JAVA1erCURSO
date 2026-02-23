package Tema6.TareasTema6.EjercicioFechas.Entidades;


import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Sesion {

    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Sesion(LocalTime horaInicio, LocalTime horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sesion{");
        sb.append("horaInicio=").append(horaInicio);
        sb.append(", horaFin=").append(horaFin);
        sb.append('}');
        return sb.toString();
    }

    /**
     * MÉTODOS DE LA CLASE -----------------------------------------------
     */

    /**
     * Devuelve la duración entre dos LocalTimes
     * @return Duration entre horaInicio y horaFin
     */
    public Duration duracion() {
        return Duration.between(horaInicio, horaFin);
    }

    /**
     * Devuelve si la sesión se solapa con otra, esto pasa cuando su hora de inicio es anterior a la
     * hora de fin de la otra sesión, y su hora de fin es posterior a la hora de inicio de la otra sesión
     * @param otraSesion
     * @return
     */
    public boolean estanSolapadas(Sesion otraSesion) {
        //return this.horaInicio.isBefore(otraSesion.horaFin) && this.horaFin.isAfter(otraSesion.horaInicio);
        return !(this.horaInicio.isAfter(otraSesion.horaFin) || this.horaFin.isBefore(otraSesion.horaInicio));
    }

    /**
     * Devuelve el tiempo de descanso entre dos sesiones.
     * Calcula el intervalo entre el fin de esta sesión y el inicio de la otra.
     * @param otraSesion
     * @return Duration de descanso
     */
    public Duration tiempoDescanso(Sesion otraSesion) {
        return Duration.between(this.horaFin, otraSesion.horaInicio);
    }

}