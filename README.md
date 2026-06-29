# Sistema de Gestión de Servicios Turísticos

## Descripción

Este proyecto corresponde a una aplicación desarrollada en **Java** utilizando **Programación Orientada a Objetos (POO)**.

El sistema permite administrar distintos tipos de servicios turísticos, aplicando conceptos como herencia, polimorfismo y encapsulamiento.

Los servicios son almacenados temporalmente en memoria mediante listas (`ArrayList`) y posteriormente pueden visualizarse por consola.

---

## Objetivo

Desarrollar una aplicación que permita registrar y administrar diferentes servicios turísticos utilizando una jerarquía de clases y un gestor encargado de almacenar la información.

---

## Estructura del Proyecto

```
src
│
├── data
│   └── GestorServicios.java
│
├── iu
│   └── Main.java
│
└── model
    ├── ServicioTuristico.java
    ├── ExcursionCultural.java
    ├── PaseoLacustre.java
    └── RutaGastronomica.java
```

---

## Clases del Proyecto

### ServicioTuristico

Clase padre del sistema.

Contiene los atributos comunes para todos los servicios turísticos, como:

- Nombre
- Duración en horas

Esta clase es heredada por los distintos tipos de servicios.

---

### ExcursionCultural

Representa una excursión a un lugar histórico.

Atributo adicional:

- Lugar histórico

---

### PaseoLacustre

Representa un paseo realizado en una embarcación.

Atributo adicional:

- Tipo de embarcación

---

### RutaGastronomica

Representa una ruta enfocada en la gastronomía.

Atributo adicional:

- Número de paradas

---

### GestorServicios

Es la clase encargada de administrar la información del sistema.

Entre sus funciones se encuentran:

- Agregar excursiones culturales.
- Agregar paseos lacustres.
- Agregar rutas gastronómicas.
- Mostrar todos los servicios registrados.
- Limpiar las listas almacenadas en memoria.

Además incluye un método de prueba que crea objetos automáticamente para verificar el funcionamiento del programa. :contentReference[oaicite:0]{index=0}

---

## Conceptos de Programación Aplicados

- Programación Orientada a Objetos
- Herencia
- Polimorfismo
- Encapsulamiento
- Constructores
- Sobrescritura del método `toString()`
- Uso de `ArrayList`
- Organización por paquetes

---

## Funcionamiento

Al ejecutar el programa:

1. Se crea una instancia del gestor.
2. Se registran distintos servicios turísticos.
3. Cada servicio se almacena en su respectiva lista.
4. Finalmente todos los servicios son mostrados por consola.

---

## Tecnologías utilizadas

- Java
- IntelliJ IDEA
- JDK 17 (o superior)

---

## Autor

**Brian Vallejos**

Estudiante Analista Programador Computacional

---

## Ejemplo de salida

```
Servicios Turísticos registrados:

1.- ExcursionCultural{...}

2.- ExcursionCultural{...}

3.- PaseoLacustre{...}

4.- PaseoLacustre{...}

5.- RutaGastronomica{...}

6.- RutaGastronomica{...}
```

---

## Estado del proyecto

Proyecto académico desarrollado para la asignatura de Programación Orientada a Objetos.