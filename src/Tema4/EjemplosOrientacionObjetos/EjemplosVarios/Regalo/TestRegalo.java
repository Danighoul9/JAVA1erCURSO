package  Tema4.EjemplosOrientacionObjetos.EjemplosVarios.Regalo;

public class TestRegalo {
    static void main(String[] args) {

        Regalo regalo1 = new Regalo("PS5",CategoriaRegalo.Tecnología,569.99);
        Regalo regalo2 = new Regalo("Sudadera Adidas",CategoriaRegalo.Ropa,45.99);

        //mostramos el regalo en su forma base
        System.out.println(regalo1);
        //bajamos el precio con el setter
        regalo1.setPrecio(499.99);
        //modificamos el precion añadiendole el iva correspondiente
        regalo1.aplicarIva(21.0);
        //mostramos de nuevo el regalo con los cambios realizados
        System.out.println(regalo1);




    }
}
