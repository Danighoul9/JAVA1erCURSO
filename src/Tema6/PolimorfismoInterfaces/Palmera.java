package Tema6.PolimorfismoInterfaces;

public class Palmera implements Renderizable{

    private int ancho;
    private int alto;
    private String tipo;

    public Palmera(int ancho, int alto, String tipo) {
        this.ancho = ancho;
        this.alto = alto;
        this.tipo = tipo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Palmera{");
        sb.append("ancho=").append(ancho);
        sb.append(", alto=").append(alto);
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void render() {
        IO.println("Estoy renderizando una palmera en un videojuego");
    }

    @Override
    public void update() {
        IO.println("Actualizando palmera");
    }

    @Override
    public void dispose() {
        IO.println("Liberando recursos de la palmera");
    }

    @Override
    public void init() {
        IO.println("Inicializando objeto palmera ...");
    }

}
