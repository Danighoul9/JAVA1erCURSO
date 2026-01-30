package Tema6.PolimorfismoInterfaces;

public class Casa3D implements Renderizable{


    private int largo;
    private int ancho;
    private int alto;
    private double superficie;

    public Casa3D(int largo, int ancho, int alto, double superficie) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.superficie = superficie;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
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

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Casa3D{");
        sb.append("largo=").append(largo);
        sb.append(", ancho=").append(ancho);
        sb.append(", alto=").append(alto);
        sb.append(", superficie=").append(superficie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void render() {
        IO.println("Estoy renderizando una casa 3D con Autocad");
    }

    @Override
    public void update() {
        IO.println("Actualizando casa 3D");
    }

    @Override
    public void dispose() {
        IO.println("Liberando recursos de la casa 3D");
    }




}
