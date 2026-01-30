package Tema1;

public class EjemploOperadoresLógicos {
    public static void main(String[] args) {

        int edadDaniel = 19;
        int edadMirian = 18;

        System.out.println((edadDaniel < 18) && (edadMirian < 18)); //Menores edad
        System.out.println((edadDaniel >= 18) && (edadMirian >= 18)); //Mayores edad

        String login = "Alumno03";
        String password ="DAWalumno26_1";

        boolean resultado;

        //Condiciones
        //1. login = "Alumno03" y password = "DAWalumno26_1"
        //2. login = "Alumno03" O password = "DAWalumno26_1"
        //3. login = "Alumno03" y password.length() < 8
        //4. ! (login != "Alumno03" y password.length() >=8

        resultado = (login == "Alumno02" && password == "DAWalumno26_1");
        System.out.println(resultado);

        resultado = (login == "Alumno02" || password == "DAWalumno26_1");
        System.out.println(resultado);

        // login != "Alumno03" es false --> porque es igual
        // password.length() < 8 es false --> porque password.length() = 9
        // false || false --> false

        resultado = (login != "Alumno02" || password.length() < 8);
        System.out.println(resultado);

        //! (login != "Alumno03" || password.length() >= 8)
        // login != "Alumno03" --> fasle
        // password.length() >= 8 --> true
        //false || true --> true
        // ! true --> false

        resultado = ! (login != "Alumno02" || password.length() >= 8);
        System.out.println(resultado);
    }
}
