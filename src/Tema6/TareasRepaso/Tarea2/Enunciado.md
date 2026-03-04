# Prueba Escrita – Programación Orientada a Objetos
## 1º DAW – Programación
# SISTEMA DE PLANES Y VOTACIONES

Tienes que implementar en Java un programa para gestionar una lista de planes propuestos
por un grupo de amigos (viajes, escapadas, conciertos, actividades…) y un sistema de
votaciones para decidir cuál se lleva a cabo.

> ⚠️ Queda prohibido copiar código de Internet o incluir código generado por una IA.

---

## 1. Enums (0.25 puntos)

Define los siguientes enumerados:

- `CategoriaPlan` : `VIAJE`, `CONCIERTO`, `DEPORTE`, `GASTRONOMIA`, `OTRO`
- `EstadoPlan` : `ABIERTO`, `CERRADO`, `CANCELADO`, `ELEGIDO`
- `TipoVoto` : `A_FAVOR`, `EN_CONTRA`, `ABSTENCION`

---

## 2. Clase Persona (abstracta) (0.5 puntos)

Crea la clase abstracta `Persona`:

**Atributos:**
- `String id` — generado automáticamente con `UUID.randomUUID().toString()`
- `String nombre`
- `String apellidos`
- `String email`

**Constructores:**
- Constructor vacío (genera `id` automáticamente)
- Constructor con todos los parámetros excepto `id`

**Métodos:**
- Getters y setters
- `toString()` mostrando todos los atributos
- Sobrescribir `equals()` y `hashCode()` basándose en `email`

---

## 3. Clase Participante (hereda de Persona) (0.5 puntos)

Implementa `Participante`, que extiende de `Persona`:

**Atributos adicionales:**
- `String alias` — nombre con el que aparece en el grupo
- `ArrayList<Voto> votosEmitidos` — se inicializa vacía

**Constructores:**
- Constructor con todos los parámetros (incluyendo los heredados)
- Constructor copia

**Métodos:**
- Getters y setters
- `void addVoto(Voto v)` : añade un voto a la lista
- `int getTotalVotosEmitidos()` : devuelve cuántos votos ha emitido
- `toString()` mostrando alias y número de votos emitidos

---

## 4. Clase Plan (abstracta) (1 punto)

Crea la clase abstracta `Plan`:

**Atributos:**
- `Long id` — generado automáticamente con un contador estático
- `String titulo`
- `String descripcion`
- `CategoriaPlan categoria`
- `LocalDate fechaPropuesta` — fecha en que se propuso el plan
- `LocalDate fechaRealizacion` — fecha prevista para realizarlo
- `double presupuestoEstimado`
- `EstadoPlan estado` — se inicializa a `ABIERTO` por defecto
- `Participante proponente` — quien propuso el plan

**Constructores:**
- Constructor que reciba todos los atributos excepto `id` y `estado`
- Validación: si `fechaRealizacion` es anterior a `fechaPropuesta`, lanzar `IllegalArgumentException`

**Métodos:**
- Getters y setters
- `toString()` con la información relevante
- Sobrescribir `equals()` y `hashCode()` basándose en `id`
- `int getDiasHastaRealizacion()` : días que quedan desde hoy hasta `fechaRealizacion` (puede ser negativo si ya pasó)
- Método abstracto: `String getResumenEconomico()` — devuelve un texto con el desglose económico del plan

---

## 5. Clase PlanEstandar (hereda de Plan) (0.5 puntos)

Implementa `PlanEstandar`, que extiende de `Plan`:

**Atributos adicionales:**
- `int numMaxParticipantes`
- `boolean incluyeAlojamiento`

**Constructores:**
- Constructor con todos los parámetros necesarios, llamando al padre

**Métodos:**
- Getters, setters y `toString()`
- Implementa `getResumenEconomico()`: devuelve un texto indicando el presupuesto total y el coste por persona
  (`presupuestoEstimado / numMaxParticipantes`). Si incluye alojamiento, añade la nota `"(alojamiento incluido)"`.

---

## 6. Clase PlanPremium (hereda de Plan) (0.5 puntos)

Implementa `PlanPremium`, que extiende de `Plan`:

**Atributos adicionales:**
- `String empresa` — empresa o servicio contratado
- `double suplementoPorPersona` — coste extra por participante

**Constructores:**
- Constructor con todos los parámetros necesarios, llamando al padre

**Métodos:**
- Getters, setters y `toString()`
- Implementa `getResumenEconomico()`: devuelve el presupuesto base más el suplemento por persona,
  indicando el nombre de la empresa. Coste total = `presupuestoEstimado + suplementoPorPersona`.

---

## 7. Interfaz Votable y Clase Voto (1.5 puntos)

Primero, crea la interfaz `Votable`:
- Método abstracto: `String getResultadoVotacion()` — devuelve un resumen del resultado actual

Luego, desarrolla la clase `Voto`:

**Atributos:**
- `Long id` — generado automáticamente con un contador estático
- `Participante participante`
- `Plan plan`
- `TipoVoto tipo`
- `LocalDate fechaVoto`
- `String comentario` — opcional, puede ser `null`

