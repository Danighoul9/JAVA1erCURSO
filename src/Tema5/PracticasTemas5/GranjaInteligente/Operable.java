package Tema5.PracticasTemas5.GranjaInteligente;

public interface Operable {
    int APAGADA = 0;
    int ENCENDIDA = 1;
    int MANTENIMIENTO = 2;
    void encender();
    void apagar();
    void ponerEnMantenimiento();
}
