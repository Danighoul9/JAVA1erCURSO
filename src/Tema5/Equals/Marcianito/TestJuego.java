package Tema5.Equals.Marcianito;

public class TestJuego {
    static void main(String[] args) {
        Juego game1 = new Juego("Arkanoid");

        Marcianito m1 = new Marcianito("M_Level_1", "rojo", 1);
        Marcianito m2 = new Marcianito(m1);
        Marcianito m3 = new Marcianito(m1);
        Marcianito m4 = new Marcianito(m1);
        Marcianito m5 = new Marcianito(m1);

        Marcianito m6 = new Marcianito("M_Level_2", "azul", 2);
        Marcianito m7 = new Marcianito(m6);
        Marcianito m8 = new Marcianito(m6);

        game1.addEnemigo(m1);
        game1.addEnemigo(m2);
        game1.addEnemigo(m3);
        game1.addEnemigo(m4);
        game1.addEnemigo(m5);
        game1.addEnemigo(m6);
        game1.addEnemigo(m7);
        game1.addEnemigo(m8);

        System.out.println(game1);

        game1.removeEnemigo(m4);

        System.out.println(game1);

    }

}

