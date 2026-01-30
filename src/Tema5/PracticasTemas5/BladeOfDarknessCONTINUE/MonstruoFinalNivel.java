package Tema5.PracticasTemas5.BladeOfDarknessCONTINUE;

public class MonstruoFinalNivel extends Monstruo {

    /**
     * Vamos a crear una nueva clase MonstruoFinalNivel, que herede de monstruo, añadirá como
     * propiedades:
     * <p>
     * golpeEspecial: serán los puntos de daño de un golpe especial que tiene este
     * monstruo.
     * <p>
     * usosGolpeEspecial: serán las veces que se ha usado el golpe especial.
     * Se iniciará con tres, y decrementará cada vez que se use el golpe especial.
     * Esta propiedad debe ser privada.
     * <p>
     * Debéis sobreescribir el método golpear para que use el golpe especial.
     */

    //Propiedades propias de este enemigoFinal
    private int golpeEspecial;
    private int usosGolpeEspecial = 3;

    //Constructor
    public MonstruoFinalNivel(String nombre, Clase clase, int puntosD, int golpeEspecial) {
        super(nombre, clase, puntosD);
        this.golpeEspecial = golpeEspecial;
    }

    //Getters solo porque setters no son necesarios
    public int getGolpeEspecial() {
        return golpeEspecial;
    }

    public int getUsosGolpeEspecial() {
        return usosGolpeEspecial;
    }

    //ToString()


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MonstruoFinalNivel{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", golpeEspecial=").append(golpeEspecial);
        sb.append(", usosGolpeEspecial=").append(usosGolpeEspecial);
        sb.append('}');
        return sb.toString();
    }

    //Metodo golpear editado para el monstruoFinal
    @Override
    public int golpear(Personaje personaje) {

        if (this.usosGolpeEspecial > 0) {
            this.usosGolpeEspecial--;
            personaje.reducirVida(this.golpeEspecial);
            System.out.println(this.nombre + " usa GOLPE ESPECIAL!!!");
            return this.golpeEspecial;
        }

        //Si se le acaban los golpes especiales tira de ataques normales como el monstruo normal
        return super.golpear(personaje);
    }
}