**Constructores:**
- Constructor que reciba todos los atributos
- Validación: un participante no puede votar con una fecha futura; lanzar `IllegalArgumentException` si ocurre

**Métodos:**
- Getters y setters
- `toString()` con participante, plan, tipo de voto y fecha

---

## 8. Clase GrupoPlanes (2.5 puntos)

Implementa la clase `GrupoPlanes`, que gestiona participantes, planes y votaciones:

**Atributos:**
- `String nombreGrupo`
- `ArrayList<Participante> participantes`
- `ArrayList<Plan> planes`
- `ArrayList<Voto> votos`

**Constructor:**
- Recibe el nombre del grupo e inicializa todas las colecciones vacías

**Métodos:**
- `void addParticipante(Participante p)` : añade un participante
- `void addPlan(Plan p)` : añade un plan
- `void listarPlanes()` : muestra todos los planes con su estado actual
- `void listarPlanesPorCategoria(CategoriaPlan cat)` : filtra y muestra los planes de esa categoría
- `Participante buscarParticipantePorEmail(String email)` : devuelve el participante o lanza `ParticipanteNoEncontradoException`
- `Plan buscarPlanPorId(Long id)` : devuelve el plan o lanza `PlanNoEncontradoException`
- `boolean registrarVoto(Long idPlan, String emailParticipante, TipoVoto tipo, String comentario)` :
  busca el plan y el participante, comprueba que el plan esté en estado `ABIERTO` y que el participante
  no haya votado ya ese plan. Si todo es correcto, crea el voto, lo añade a la lista y al historial
  del participante. Devuelve `true` si se realizó correctamente, `false` en caso de error (captura excepciones).
- `String getResultadoVotacion(Long idPlan)` : devuelve un resumen con el número de votos a favor,
  en contra y abstenciones para ese plan
- `Plan getPlanGanador()` : devuelve el plan `ABIERTO` con mayor número de votos `A_FAVOR`.
  Si hay empate, devuelve cualquiera de los empatados. Si no hay planes abiertos, devuelve `null`.
- `void cerrarVotacionYElegirGanador()` : llama a `getPlanGanador()`, cambia su estado a `ELEGIDO`
  y el resto de planes `ABIERTOS` pasan a `CERRADO`.
- `ArrayList<Voto> getVotosDeUnPlan(Long idPlan)` : devuelve todos los votos de un plan concreto

**Excepciones personalizadas:**
Crea `ParticipanteNoEncontradoException` y `PlanNoEncontradoException`, ambas extendiendo `Exception`,
con constructor que reciba un mensaje descriptivo.

---

## 9. Clase Principal (1.25 puntos)

Crea una clase `Principal` con el método `main`:

- Crea un objeto `GrupoPlanes`
- Añade al menos **4 participantes**
- Añade al menos **6 planes** (mezcla de `PlanEstandar` y `PlanPremium`)

Implementa un **menú interactivo** con `Scanner`:

```
1. Listar todos los planes
2. Listar planes por categoría
3. Votar un plan
4. Ver resultado de votación de un plan
5. Ver plan ganador actual
6. Cerrar votación y elegir ganador
7. Salir
```

- La opción **3** pide el ID del plan, el email del participante, el tipo de voto y un comentario opcional.
- La opción **4** pide el ID del plan y muestra el recuento de votos.
- La opción **6** confirma antes de ejecutar (pide "¿Estás seguro? S/N").
- El menú se repite hasta que el usuario elija salir.
- Incluye validaciones básicas de entrada.

---

## Evaluación

| Apartado                              | Puntos  |
|---------------------------------------|---------|
| 1. Enums                              | 0.25    |
| 2. Clase Persona (abstracta)          | 0.50    |
| 3. Clase Participante                 | 0.50    |
| 4. Clase Plan (abstracta)             | 1.00    |
| 5. Clase PlanEstandar                 | 0.50    |
| 6. Clase PlanPremium                  | 0.50    |
| 7. Interfaz Votable y Clase Voto      | 1.50    |
| 8. Clase GrupoPlanes                  | 2.50    |
| 9. Clase Principal                    | 1.25    |
| **TOTAL**                             | **8.50**|

---

## Entregables

1. **Código fuente**: Proyecto Java completo (archivos `.java`), preferiblemente en repositorio GitHub
2. **Fichero compilado**: JAR ejecutable
3. **Documentación Javadoc**: Generada para todas las clases

---

## Consejos y Buenas Prácticas

**Organización:** usa paquetes como `modelo`, `excepciones`, `interfaces`, `app`.

**Validaciones importantes:**
- La fecha de realización no puede ser anterior a la de propuesta
- No se puede votar un plan que no esté en estado `ABIERTO`
- Un participante solo puede emitir **un voto por plan**
- La fecha de voto no puede ser futura

**Manejo de excepciones:**
- Crea las excepciones personalizadas indicadas
- Usa `try-catch` en `registrarVoto` y en el menú principal

**Javadoc:**
- Documenta todas las clases con `/** ... */`
- Incluye `@param`, `@return` y `@throws` donde corresponda