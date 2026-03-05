package ExamenOficial.TercerExamen.Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public abstract class Animal {

     protected Long id;
     private static Long contadorId = 1L;
     protected String nombre;
     protected TipoAnimal tipo;
     protected String raza;
     protected LocalDate fechaNacimiento;
     protected double peso;
     protected EstadoAnimal estado;
     protected Propietario propietario;

    public Animal(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento,
                  double peso, Propietario propietario) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.estado = EstadoAnimal.ALTA;
        this.propietario = propietario;
        //DEBERIA SER ASI -> this.propietario.addAnimales(this);  PERO ME DA PETARDAZO DE NULLPOINTEREXCEPTION
    }

    public Long getId() {
        return id;
    }
    //set id no hace falta ya que si lo ponemos podriamos romper la base de datos donde almacenemos por número
    // a estos animales y el get/set de contadorId no lo pongo porque tampoco es necesario, bajo mi opinión.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("|-- Animal --| -> {");
        sb.append("Id -> ").append(id);
        sb.append(", Nombre -> ").append(nombre).append('\'');
        sb.append(", Tipo -> ").append(tipo);
        sb.append(", Raza -> ").append(raza).append('\'');
        sb.append(", FechaNacimiento -> ").append(fechaNacimiento);
        sb.append(", Peso -> ").append(peso);
        sb.append(", Estado -> ").append(estado);
        sb.append(", Propietario -> ").append(propietario.getNombre() + propietario.getApellidos());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //Metodos propios

    /**
     * Calcula y devuelve la edad del animal en años a partir de
     * fechaNacimiento
     * @return
     */
    public int getEdadAnios(){
        return Math.toIntExact(ChronoUnit.YEARS.between(this.fechaNacimiento, LocalDate.now()));
    }

    /**
     * Devuelve el coste de una consulta según su tipo
     * @param tipo
     * @return
     */
    public abstract double calcularCosteConsulta(TipoConsulta tipo);

}
