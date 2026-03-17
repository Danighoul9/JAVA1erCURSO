# 🧪 Práctica: Gestión de Inventario y Equipamiento en un RPG usando Maps en Java

## 🎯 Objetivos

* Aplicar el uso de la interfaz `Map` en Java dentro de un contexto práctico.
* Reforzar conceptos de Programación Orientada a Objetos (POO).
* Diseñar estructuras de datos eficientes para representar inventarios y equipamiento.
* Familiarizarse con el uso de herramientas profesionales: Git, Maven, IntelliJ IDEA y Lombok.

---

## 📦 Descripción de la práctica

Vas a desarrollar un sistema básico de gestión de inventario y equipamiento para un personaje de un videojuego RPG.

El personaje dispondrá de:

1. **Inventario**: una colección de objetos que posee el personaje.
2. **Equipamiento**: un conjunto de objetos actualmente equipados en distintas partes del cuerpo.

Ambos sistemas deberán estar implementados utilizando `Map`.

---

## 🧱 Requisitos técnicos

### 🔧 Proyecto

* Crear un repositorio en Git (GitHub, GitLab, etc.).
* Inicializar un proyecto en **IntelliJ IDEA** usando **Maven**.
* Incluir la dependencia de **Lombok** en el `pom.xml`.

#### Dependencia Lombok:

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>REPLACE_WITH_LATEST</version>
    <scope>provided</scope>
</dependency>
```

---

## 🧩 Modelo del dominio

### 🧍 Clase `Personaje`

Debe contener como mínimo:

* `String nombre`
* `Map<String, Item> inventario`
* `Map<TipoEquipamiento, Item> equipamiento`

---

### 🗡️ Clase `Item`

Debe incluir:

* `String nombre`
* `String descripcion`
* `int nivelRequerido`
* `TipoItem tipo`

---

### 🏷️ Enum `TipoItem`

Ejemplos:

* ARMA
* ARMADURA
* CONSUMIBLE

---

### 🛡️ Enum `TipoEquipamiento`

Ejemplos:

* CABEZA
* PECHO
* PIERNAS
* MANO_PRINCIPAL
* MANO_SECUNDARIA

---

## ⚙️ Funcionalidades a implementar

### 📦 Inventario

* Añadir un objeto al inventario.
* Eliminar un objeto del inventario.
* Mostrar todos los objetos del inventario.
* Buscar un objeto por clave.

> 💡 La clave del `Map` puede ser un identificador único (`String`).

---

### 🛡️ Equipamiento

* Equipar un objeto desde el inventario.
* Desequipar un objeto (y devolverlo al inventario).
* Mostrar el equipamiento actual.
* Evitar equipar objetos incompatibles con el slot.

---

### 🔄 Lógica adicional

* No se puede equipar un objeto que no esté en el inventario.
* Al equipar un objeto, debe eliminarse del inventario.
* Al desequipar, debe volver al inventario.
* Control de errores básico (nulls, claves inexistentes, etc.).

---

## 🧪 Ejecución

Crear una clase `Main` donde:

* Se cree un personaje.
* Se añadan varios objetos al inventario.
* Se realicen operaciones de equipamiento/desequipamiento.
* Se muestre el estado del inventario y equipamiento en consola.

---

## ⭐ Extras (Opcional)

* Uso de `HashMap` vs `TreeMap` (comparar comportamiento).
* Implementar estadísticas en los objetos (ataque, defensa, etc.).
* Implementar sistema de rareza de objetos.

---

## 📋 Entrega

* Repositorio Git con:

  * Código fuente completo.
  * `README.md` explicando:

    * Cómo ejecutar el proyecto.
    * Decisiones de diseño.
* Proyecto compilable con Maven.

---

## 🧠 Criterios de evaluación

* Uso correcto de `Map`.
* Diseño orientado a objetos.
* Limpieza y legibilidad del código.
* Uso adecuado de Lombok.
* Control de errores.
* Buenas prácticas (nombres, estructura, etc.).

---


