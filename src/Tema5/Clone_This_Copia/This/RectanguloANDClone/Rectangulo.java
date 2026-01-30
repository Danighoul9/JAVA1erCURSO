package Tema5.Clone_This_Copia.This.RectanguloANDClone;

public class Rectangulo implements Cloneable {

    //Propiedades
    private double ancho;
    private double alto;

    //Constructor

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }


    //Getters
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    //Setters
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }


    //ToString()


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangulo{");
        sb.append("ancho=").append(ancho);
        sb.append(", alto=").append(alto);
        sb.append('}');
        return sb.toString();
    }

    //Metodos propios
    public Rectangulo incrementarAncho(){
        ancho++;
        return this;
    }

    public Rectangulo incrementarAlto(){
        alto++;
        return this;
    }


    //Metodo de clonacion de objetos
    @Override
    public Rectangulo clone() {
        try {
            Rectangulo clone = (Rectangulo) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
