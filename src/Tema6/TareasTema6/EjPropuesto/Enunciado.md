# Sistema de notificaciones

## Interfaz - Notificable 
- void enviar();

## Clase base - Notificacion implements Notificable
- Atributos: titulo, mensaje, usuario, fecha (LocalDateTime), leida (boolean)
- Constructor con todo menos fecha (LocalDateTime.now()) y leida (false)
- Constructor copia
- Getters de todo
- Setters de titulo, mensaje y usuario
- Equals por título, usuario y fecha
- toString con todos los atributos
- Métodos propios:
  - void marcarComoLeida(): leida = true
  - void pintarResumen(): muestra título, fecha, estado y usuario destinatario
- Métodos abstractos:
  - void enviar();
  - String getIcono();
  - int getPrioridad(); 

## Clase hija - NotificacionEmail
- Atributos: remitente, tieneAdjuntos
- Constructores
- Getters y Setters
- toString
- Métodos sobreescritos:
  - void enviar(): pinta tipo formato email -> De: ,Asunto: ,Mensaje: , Adjuntos:
  - String getIcono(): "\uD83D\uDCE7"
  - int getPrioridad(): 1 si no tiene adjuntos, 2 si tiene adjuntos

## Clase hija - NotificacionRedSocial
- Atributos: enum tipoInteraccion (LIKE,COMMENT,SHARE,FOLLOW), nombreUsuarioOrigen, urlPublicacion
- Constructores
- Getters y Setters
- toString
- Métodos sobreescritos:
    - void enviar(): pinta  "Nueva interacción redes" con usuarioOrigen, tipo, título y mensaje
    - String getIcono(): "\uD83C\uDF10 " + getIconoInteraccion()
    - int getPrioridad(): 1 LIKE, 2 COMMENT O SHARE, 3 FOLLOW
- Método auxiliar:
  - String getIconoInteraccion(): 
    - "\uD83D\uDC4D" si LIKE,
    - "\uD83D\uDCAC" si COMMENT,
    - "\u27A1\uFE0F" si SHARE,
    - "\uD83D\uDC64" si FOLLOW

## Clase hija - NotificacionDeSistema
- Atributos: enum tipoAlerta (INFO, ERROR, SUCCESS), requiereAccion
- Constructores
- Getters y Setters
- toString
- Métodos sobreescritos:
    - void enviar(): pinta  "Alerta del sistema" con tipo y mensaje y si requiere acción
    - String getIcono(): según tipo de alerta
      - "\u2139\uFE0F" si INFO,
      - "\u274C" si ERROR,
      - "\u2705" si SUCCESS
    - int getPrioridad(): para ERROR 4, y para el resto 2 

## Clase de servicios - SistemaNotificaciones
- Atributos: ArrayList<Notificacion> notificaciones
- Constructor
- Getter
- Métodos:
  - Añadir notificación
  - Eliminar notificación
  - Enviar todas las notificaciones
  - Pintar resumen de todas las notificaciones
  - Pintar resumen de notificaciones por prioridad (*)
  - Pintar notificaciones leídas
  - Mostrar número de notificaciones pendientes de leer

## Clase de aplicacion - App
- Crear objeto SistemaNotificaciones
- Crear dos objetos de cada tipo de notificación
- Añadir todas las notificaciones al sistema
- Enviar todas las notificaciones
- Leer dos de ellas
- Pintar las notificaciones leídas
- Pintar el número de notificaciones pendientes de leer
- Pintar el resumen de todas las notificaciones

(*) Intenta hacer la ordenación con el ejemplo de clase.
Si no puedes no pasa nada, déjalo.

