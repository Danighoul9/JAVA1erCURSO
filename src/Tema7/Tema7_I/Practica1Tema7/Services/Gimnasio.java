package Tema7.Tema7_I.Practica1Tema7.Services;

import Tema7.Tema7_I.Practica1Tema7.Entities.Actividad;
import Tema7.Tema7_I.Practica1Tema7.Entities.Reserva;
import Tema7.Tema7_I.Practica1Tema7.Entities.Socio;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "nombre")
public class Gimnasio {

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private HashMap<String, Socio> socios;
    private HashMap<String, Actividad> actividades;
    private TreeMap<Socio, HashSet<Reserva>> reservas;

    public Gimnasio(String nombre, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.socios = new  HashMap();
        this.actividades = new HashMap();
        this.reservas = new  TreeMap<>();
    }

    /**
     * Método	Descripción
     * addSocio(Socio s)	Añade un socio al mapa de socios.
     *
     * addActividad(Actividad a)	Añade una actividad al catálogo.
     *
     * reservarActividad(String dni, String codigoActividad) Crea una reserva solo si
     * el aforo no está completo y el socio no tiene ya una reserva activa para esa misma actividad.
     *
     * cancelarReserva(String dni, String codigoActividad)Elimina la reserva activa de ese
     * socio para esa actividad.
     *
     * getActividadesSocio(String dni) Devuelve un TreeSet<Actividad> con todas las actividades
     * reservadas por el socio, ordenadas por día y hora.
     *
     * getActividadesLlenas()Devuelve las actividades cuyo número de reservas activas
     * ha alcanzado el aforoMaximo.
     *
     * getRankingSocios()Devuelve una List<Socio> ordenada de mayor a menor número de reservas
     * totales realizadas. Usa un Comparator basado en el tamaño del HashSet de cada socio.
     *
     * getReservasOrdenadasPorFecha()Recorre el TreeMap con un for-each anidado para construir
     * una List<Reserva> con todas las reservas, y la ordena por fechaReserva ascendente
     * con Comparator.comparing(Reserva::getFechaReserva).
     *
     * getReservasOrdenadasPorActividad()Igual que el anterior, pero ordena por el nombre de la actividad
     * (alfabético) usando Comparator.comparing(r -> r.getActividad().getNombre()).
     *
     * getReservasOrdenadasPorSocioYFecha()Construye la lista con for-each anidado y la
     * ordena primero por apellidos del socio y luego por fecha de reserva descendente,
     * encadenando Comparator.comparing(...).thenComparing(...).
     *
     * getReservasOrdenadasPorDuracion()Construye la lista con for-each anidado y la ordena de mayor
     * a menor duración de la actividad usando Comparator.comparing(...).reversed().
     *
     * getReservasPendientesOrdenadasPorFecha()	Construye la lista con for-each anidado, descartando con un if las reservas no activas (estaActiva() == false), y ordena el resultado por fecha ascendente.
     */

    public void addSocio(Socio s){
        socios.put(s.getDni(), s);
    }

    public void addActividad(Actividad a){
        actividades.put(a.getNombre(), a);
    }

    /**
     *  reservarActividad(String dni, String codigoActividad) Crea una reserva solo si
     * el aforo no está completo y el socio no tiene ya una reserva activa para esa misma actividad.
     */

    public void reservarActividad(String dni, String codigoActividad){
        Socio s = socios.get(dni);
        Actividad a = actividades.get(codigoActividad);

        if(s == null || a == null){
            System.out.println("No existe el socio o la actividad");
            return;
        }


        // Comprobar si ya tiene esa actividad
        for(Reserva r : reservas.get(s)){
            if(r.getActividad().equals(a) && r.estaActiva()){
                System.out.println("Ya tiene reserva en esta actividad");
                return;
            }
        }

        // Crear reserva BIEN
        Reserva nueva = new Reserva(s, a, LocalDate.now(), false);


        System.out.println("OK");

    }




}
