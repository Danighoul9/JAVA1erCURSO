package Tema5.Clone_This_Copia.ConstructorCopia;

/**
 * Clase POJO: Plain Old Java Object
 */
public class Empleado {

    enum Departamento {
        TI,
        Marketing,
        Finanzas,
        RRHH
    }

    private String nombre;
    private String apellidos;
    private Integer edad;
    private Double salario;
    private String email;
    private String telefono;
    private Departamento departamento;

    //Constructor parametrizado
    public Empleado(String nombre, String apellidos, Integer edad, Double salario, String email, String telefono, Departamento departamento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
        this.email = email;
        this.telefono = telefono;
        this.departamento = departamento;
    }

    //Constructor copia
    public Empleado(Empleado empleado) {
        this.nombre = empleado.nombre;
        this.apellidos = empleado.apellidos;
        this.edad = empleado.edad;
        this.salario = empleado.salario;
        this.email = empleado.email;
        this.telefono = empleado.telefono;
        this.departamento = empleado.departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", salario=").append(salario);
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", departamento=").append(departamento);
        sb.append('}');
        return sb.toString();
    }
}
