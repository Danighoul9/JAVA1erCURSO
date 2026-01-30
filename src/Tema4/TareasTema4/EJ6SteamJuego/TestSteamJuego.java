package Tema4.TareasTema4.EJ6SteamJuego;

public class TestSteamJuego {


    static void main(String[] args) {
        SteamJuego valorant = new SteamJuego("Valorant","Shooter online", 4500000,
                456,0.0,3);

        SteamJuego csgo = new SteamJuego("CsGo","Shooter online", 1500000,
                236,0.0,4);

        SteamJuego ark = new SteamJuego("Ark Survival: Evolved","RPG Online", 1000000,
                126,45.99,2);

        System.out.println(valorant);
        System.out.println(csgo);
        System.out.println(ark);

        valorant.setMediaJugadoresDiarios(6000000);
        valorant.setMediaJugadoresDiarios(8000000);
        System.out.println(valorant);

    }






}
