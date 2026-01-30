package Tema6.invocarMetodosPadre;

public class DirectorDepartamento extends Empleado{
    private Departamento departamento;

    public DirectorDepartamento(String nombre, String email, Double salarioBaseAnual, Integer antiguedad, Departamento departamento) {
        super(nombre, email, salarioBaseAnual, antiguedad);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DirectorDepartamento{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", salarioBaseAnual=").append(salarioBaseAnual);
        sb.append(", antiguedad=").append(antiguedad);
        sb.append(", departamento=").append(departamento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularSalario() {
        Double salario = super.calcularSalario(); //Llama a la versión del método en el padre
        switch (departamento) {
            case TI -> salario += 10000;
            case Marketing -> salario += 5000;
            default -> salario += 2000;
        }
        return salario;
    }
}
