# 🏋️ Práctica – Gestión de un Gimnasio

**Módulo:** Programación  
**Ciclo:** CFGS Desarrollo de Aplicaciones Web – 1º curso  
**Tema:** Colecciones: Lists, Sets y Maps. Ordenación con Comparable y Comparator.

---

## Contexto

Vamos a diseñar una aplicación para gestionar los socios, actividades y reservas de un gimnasio. A lo largo del ejercicio trabajaremos con `HashMap`, `HashSet`, `TreeSet` y `TreeMap`, además de ordenación mediante las interfaces `Comparable` y `Comparator`, y el uso de enumerados y la API de fechas/horas de Java (`LocalDate`, `LocalTime`).

---

## Clases a implementar

### `Socio`

- **Atributos:** `dni`, `nombre`, `apellidos`, `email`, `telefono`, `fechaAlta` (LocalDate), `cuota` (enum: `BASICA`, `PREMIUM`, `FAMILIAR`).
- Constructor, getters, setters, `toString()`, `equals(dni)`, `hashCode(dni)`.
- Implementa `Comparable<Socio>` ordenando **por apellidos y nombre** (orden alfabético).

---

### `Actividad`

- **Atributos:** `codigo`, `nombre`, `descripcion`, `diaSemana` (enum: `LUNES`…`DOMINGO`), `horaInicio` (LocalTime), `duracionMinutos` (int), `aforoMaximo` (int), `monitor` (String).
- Constructor, getters, setters, `toString()`, `equals(codigo)`, `hashCode(codigo)`.
- Implementa `Comparable<Actividad>` ordenando **por `diaSemana` y `horaInicio`**.

---

### `Reserva`

- **Atributos:** `Socio socio`, `Actividad actividad`, `fechaReserva` (LocalDate), `asistio` (boolean, por defecto `false`).
- Constructor, getters, setters, `toString()`, `equals(socio, actividad, fechaReserva)`.
- **Métodos extra:**
  - `confirmarAsistencia()` → establece `asistio = true`.
  - `estaActiva()` → devuelve `true` si `fechaReserva` es posterior o igual a la fecha actual.

---

### `Gimnasio`

- **Atributos:**
  - `String nombre, direccion, telefono, email`
  - `HashMap<String, Socio> socios` → almacena socios indexados por DNI.
  - `HashMap<String, Actividad> actividades` → almacena actividades indexadas por código.
  - `TreeMap<Socio, HashSet<Reserva>> reservas` → reservas agrupadas por socio (los socios se ordenan por su orden natural: apellidos y nombre).

- Constructor, getters, `toString()`, `equals(nombre)`.

- **Métodos extra:**

  | Método | Descripción |
  |---|---|
  | `addSocio(Socio s)` | Añade un socio al mapa de socios. |
  | `addActividad(Actividad a)` | Añade una actividad al catálogo. |
  | `reservarActividad(String dni, String codigoActividad)` | Crea una reserva **solo si** el aforo no está completo y el socio no tiene ya una reserva activa para esa misma actividad. |
  | `cancelarReserva(String dni, String codigoActividad)` | Elimina la reserva activa de ese socio para esa actividad. |
  | `getActividadesSocio(String dni)` | Devuelve un `TreeSet<Actividad>` con todas las actividades reservadas por el socio, ordenadas por día y hora. |
  | `getActividadesLlenas()` | Devuelve las actividades cuyo número de reservas activas ha alcanzado el `aforoMaximo`. |
  | `getRankingSocios()` | Devuelve una `List<Socio>` ordenada de **mayor a menor** número de reservas totales realizadas. Usa un `Comparator` basado en el tamaño del `HashSet` de cada socio. |
  | `getReservasOrdenadasPorFecha()` | Recorre el `TreeMap` con un `for-each` anidado para construir una `List<Reserva>` con todas las reservas, y la ordena por `fechaReserva` ascendente con `Comparator.comparing(Reserva::getFechaReserva)`. |
  | `getReservasOrdenadasPorActividad()` | Igual que el anterior, pero ordena por el **nombre de la actividad** (alfabético) usando `Comparator.comparing(r -> r.getActividad().getNombre())`. |
  | `getReservasOrdenadasPorSocioYFecha()` | Construye la lista con `for-each` anidado y la ordena primero por **apellidos del socio** y luego por **fecha de reserva** descendente, encadenando `Comparator.comparing(...).thenComparing(...)`. |
  | `getReservasOrdenadasPorDuracion()` | Construye la lista con `for-each` anidado y la ordena de **mayor a menor duración** de la actividad usando `Comparator.comparing(...).reversed()`. |
  | `getReservasPendientesOrdenadasPorFecha()` | Construye la lista con `for-each` anidado, descartando con un `if` las reservas no activas (`estaActiva() == false`), y ordena el resultado por fecha ascendente. |

---

## Prueba en el `main`

Crea una clase `Main` con un método `main` que realice las siguientes acciones:

1. Crea el gimnasio **"FitZone Murcia"** con su dirección, teléfono y email.
2. Añade **6 socios** con distintos tipos de cuota (`BASICA`, `PREMIUM`, `FAMILIAR`).
3. Añade **8 actividades** variadas con distintos días, horas y aforos. Incluye alguna actividad con aforo reducido (2 o 3 plazas) para poder probar la restricción de aforo.

   Ejemplos de actividades:
   - Yoga – Lunes 09:00 – Aforo: 3
   - Spinning – Martes 18:00 – Aforo: 10
   - Pilates – Miércoles 10:00 – Aforo: 2
   - CrossFit – Jueves 19:00 – Aforo: 8
   - Zumba – Viernes 17:30 – Aforo: 15
   - Natación – Sábado 10:00 – Aforo: 6
   - Boxeo – Lunes 20:00 – Aforo: 3
   - Meditación – Domingo 11:00 – Aforo: 12

