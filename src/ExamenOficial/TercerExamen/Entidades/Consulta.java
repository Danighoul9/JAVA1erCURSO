package ExamenOficial.TercerExamen.TercerExamen.Entidades;

import java.time.LocalDate;

public class Consulta implements Facturable{

     private Long id;
     private static Long contadorId = 1L;
     private Animal animal;
     private String veterinario;
     private LocalDate fecha;
     private TipoConsulta tipo;
     private String diagnostico;
     private String tratamiento;
     private Double precioTotal;

    public Consulta(Animal animal, String veterinario, LocalDate fecha,
                    TipoConsulta tipo, String diagnostico, String tratamiento) {

        //Comprobamos que la fecha no sea futura
        if (fecha.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("ERROR: La fecha no puede ser posterior al dia de hoy.");
        }
        this.id = contadorId++;
        this.animal = animal;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.tipo = tipo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.precioTotal = animal.calcularCosteConsulta(tipo);
    }

    public Long getId() {
        return id;
    }
    //set id no hace falta ya que si lo ponemos podriamos romper la base de datos donde almacenemos por número
    // a estas consultas y el get/set de contadorId no lo pongo porque tampoco es necesario, bajo mi opinión.


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoConsulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsulta tipo) {
        this.tipo = tipo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Consulta{");
        sb.append("id=").append(id);
        sb.append(", animal=").append(animal);
        sb.append(", veterinario='").append(veterinario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", tipo=").append(tipo);
        sb.append(", diagnostico='").append(diagnostico).append('\'');
        sb.append(", tratamiento='").append(tratamiento).append('\'');
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }


    /**
     * Genera un String con el resumen completo de la consulta:
     * nombre del animal, propietario, veterinario, fecha, tipo de consulta, diagnóstico,
     * tratamiento y precio total
     * @return
     */
    public String generarFactura(){
        final StringBuffer sb = new StringBuffer("|--- Factura Consulta Canina ---|");
        sb.append("\n| Nombre del animal -> ").append(animal.getNombre());
        sb.append("\n| Propietario -> ").append(animal.getPropietario().getNombre()).append(" ").append(animal.getPropietario().getApellidos());
        sb.append("\n| Veterinario -> ").append(veterinario);
        sb.append("\n| Fecha -> ").append(tipo);
        sb.append("\n| Tipo de consulta -> '").append(tipo);
        sb.append("\n| Diagnostico -> ").append(diagnostico);
        sb.append("\n| Tratamiento -> ").append(tratamiento);
        sb.append("\n| Precio Total : ").append(precioTotal).append("€");
        sb.append('}');
        return sb.toString();
    }



}
