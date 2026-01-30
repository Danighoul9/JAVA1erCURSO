package Tema6.PolimorfismoInterfaces;

public interface Renderizable {
    void render();
    void update();
    void dispose();

    default  void init(){
        IO.println("Iniciando renderizado...");
    }
}
