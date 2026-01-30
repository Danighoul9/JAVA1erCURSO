package Tema1;

public class IVAEJEMPLOVARIABLE {
    public static void main(String[] args) {
        //Declara una variable de tipo double llamada precio
        //Asignale el valor 99,99
        //Pinta por pantalla el precio
        //Pinta por pantalla el precio con el IVA (21%)
      double precio = 0.0;
      precio = 99.99;
      double iva = 0.0;
      iva = precio * 0.21;
        System.out.println(precio);
        System.out.print(precio+iva);
    }
}
