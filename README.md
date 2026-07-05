# Sistema de Gestión de Servicios Turísticos

Proyecto desarrollado en **Java** para demostrar los conceptos fundamentales de **Programación Orientada a Objetos (POO)**, aplicando herencia, polimorfismo, encapsulación y manejo de colecciones.

## Objetivos

- Modelar distintos tipos de servicios turísticos mediante herencia.
- Almacenar los servicios en una única colección utilizando polimorfismo.
- Aplicar encapsulación devolviendo copias de la colección.
- Demostrar el uso de métodos sobrescritos (`@Override`) para ejecutar comportamientos específicos de cada clase.

## Estructura del proyecto

```
src
├── data
│   └── GestorServicios.java
│
├── model
│   ├── ServicioTuristico.java
│   ├── ExcursionCultural.java
│   ├── PaseoLacustre.java
│   └── RutaGastronomica.java
│
└── iu
    └── Main.java
```

## Clases

### ServicioTuristico

Clase padre que representa un servicio turístico genérico. Contiene los atributos y métodos comunes para todos los servicios.

### ExcursionCultural

Clase hija que representa una excursión cultural.

### PaseoLacustre

Clase hija que representa un paseo lacustre.

### RutaGastronomica

Clase hija que representa una ruta gastronómica.

### GestorServicios

Clase encargada de administrar los servicios turísticos registrados.

Entre sus responsabilidades se encuentran:

- Agregar servicios.
- Mostrar los servicios almacenados.
- Limpiar la colección.
- Retornar una copia de la lista para proteger la encapsulación.

## Conceptos aplicados

- Programación Orientada a Objetos (POO)
- Herencia
- Polimorfismo
- Sobrescritura de métodos (`@Override`)
- Clases abstractas
- Constructores copia
- Encapsulación
- Colecciones (`ArrayList`)
- Manejo de listas mediante referencias del tipo padre

## Ejecución

1. Clonar el repositorio.

```bash
git clone <url-del-repositorio>
```

2. Abrir el proyecto en IntelliJ IDEA.

3. Ejecutar la clase:

```
src/iu/Main.java
```

## Ejemplo de funcionamiento

El programa registra distintos servicios turísticos:

- Excursión Cultural
- Paseo Lacustre
- Ruta Gastronómica

Todos son almacenados en una única lista de tipo:

```java
List<ServicioTuristico>
```

Posteriormente son recorridos utilizando un ciclo `for-each`, invocando el método `mostrarInformacion()` mediante polimorfismo.

## Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Maven

## Autor

**Brian Vallejos**