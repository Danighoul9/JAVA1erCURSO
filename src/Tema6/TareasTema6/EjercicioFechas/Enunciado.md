# Práctica de Java: Gestión de Fechas y Tiempos

Vas a crear un programa para gestionar información sobre eventos de un centro de formación. El programa debe implementar las siguientes funcionalidades:

### Parte 1: Información básica del curso (LocalDate)

Crea una clase `Curso` con los siguientes atributos:
- Nombre del curso
- Fecha de inicio (`LocalDate`)
- Fecha de fin (`LocalDate`)

Implementa métodos para:
1. Calcular la duración del curso en días, meses y años usando `Period`
2. Comprobar si el curso está activo en una fecha determinada
3. Calcular cuántos días faltan para que comience el curso (si aún no ha empezado) o cuántos días han pasado desde que comenzó

### Parte 2: Gestión de horarios (LocalTime)

Crea una clase `Sesion` que represente una clase o sesión formativa con:
- Hora de inicio (`LocalTime`)
- Hora de fin (`LocalTime`)

Implementa métodos para:
1. Calcular la duración de la sesión usando `Duration` (en horas y minutos)
2. Comprobar si dos sesiones se solapan
3. Calcular el tiempo de descanso entre dos sesiones consecutivas

### Parte 3: Eventos completos (LocalDateTime)

Crea una clase `Examen` con:
- Nombre del examen
- Fecha y hora del examen (`LocalDateTime`)

Implementa métodos para:
1. Mostrar cuánto tiempo falta para el examen (días, horas y minutos)
2. Comprobar si el examen ha pasado
3. Calcular el tiempo transcurrido desde que se realizó el examen

### Parte 4: Programa principal

En la clase `Main`, crea:
- Un curso que dure desde el 1 de septiembre de 2025 hasta el 30 de junio de 2026
- Tres sesiones de clase: 9:00-11:00, 11:30-13:30, 15:00-17:00
- Dos exámenes: uno el 15 de diciembre de 2025 a las 10:00 y otro el 15 de junio de 2026 a las 16:00

Muestra por pantalla:
- Duración total del curso
- Duración de cada sesión
- Tiempo de descanso entre sesiones
- Tiempo que falta/ha pasado para cada examen

## Requisitos

- Utiliza `LocalDate.of()`, `LocalTime.of()` y `LocalDateTime.of()` para crear las fechas
- Usa `LocalDate.now()`, `LocalTime.now()` y `LocalDateTime.now()` cuando necesites la fecha/hora actual
- Utiliza `Period.between()` para calcular diferencias entre fechas
- Utiliza `Duration.between()` para calcular diferencias entre tiempos u horas
- Formatea las salidas de manera clara y legible

## Bonus (opcional)

- Implementa una función que determine si una fecha cae en fin de semana
- Añade un método que genere un calendario con todos los días lectivos del curso (de lunes a viernes)
