package Tema6.PracticaTema6.Entidades;

import java.time.LocalDate;

public class Cliente extends Persona {
    /**
     * Implementa la clase Cliente que extienda de Persona y añada:
     * Atributos:
     * String licenciaConducir
     * LocalDate fechaObtencionLicencia
     * Constructores:
     * Constructor con todos los parámetros (incluyendo los de la clase padre)
     * Constructor copia
     * Métodos:
     * Getters y setters
     * toString() (debe incluir el número de licencia de conducir y la fecha)
     */

    private String licenciaConducir;
    private LocalDate fechaObtencionLicencia;

    public Cliente(String nombre, String apellidos, String dni, String email, String direccion,
                   String telefono, String licenciaConducir, LocalDate fechaObtencionLicencia) {
        super(nombre, apellidos, dni, email, direccion, telefono);
        this.licenciaConducir = licenciaConducir;
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    public Cliente(Cliente otro) {
        super(otro.nombre, otro.apellidos, otro.dni, otro.email, otro.direccion, otro.telefono);
        this.licenciaConducir = otro.licenciaConducir;
        this.fechaObtencionLicencia = otro.fechaObtencionLicencia;
    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public LocalDate getFechaObtencionLicencia() {
        return fechaObtencionLicencia;
    }

    public void setFechaObtencionLicencia(LocalDate fechaObtencionLicencia) {
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("licenciaConducir='").append(licenciaConducir).append('\'');
        sb.append(", fechaObtencionLicencia=").append(fechaObtencionLicencia);
        sb.append(", id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }



}
