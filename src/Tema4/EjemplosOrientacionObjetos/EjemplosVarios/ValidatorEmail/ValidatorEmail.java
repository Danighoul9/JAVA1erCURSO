package Tema4.EjemplosOrientacionObjetos.EjemplosVarios.ValidatorEmail;

public class ValidatorEmail {

    public static boolean isEmailValid(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean isPasswordValid(String password) {
        boolean hasNumber = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean moreThanTenChars = password.length() > 10;

        for(int i=0; i<password.length(); i++) {
            if(Character.isDigit(password.charAt(i))) {
                hasNumber = true;
            } else if(Character.isUpperCase(password.charAt(i))) {
                hasUppercase = true;
            } else if(Character.isLowerCase(password.charAt(i))) {
                hasLowercase = true;
            }
        }

        return hasNumber && hasUppercase && hasLowercase && moreThanTenChars;
    }
}
