package Tema7.Tema7_I.EjemploPunto;

import java.util.Objects;

public class Punto<T extends Number, S extends Number> {

    private T x;
    private S y;

    public Punto(T x, S y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public S getY() {
        return y;
    }

    public void setY(S y) {
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Punto{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Punto<?, ?> punto = (Punto<?, ?>) o;
        return Objects.equals(x, punto.x) && Objects.equals(y, punto.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /**
     * Distancia entre dos puntos (euclidiana)
     * RaízCuadrada( (x1-x2)2 + (y1-y2)2 )
     * @param otroPunto
     * @return
     */
    public double distancia(Punto<?, ?> otroPunto) {
        return Math.sqrt(Math.pow(x.doubleValue() - otroPunto.getX().doubleValue(), 2) + Math.pow(y.doubleValue() - otroPunto.getY().doubleValue(), 2));
    }


}