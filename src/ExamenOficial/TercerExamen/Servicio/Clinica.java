package ExamenOficial.TercerExamen.TercerExamen.Servicio;

import ExamenOficial.TercerExamen.TercerExamen.Entidades.Animal;
import ExamenOficial.TercerExamen.TercerExamen.Entidades.Consulta;
import ExamenOficial.TercerExamen.TercerExamen.Entidades.Propietario;
import ExamenOficial.TercerExamen.TercerExamen.Entidades.TipoConsulta;
import java.time.LocalDate;
import java.util.ArrayList;

public class Clinica {

     private String nombre;
     private ArrayList<Propietario> propietarios;
     private ArrayList<Animal> animales;
     private ArrayList<Consulta> consultas;

    public Clinica(String nombre) {
        this.nombre = nombre;
        this.propietarios = new ArrayList<>();
        this.animales = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }


    //Metodos propios

    /**
     * Añade un propietario a la clínica
     * @param p
     */
    public void addPropietario(Propietario p){
        if (p != null){
            propietarios.add(p);
        }
    }

    /**
     * Añade un animal a la clínica
     * @param a
     */
    public void addAnimal(Animal a){
        if (a != null){
            animales.add(a);
        }
    }

    /**
     * Muestra todos los animales registrados con su estado actual
     */
    public void listarAnimales(){
        for (Animal a : animales){
            IO.println("| Id -> " + a.getId() + "| Nombre -> " + a.getNombre() +
                      " | Estado actual -> " +  a.getEstado());

        }
    }

    /**
     * Muestra todas las consultas cuya fecha sea la de hoy
     */
    public void listarConsultasDeHoy(){
        for (Consulta c : consultas){
            if (c.getFecha().equals(LocalDate.now())){
                IO.println(c);
            }
        }
    }

    /**
     * Busca y devuelve el propietario con ese DNI.
     * Si no existe, lanza una excepción personalizada PropietarioNoEncontradoException
     * @param dni
     * @return
     */
    public Propietario buscarPropietarioPorDni(String dni) throws PropietarioNoEncontradoException {
        for (Propietario p : propietarios){
            if (p.getDni().equals(dni)){
                return p;
            }
        } throw new PropietarioNoEncontradoException(dni);
    }

    /**
     * Animal buscarAnimalPorId(Long id) : busca y devuelve el animal con ese id. Si no existe,
     * lanza AnimalNoEncontradoException
     * @param id
     * @return
     * @throws AnimalNoEncontradoException
     */
    public Animal buscarAnimalPorId(Long id) throws AnimalNoEncontradoException {
        for (Animal a : animales){
            if (a.getId().equals(id)){
                return a;
            }
        } throw new AnimalNoEncontradoException(id);
    }

    /**
     * Busca el animal por id (usando buscarAnimalPorId ),
     * crea la consulta y la añade a la lista.
     * Devuelve true si se realizó correctamente.
     * Captura las excepciones necesarias y devuelve false en caso de error.
     */

    public boolean registrarConsulta(Long idAnimal, String veterinario, LocalDate fecha,
                                     TipoConsulta tipo, String diagnostico, String tratamiento){
        boolean regristrada= false;
        if (fecha.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("ERROR: La fecha no puede ser posterior al dia de hoy.");
        }
        if (idAnimal != null && !fecha.isAfter(LocalDate.now())){
            Animal a = buscarAnimalPorId(idAnimal);
            Consulta c = new Consulta(a,veterinario,fecha,tipo,diagnostico,tratamiento);
            regristrada= true;
        }
        return regristrada;
    }




    /**
     *  ArrayList<Consulta> buscarConsultasPorAnimal(Long idAnimal) : devuelve todas las
     *  consultas de un animal
     * @param idAnimal
     * @return
     */
    public ArrayList<Consulta> buscarConsultasPorAnimal(Long idAnimal){
        for (Consulta c : consultas){
            if (c.getAnimal().getId().equals(idAnimal)){
                IO.println(c.generarFactura());
            }
        }
        return null;
    }

    /**
     * ArrayList<Consulta> buscarConsultasPorTipo(TipoConsulta tipo) : devuelve todas las
     * consultas del tipo indicado
     * @param tipo
     * @return
     */
    public ArrayList<Consulta> buscarConsultasPorTipo(TipoConsulta tipo){
        for (Consulta c : consultas){
            if (c.getTipo().equals(tipo)){
                IO.println(c);
            }
        }
        return null;
    }


    /**
     * Devuelve la suma de precioTotal de todas las consultas registradas
     * @return
     */
    public double calcularIngresosTotales(){
        double precioTotalConsultas = 0;
        for (Consulta c : consultas){
            precioTotalConsultas += c.getPrecioTotal();
        }
        return precioTotalConsultas;
    }
}
