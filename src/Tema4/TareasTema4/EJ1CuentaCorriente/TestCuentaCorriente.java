package Tema4.TareasTema4.EJ1CuentaCorriente;

public class TestCuentaCorriente {

    public static void main(String[] args) {
        CuentaCorriente cc1 = new CuentaCorriente();
        CuentaCorriente cc2 = new CuentaCorriente();

        cc1.ingresar(100.0);
        cc2.ingresar(1000.0);

        try {
            cc1.retirar(150.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            cc2.transferencia(cc1,500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(cc1);
        System.out.println(cc2);
    }
}
