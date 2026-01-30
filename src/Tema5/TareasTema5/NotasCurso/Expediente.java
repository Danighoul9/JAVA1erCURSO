package Tema5.TareasTema5.NotasCurso;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Objects;

public class Expediente {

    private static Integer totalAlumnado = 0;

    private final Integer id = (++totalAlumnado + 10000);
    private String nombre;
    private String apellidos;
    private Sexo sexo;
    private LocalDate fechaNacimiento;
    private Integer curso;
    private Modalidad modalidad;
    private ArrayList<NotasCurso> calificaciones;

    public Expediente(String nombre, String apellidos,Modalidad modalidad, Sexo sexo, LocalDate fechaNacimiento, Integer curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.modalidad = modalidad;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.curso = curso;
        this.calificaciones = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Integer getCurso() {
        return curso;
    }

    public ArrayList<NotasCurso> getCalificaciones() {
        return calificaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expediente{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", modalidad='").append(modalidad).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", curso=").append(curso);
        sb.append(", calificaciones=").append('\n');
        for (NotasCurso n : calificaciones)
            sb.append(n).append('\n');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Expediente that = (Expediente) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    //----------------------------------------------------------
    /**
     * Añadir y eliminiar Calificaciones al ArrayList</>
     * @param nc
     */
    public void addCalificacion(NotasCurso nc){
        calificaciones.add(nc);
    }

    public void removeCalificacion(NotasCurso nc){
        calificaciones.remove(nc);
    }


    /**
     * Devuelve la edad comparando la fecha actual con la de su nacimiento
     * @return
     */
    public Integer getEdad() {
        //return LocalDate.now().getYear() - fechaNacimiento.getYear();
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    /**
     * Devuelve true si es mayor de edad false si no
     * @return
     */
    public boolean esMayorEdad(){
        return getEdad() >= 18;
    }

    /**
     * Devuelve true si el alumno titula y false si no
     * En FPB titula con 2 o menos supensas
     * En GMEDIO Y GSUPERIOR titula si tiene todas aprobadas
     * @return
     */
    public boolean titula(){
        if(this.getModalidad().equals(Modalidad.FPB)){
            return (this.getNumeroSuspensos() <= 2);
        }else{
            return (this.getNumeroSuspensos() == 0);
        }
    }

    /**
     * Calcula el número de suspensos de un alumno, viendo cuantas notas final son menores a 5
     * @return
     */
    public Integer getNumeroSuspensos(){
        int contador=0;
        for(NotasCurso nc : calificaciones){
            if(nc.getNotaFinal() < 5){
                contador++;
            }
        }
        return contador;
    }

    /**
     * Devuelve la media de las calificaciones (NotaFinal) de un alumno
     * @return
     */
    public double mediaExpediente(){
        double suma = 0.0;
        for(NotasCurso nc : calificaciones){
            suma += nc.getNotaFinal();
        }
        return suma/calificaciones.size();
    }
}


