package Tema5.EjemplosArrayList.Empleado;

public class TestEmpresa {
    static void main(String[] args) {
        Empresa cosentino = new Empresa("Cosentino SA");

        //Crear objetos Empleado y añadirlos a la Empresa
        Empleado emp1 = new Empleado("Manuel", "García Minguillán",
                33, 2200.0,"mgin@cosentino.es", "656555889",
                Empleado.Departamento.TI);
        Empleado emp2 = new Empleado("Ana Silvia", "Fernández",
                35, 2500.0,"asilv@cosentino.es", "998855665",
                Empleado.Departamento.RRHH);

        cosentino.addEmpleado(emp1);
        cosentino.addEmpleado(emp2);

        System.out.println(cosentino);

        //Compracion de los dos empleados
        System.out.println(emp1.equals(emp2));
    }
}
