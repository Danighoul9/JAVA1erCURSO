# Ranking HyruleGame

1. Clase Jugador
- Atributos: id, nickname (String), puntos (int), nivel (int), pais (String)
- Constructor con id, nickname, pais. Puntos y nivel por defecto
- Constructor con todo
- Getters y setters
- toString
- Equals por id
- Implementar Comparable<Jugador> por puntuacion
- Avise un mensaje si el id está repetido (contains previo)

2. Clase Ranking
- Atributos: HashSet<Jugador> jugadores, TreeSet<Jugador> jugadoresOrdenados (puntuacion)
- Getters
- pintarJugadores
- pintarRanking
- registrarJugador(Jugador j)
- eliminarJugador(id)
- modificarPuntuacion(id, puntuacion): buscar el jugador y cambiar su puntuación (en los dos?)
- top(int n): devuelve el top n de jugadores

3. Clase Main
- Crear instancia de Ranking
- Registrar 7 jugadores
- Mostrar ranking
- Eliminar jugador
- Mostrar ranking
- Modificar puntuacion de un jugador (*, qué pasa en el TreeSet?)
- Mostrar ranking
- Mostrar top 3