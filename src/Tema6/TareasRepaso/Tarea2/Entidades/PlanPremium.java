package Tema6.TareasRepaso.Tarea2.Entidades;

import java.time.LocalDate;

public class PlanPremium extends Plan {

    /**
     * Implementa PlanPremium, que extiende de Plan:
     *
     * Atributos adicionales:
     * String empresa — empresa o servicio contratado
     * double suplementoPorPersona — coste extra por participante
     *
     * Constructores:
     * Constructor con todos los parámetros necesarios, llamando al padre
     *
     * Métodos:
     * Getters, setters y toString()
     * Implementa getResumenEconomico(): devuelve el presupuesto base más el suplemento por persona,
     * indicando el nombre de la empresa. Coste total = presupuestoEstimado + suplementoPorPersona.
     */

    private String empresa;
    private double suplementoPorPersona;

    public PlanPremium(String titulo, String descripcion, CategoriaPlan categoria,
                       LocalDate fechaPropuesta, LocalDate fechaRealizacion,
                       double presupuestoEstimado, Participante participante,
                       String empresa, double suplementoPorPersona) {
        super(titulo, descripcion, categoria, fechaPropuesta, fechaRealizacion, presupuestoEstimado, participante);
        this.empresa = empresa;
        this.suplementoPorPersona = suplementoPorPersona;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSuplementoPorPersona() {
        return suplementoPorPersona;
    }

    public void setSuplementoPorPersona(double suplementoPorPersona) {
        this.suplementoPorPersona = suplementoPorPersona;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PlanPremium{");
        sb.append("empresa='").append(empresa).append('\'');
        sb.append(", suplementoPorPersona=").append(suplementoPorPersona);
        sb.append(", id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", fechaPropuesta=").append(fechaPropuesta);
        sb.append(", fechaRealizacion=").append(fechaRealizacion);
        sb.append(", presupuestoEstimado=").append(presupuestoEstimado);
        sb.append(", estado=").append(estado);
        sb.append(", participante=").append(participante);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Devuelve el presupuesto base más el suplemento por persona,
     * indicando el nombre de la empresa.
     * Coste total = presupuestoEstimado + suplementoPorPersona.
     * @return
     */
    @Override
    public String getResumenEconomico() {
        final StringBuffer sb = new StringBuffer("--- PRESUPUESTO VIAJE *PREMIUM*---");
        sb.append("\n Presupuesto Base: ").append(presupuestoEstimado).append("€");
        sb.append("\n Suplemento por persona: ").append(suplementoPorPersona);
        sb.append("\n Empresa: ").append(empresa);
        sb.append("\n Coste Total: ").append(presupuestoEstimado + suplementoPorPersona);

        return sb.toString();
    }
}
