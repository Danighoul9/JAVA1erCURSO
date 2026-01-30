package Tema4.EjemplosOrientacionObjetos.EjemplosVarios.ConversorDeDivisas;

public class ConversorMoneda {

    //Cambio euro - dolar
    //Cambio euro - yuan
    //Cambio euro - libra

    static final double CAMBIO_EURO_DOLAR = 1.17;
    static final double CAMBIO_EURO_YUAN = 8.16;
    static final double CAMBIO_EURO_LIBRA = 0.87;

    public static double conversorEuroToDolar(double cantidad){
        return cantidad * CAMBIO_EURO_DOLAR;
    }

    public static double conversorEuroToYuan(double cantidad){
        return cantidad * CAMBIO_EURO_YUAN;
    }

    public static double conversorEuroToLibra(double cantidad){
        return cantidad * CAMBIO_EURO_LIBRA;
    }


    //AHORA AL REVÉS

    public static double conversoDolarToEuro(double cantidad){
        return cantidad / CAMBIO_EURO_DOLAR;
    }

    public static double conversorYuanToEuro(double cantidad){
        return cantidad / CAMBIO_EURO_YUAN;
    }

    public static double conversorLibraToEuro(double cantidad){
        return cantidad / CAMBIO_EURO_LIBRA;
    }




}
