package Tema4.EjemplosOrientacionObjetos.EjemplosVarios.ValidatorEmail;

public class TestValidatorEmail {
    static void main(String[] args) {
        System.out.println(ValidatorEmail.isEmailValid("pepe@gmail"));
        System.out.println(ValidatorEmail.isEmailValid("pepe@gmail.com"));
        System.out.println(ValidatorEmail.isEmailValid("pepeagmail.com"));

        System.out.println(ValidatorEmail.isPasswordValid("123456"));
        System.out.println(ValidatorEmail.isPasswordValid("JAROSO77"));
        System.out.println(ValidatorEmail.isPasswordValid("Jaroso2026"));
        System.out.println(ValidatorEmail.isPasswordValid("IESJaroso2026"));
    }
}


