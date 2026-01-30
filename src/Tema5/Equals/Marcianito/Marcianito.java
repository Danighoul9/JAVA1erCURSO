package Tema5.Equals.Marcianito;

import java.util.Objects;

public class Marcianito {
    //PROPIEDADES
    private String nombre;
    private String color;
    private Integer golpes;

    //CONSTRUCTOR PARAMETRIZADO
    public Marcianito(String nombre, String color, Integer golpes) {
        this.nombre = nombre;
        this.color = color;
        this.golpes = golpes;
    }

    //CONSTRUCTOR COPIA
    public Marcianito(Marcianito otro) {
        this.nombre = otro.nombre;
        this.color = otro.color;
        this.golpes = otro.golpes;
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getGolpes() {
        return golpes;
    }

    public void setGolpes(Integer golpes) {
        this.golpes = golpes;
    }

    //TOSTRING
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Marcianito{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", golpes=").append(golpes);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Marcianito that = (Marcianito) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(color, that.color) && Objects.equals(golpes, that.golpes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, color, golpes);
    }
    
}
