package Tema3.TareasTema3.Ejercicios_3Cadenas;

public class Ejercicio22ComparacionDeString {

    static void main(String[] args) {
        /*
        "Esta tarde no voy"
        "esta tarde no VOY"
         */


        String cad1 = "Esta tarde no voy";
        String cad2 = "esta tarde no VOY";

        if(cad1.toLowerCase().equals(cad2.toLowerCase())){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

        //Ignora las mayusculas y minusculas simplemente lo compara ESTE ES EL MEJOR METODO
        if(cad1.equalsIgnoreCase(cad2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

    }
}
