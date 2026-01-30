package Tema5.TareasTema5.GestorDeTareas.Servicios;

import Tema5.TareasTema5.GestorDeTareas.Modelos.EstadoTarea;
import Tema5.TareasTema5.GestorDeTareas.Modelos.PrioridadTarea;
import Tema5.TareasTema5.GestorDeTareas.Modelos.Tarea;
import Tema5.TareasTema5.GestorDeTareas.Modelos.TareaBase;

import java.util.ArrayList;

public class GestorTareas {

    private String nombreUsuario;
    private ArrayList<Tarea> tareas;

    public GestorTareas(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.tareas = new ArrayList<>();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }


    //METODOS BÁSICOS
    /**
     * Añadir y eliminar tareas del ArraList
     * @param nuevaTarea
     */
    public void addTarea(Tarea nuevaTarea){
        tareas.add(nuevaTarea);
    }

    public void removeTarea(Tarea tarea){
        tareas.remove(tarea);
    }


    public Tarea buscarTarea(int id){
        for (Tarea tarea : tareas){
            //Casting para psar de tarea (interfaz Tarea) a TareaBase y poder llamar a getId
            if( ((TareaBase)tarea).getId().equals(id)){
                return tarea;
            }
        }
        return null;
    }

    public GestorTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    //METODOS DE FILTRADO


    /**
     * Devolver una lista con todas las tareas con un estado determinado
     * @param estado de la tarea
     * @return ArrayList<Tarea>
     */
     public ArrayList<Tarea> getTareasPorEstado(EstadoTarea estado){
         ArrayList<Tarea> lista = new ArrayList<>();
         for(Tarea tarea : tareas) {
             if ( tarea.getEstado().equals(estado) ) {
                 //Añadir a la nueva lista si la tarea tiene el estado deseado
                 lista.add(tarea);
             }
         }
         return lista;
     }


    /**
     * Devolver una lista con todas las tareas con una prioridad determinado
     * @param prioridad de la tarea
     * @return ArrayList<Tarea>
     */
     public ArrayList<Tarea> getTareasPorPrioridad(PrioridadTarea prioridad){
         ArrayList<Tarea> lista = new ArrayList<>();
         for(Tarea tarea : tareas) {
             if ( tarea.getPrioridad().equals(prioridad) ) {
                 lista.add(tarea);
             }
         }
         return lista;
     }

    /**
     * Devolver una lista con todas las tareas con una prioridad URGENTE
     * @param "URGENTE" de la tarea
     * @return ArrayList<Tarea>
     */
     public ArrayList<Tarea> getTareasUrgentes(){
         ArrayList<Tarea> lista = new ArrayList<>();
         for(Tarea tarea : tareas) {
             if ( tarea.getTipo().equals("URGENTE") ) {
                 lista.add(tarea);
             }
         }
         return lista;
     }

    /**
     * Devolver una lista con todas las tareas con una prioridad PENDIENTE
     * @param "PENDIENTE" de la tarea
     * @return ArrayList<Tarea>
     */
    public ArrayList<Tarea> getTareasPendientes(){
        return getTareasPorEstado(EstadoTarea.PENDIENTE);
    }

    /**
     * Mostramos en formato legible todas las tareas del usuario
     */
    public void listarTareas(){
        IO.println("Tareas del usuario: " + nombreUsuario);
        for(Tarea tarea : tareas){
            IO.println(tarea);
        }
    }

    /**
     * Mostramos en formato legible todas las tareasPendientes del usuario
     */
    public void listarTareasPendientes(){
        IO.println("Tareas del usuario: " + nombreUsuario);
        for(Tarea tarea : getTareasPendientes()){
            IO.println(tarea);
        }
    }




}
