package Tema6.invocarMetodosPadre;

public class Empleado {
    protected String nombre;
    protected String email;
    protected Double salarioBaseAnual;
    protected Integer antiguedad;
    private static Double bonoAntiguedad = 500.0;

    public Empleado(String nombre, String email, Double salarioBaseAnual, Integer antiguedad) {
        this.nombre = nombre;
        this.email = email;
        this.salarioBaseAnual = salarioBaseAnual;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalarioBaseAnual() {
        return salarioBaseAnual;
    }

    public void setSalarioBaseAnual(Double salarioBaseAnual) {
        this.salarioBaseAnual = salarioBaseAnual;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", salarioBaseAnual=").append(salarioBaseAnual);
        sb.append(", antiguedad=").append(antiguedad);
        sb.append('}');
        return sb.toString();
    }

    public Double calcularSalario() {
        return salarioBaseAnual + (antiguedad * bonoAntiguedad * 1.1);
    }
}
