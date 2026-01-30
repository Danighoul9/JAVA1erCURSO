package Tema5.TareasTema5.GestorDeTareas;

public class ENUNCIADO{
/**
 * EJERCICIO: SISTEMA DE GESTIÓN DE TAREAS (TODO LIST)
 * Contexto
 * Vas a desarrollar un sistema de gestión de tareas similar a aplicaciones como Todoist, Microsoft To Do o Google Tasks. El sistema debe permitir crear diferentes tipos de tareas con distintas prioridades, gestionar su estado, y organizarlas de manera eficiente.
 *
 * PARTE 1: Estructura básica
 * 1.1. Enumerados
 * Crea los siguientes enumerados:
 *
 * EstadoTarea:
 *
 * PENDIENTE
 * EN_PROGRESO
 * COMPLETADA
 * CANCELADA
 * Prioridad:
 *
 * BAJA (valor 1)
 * MEDIA (valor 2)
 * ALTA (valor 3)
 * URGENTE (valor 4)
 * Cada prioridad debe tener un método getValor() que devuelva su valor numérico.
 *
 * 1.2. Interfaz Tarea
 * Crea una interfaz Tarea que defina los siguientes métodos:
 *
 * void ejecutar() - Marca la tarea como completada y muestra un mensaje
 * Prioridad obtenerPrioridad() - Devuelve la prioridad de la tarea
 * EstadoTarea obtenerEstado() - Devuelve el estado actual
 * String obtenerDescripcion() - Devuelve la descripción de la tarea
 * String obtenerTipo() - Devuelve el tipo de tarea (URGENTE, PROGRAMADA, RECURRENTE)
 * void mostrarDetalle() - Muestra toda la información de la tarea
 * 1.3. Clase abstracta TareaBase
 * Crea una clase abstracta TareaBase que implemente la interfaz Tarea y contenga:
 *
 * Atributos protegidos:
 *
 * id (int, generado automáticamente)
 * titulo (String)
 * descripcion (String)
 * prioridad (Prioridad)
 * estado (EstadoTarea)
 * fechaCreacion (LocalDate)
 * fechaCompletada (LocalDate)
 * Atributo estático:
 *
 * contadorId (para generar IDs únicos automáticamente)
 * Constructor:
 *
 * Inicializa los atributos comunes
 * Asigna un ID único
 * Establece el estado como PENDIENTE
 * Guarda la fecha de creación (LocalDate.now())
 * Métodos:
 *
 * Implementación de ejecutar() que cambie el estado a COMPLETADA y guarde la fecha
 * Getters y setters necesarios
 * cambiarEstado(EstadoTarea nuevoEstado) - Permite cambiar el estado
 * Implementación básica de mostrarDetalle() con la información común
 * 1.4. Clases concretas de tareas
 * TareaUrgente:
 *
 * Hereda de TareaBase
 * Atributo adicional: plazoHoras (int) - Tiempo límite en horas
 * Constructor: Recibe título, descripción y plazo en horas
 * Siempre tiene prioridad URGENTE (establecida automáticamente)
 * Método estaVencida() - Simula si el plazo ha expirado (puedes hacerlo si estado != COMPLETADA y plazoHoras < 24)
 * Sobrescribe mostrarDetalle() para incluir el plazo
 * Sobrescribe obtenerTipo() para devolver "URGENTE"
 * TareaProgramada:
 *
 * Hereda de TareaBase
 * Atributos adicionales:
 * fechaProgramada (LocalDate) - Fecha prevista para realizar la tarea
 * horaEstimada (LocalTime) - Horas estimadas para completarla
 * Constructor: Recibe título, descripción, prioridad, fecha programada y horas estimadas
 * Método obtenerDiasSemana() - Devuelve cuántos días faltan (puedes simularlo)
 * Sobrescribe mostrarDetalle() para incluir fecha programada y tiempo estimado
 * Sobrescribe obtenerTipo() para devolver "PROGRAMADA"
 * PARTE 2: Gestor de tareas
 * 2.1. Clase GestorTareas
 * Crea una clase que gestione todas las tareas:
 *
 * Atributos:
 *
 * tareas (ArrayList) - Lista principal de tareas
 * nombreUsuario (String) - Nombre del usuario del sistema
 * Métodos básicos:
 *
 * agregarTarea(Tarea tarea) - Añade una tarea a la lista
 * eliminarTarea(int id) - Elimina una tarea por su ID
 * buscarTarea(int id) - Busca y devuelve una tarea por ID
 * obtenerTodasLasTareas() - Devuelve la lista completa
 * Métodos de filtrado:
 *
 * obtenerTareasPorEstado(EstadoTarea estado) - Devuelve lista de tareas con ese estado
 * obtenerTareasPorPrioridad(Prioridad prioridad) - Devuelve lista de tareas con esa prioridad
 * obtenerTareasUrgentes() - Devuelve solo las tareas de tipo TareaUrgente
 * obtenerTareasPendientes() - Devuelve todas las tareas pendientes
 * Métodos de ordenación:
 *
 * ordenarPorPrioridad() - Ordena las tareas de mayor a menor prioridad (URGENTE → BAJA)
 * ordenarPorEstado() - Ordena: PENDIENTE, EN_PROGRESO, COMPLETADA, CANCELADA
 * Métodos de estadísticas:
 *
 * contarTareasPorEstado() - Muestra cuántas tareas hay en cada estado
 * obtenerPorcentajeCompletadas() - Calcula el % de tareas completadas
 * mostrarResumen() - Muestra un resumen general del sistema
 * Métodos de visualización:
 *
 * listarTareas() - Muestra todas las tareas con formato legible
 * listarTareasPendientes() - Muestra solo las pendientes ordenadas por prioridad
 * PARTE 3: Funcionalidades adicionales (Avanzado)
 * Subtareas:
 *
 * Añade a TareaBase un ArrayList<Tarea> de subtareas
 * Métodos: agregarSubtarea(Tarea subtarea), obtenerSubtareas()
 * Una tarea solo se considera completada si todas sus subtareas están completadas
 * Método obtenerProgreso() - Devuelve el % de subtareas completadas
 * PARTE 4: Programa principal (Main)
 * Crea una clase Main con el método main que demuestre el funcionamiento del sistema:
 *
 * Escenario 1: Crear tareas variadas
 *
 * 1. Crea un GestorTareas para el usuario "Juan Pérez"
 * 2. Añade al menos:
 *    - 2 TareasUrgentes con diferentes plazos
 *    - 3 TareasProgramadas con diferentes prioridades y fechas
 *    - 2 TareasRecurrentes (una diaria, una semanal)
 * Escenario 2: Gestión de estados
 *
 * 1. Muestra todas las tareas pendientes
 * 2. Completa algunas tareas usando ejecutar()
 * 3. Marca alguna tarea como EN_PROGRESO
 * 4. Cancela alguna tarea
 * 5. Muestra el resumen actualizado
 * Escenario 3: Ordenación y filtrado
 *
 * 1. Ordena las tareas por prioridad y muéstralas
 * 2. Filtra y muestra solo las tareas URGENTES
 * 3. Filtra y muestra solo las tareas COMPLETADAS
 * 4. Muestra las estadísticas del sistema
 */
}
