package Tema5.Clone_This_Copia.ConstructorCopia;

public class TestEmpleado {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Manuel", "García Minguillán",
                33, 2200.0,"mgin@cosentino.es", "656555889",
                Empleado.Departamento.TI);

        System.out.println(emp1);

        //Creación de un objeto nuevo llamando al constructor copia
        Empleado emp2 = new Empleado(emp1);
        emp2.setNombre("Empleado2");

        System.out.println(emp2);
        System.out.println(emp1);

        System.out.println(emp1.equals(emp2));

        Empleado emp3 = emp1;
        System.out.println(emp1.equals(emp3));



    }
}
