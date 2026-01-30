package Tema6.invocarMetodosPadre;

public class App {
    static void main() {

        Empleado emp = new Empleado("Paco", "Pérez", 30000.0, 4);
        IO.println(emp);
        IO.println("Salario anual: " + emp.calcularSalario());

        DirectorDepartamento dpv = new DirectorDepartamento("Manolo", "Cosentino",
                80000.0, 20, Departamento.Ventas);
        IO.println(emp);
        IO.println("Salario anual: " + dpv.calcularSalario());
    }
}