4. Realiza reservas de actividades para los distintos socios. Intenta reservar una actividad llena para que salte la restricción de aforo y se muestre un mensaje informativo.
5. Confirma la asistencia de al menos dos reservas usando `confirmarAsistencia()`.
6. Cancela alguna reserva con `cancelarReserva()`.
7. Llama a `getActividadesSocio(dni)` de uno de los socios y muestra su agenda semanal de actividades ordenada por día y hora.
8. Llama a `getActividadesLlenas()` y muestra las actividades que han completado su aforo.
9. Muestra el **ranking de socios** por número de reservas usando `getRankingSocios()`.
10. Muestra **todas las reservas ordenadas por fecha** ascendente con `getReservasOrdenadasPorFecha()`.
11. Muestra las reservas ordenadas **por nombre de actividad** con `getReservasOrdenadasPorActividad()`.
12. Muestra las reservas ordenadas **por apellido del socio y luego por fecha descendente** con `getReservasOrdenadasPorSocioYFecha()`.
13. Muestra las reservas ordenadas de **mayor a menor duración** de la actividad con `getReservasOrdenadasPorDuracion()`.
14. Muestra solo las **reservas activas (futuras) ordenadas por fecha** con `getReservasPendientesOrdenadasPorFecha()`.

---

## Conceptos que se trabajan

| Concepto | Dónde aparece en el ejercicio |
|---|---|
| `HashMap` | Catálogo de socios y actividades |
| `HashSet` | Conjunto de reservas por socio (sin duplicados) |
| `TreeMap` | Reservas agrupadas y ordenadas por socio |
| `TreeSet` | Agenda semanal del socio ordenada |
| `Comparable<T>` | Orden natural de `Socio` (apellidos/nombre) y `Actividad` (día/hora) |
| `Comparator<T>` | Ranking de socios por número de reservas (orden descendente) |
| `Comparator.comparing()` | Ordenar reservas por fecha o nombre de actividad |
| `Comparator.comparing().thenComparing()` | Ordenación compuesta: apellido del socio + fecha |
| `Comparator.comparing().reversed()` | Ordenación inversa: mayor a menor duración |
| `for-each` anidado sobre `TreeMap` | Construir la lista plana de todas las reservas sin streams |
| Enumerados (`enum`) | `TipoCuota`, `DiaSemana` |
| `LocalDate` / `LocalTime` | Fechas de alta y reserva, hora de inicio de actividad |
| Lógica de negocio | Control de aforo, reservas duplicadas, reservas activas |

---

## Notas y consejos

- Recuerda que para usar `Socio` como clave en un `TreeMap`, la clase **debe implementar `Comparable`** (o proporcionar un `Comparator` al constructor del `TreeMap`). Lo mismo aplica a `Actividad` para poder añadirla a un `TreeSet`.

- El método `equals` y `hashCode` de `Reserva` deben tener en cuenta `socio`, `actividad` y `fechaReserva` juntos para evitar duplicados en el `HashSet`.

- Para el ranking (`getRankingSocios()`), obtén todas las entradas del `TreeMap` con `entrySet()` y ordénalas con un `Comparator` basado en el tamaño del `HashSet` de cada socio.

- Usa `LocalDate.now()` en `estaActiva()` para comparar si la reserva es futura o pasada.

- Para los métodos de ordenación necesitas primero construir una `List<Reserva>` plana con todas las reservas del gimnasio. Recorre el `TreeMap` con un `for-each` anidado:

  ```java
  List<Reserva> todasLasReservas = new ArrayList<>();
  for (HashSet<Reserva> conjuntoReservas : reservas.values()) {
      for (Reserva r : conjuntoReservas) {
          todasLasReservas.add(r);
      }
  }
  ```

- Una vez tienes la lista, puedes ordenarla de dos formas equivalentes — elige la que te resulte más clara:

  ```java
  // Opción A: Collections.sort()
  Collections.sort(todasLasReservas, Comparator.comparing(Reserva::getFechaReserva));

  // Opción B: lista.sort()
  todasLasReservas.sort(Comparator.comparing(Reserva::getFechaReserva));
  ```

- `Comparator.comparing()` acepta una **referencia a método** (cuando el getter está directamente en `Reserva`) o una **lambda** (cuando hay que navegar por objetos relacionados):

  ```java
  // Referencia a método
  Comparator.comparing(Reserva::getFechaReserva)

  // Lambda
  Comparator.comparing(r -> r.getActividad().getNombre())
  ```

- Para ordenaciones compuestas encadena `.thenComparing()`. Si dos reservas empatan en el primer criterio, se aplica el segundo:

  ```java
  Comparator.comparing((Reserva r) -> r.getSocio().getApellidos())
            .thenComparing(Reserva::getFechaReserva)
  ```

- Para invertir el orden añade `.reversed()` al final del `Comparator`:

  ```java
  Comparator.comparing((Reserva r) -> r.getActividad().getDuracionMinutos()).reversed()
  ```

- Para `getReservasPendientesOrdenadasPorFecha()`, filtra las reservas activas con un `if` dentro del bucle en lugar de añadirlas todas:

  ```java
  List<Reserva> reservasPendientes = new ArrayList<>();
  for (HashSet<Reserva> conjuntoReservas : reservas.values()) {
      for (Reserva r : conjuntoReservas) {
          if (r.estaActiva()) {
              reservasPendientes.add(r);
          }
      }
  }
  reservasPendientes.sort(Comparator.comparing(Reserva::getFechaReserva));
  ```

---

*Mucha suerte y a por ello — ¡que los socios no se queden sin plaza! 💪*
