package Tema5.TareasTema5.PersonaIMC;

import java.util.ArrayList;

public class PersonaTest {
    static void main(String[] args) {
        //String nombre, Integer edad, String dni, SexoPersona sexo, Double peso, Double altura
        Persona per1 = new Persona("Manuel Pérez", 17, "34343321A",
                Persona.SexoPersona.M, 80.0, 1.80);
        Persona per2 = new Persona("Silvia García", 25, "11134332A",
                Persona.SexoPersona.H, 52.0, 1.71);

        Persona per3 = new Persona(per1);
        per3.setNombre("Julio Romero");
        per3.setPeso(95.0);

        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(per1);
        personas.add(per2);
        personas.add(per3);

        for (Persona p : personas) {
            if (p.esMayorEdad())
                System.out.print("Nombre: " + p.getNombre() + " es mayor de edad");
            else
                System.out.print("Nombre: " + p.getNombre() + " es menor de edad");
            switch (p.calcularIMC()) {
                case 0:
                    System.out.println(" - IMC: Bajo");
                    break;
                case 1:
                    System.out.println(" - IMC: Normal");
                    break;
                case -1:
                    System.out.println(" - IMC: Alto");
                    break;
            }
        }
    }
}
