package Tema4.EjemplosOrientacionObjetos.EjemplosVarios.Personaje;

public class Personaje {

    /**
     * 1. Crea un clase Personaje
     * 2. Debe tener las siguientes propiedades (privadas):
     * - nombre: String
     * - clase: String
     * - salud: int o Integer
     * - mana: int o Integer
     * 3. Crea un constructor que inicialice todas las propiedades
     * 4. Crea los métodos getters y setters para todas las propiedades*
     * 5. Crea el toString para que pinte todas las propiedades (StringBuffer)
     * 6. Crea un método void quitarSalud(int vida) que reste esa vida a la del personaje
     * 7. Crea un método void revivir() que ponga la vida a 100.
     * 8. Luego en el main de esta clase crea dos personajes diferentes pers1 y pers2
     * 9. Quítale vida a uno de ellos
     * 10. Pinta los dos personajes
     *
     */
    /**
     * * Extra:
     * - Cuando el personaje ataque que quite vida en función del nivel
     * Por ejemplo: damage * (1 + nivel * 0.15)
     * Ojo, hay que pasar double a integer
     * - Cuando la vida de un personaje llegue a 0, mostrar mensaje de muerto
     * - Subir nivel:
     * a) Cambiamos MAX_SALUD a 200
     * b) Al crear un personaje le ponemos de vida MAX_SALUD / 4
     * c) Hacemos un método void subirNivel() que le sume uno al nivel
     * y sumo 20 de salud al personaje, sin exceder MAX_SALUD
     */


    /**
     * Propiedades clase
     */
    private static final int MAX_SALUD =200;
    private int SALUD_INICIAL = MAX_SALUD/4;

    /**
     * Propiedades o datos del personaje
     */
    private String nombre;
    private String clase;
    private Integer salud;
    private Integer mana;
    private Integer damage;
    private Integer level;

    /**
     * Construtor del PJ
     */
    public Personaje(String nombre, String clase, Integer mana, Integer level, Integer damage) {
        this.nombre = nombre;
        this.clase = clase;
        this.salud = SALUD_INICIAL;
        this.mana = mana;
        this.level = level;
        this.damage = damage;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //GETTERS PARA CADA UNA DE LAS PROPIEDADES DEL PJ
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public String getClase() {
        return clase;
    }

    public Integer getMana() {
        return mana;
    }

    public Integer getDamage() {
        return damage;
    }

    public Integer getLevel() {
        return level;
    }

    //SETTERS PARA CADA UNA DE LAS PROPIEDADES DEL PJ
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    //5.
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", salud=").append(salud);
        sb.append(", mana=").append(mana);
        sb.append(", damage=").append(damage);
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }


    //6.Quitar salud
    public void quitarSalud(int vida){
        this.salud -= vida;
        if(this.salud <= 0){
            this.salud = 0;
        }
    }

    //7.Revivir al PJ
    public void revivir(){
        if(this.salud <= 0){
            salud = SALUD_INICIAL;
        }
    }

    //EXTRAS
    //Funcion de atacar
    public int atacar(Personaje enemigo){
        int danioFinal = (int) Math.round(this.damage * (1 + level * 0.15)); //Uso Math.round() para redondear al alza.
        enemigo.quitarSalud(danioFinal);
        return danioFinal;
    }

    //Funcion de subir niveles
    public void subirNivel(){
        this.level++;
        SALUD_INICIAL += 20;
        if (SALUD_INICIAL > MAX_SALUD) {
            SALUD_INICIAL = MAX_SALUD;
        }
    }


}
