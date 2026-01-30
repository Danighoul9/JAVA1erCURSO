package Tema5.Equals.EjemploEquals;

public class TestProducto {
    static void main(String[] args) {

        Producto p1 = new Producto("PS5", 599.99,"Tecnologia");

        //Copio el objeto con el constructor copia, recordad un nuevo objeto
        Producto p2 = new Producto(p1);

        System.out.println(p1.equals(p2));

        p2.setNombre("PC"); //Al cambiarle el nombr ya no tiene el mismo valor en el nombre por lo tanto dara False
        System.out.println(p1.equals(p2));

        /**
         * RESUMEN:
         * -equals de object: compara solo referencias, que sean el mismo objeto
         * -equals sobreescrito: compara que las propiedades de los objetos tengan los mimso valores
         */

    }
}
