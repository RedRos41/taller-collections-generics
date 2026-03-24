# Taller Collections y Generics en Java

Taller sobre el uso de **Collections Framework** y **Generics** en Java.

## Requisitos

- Java 11 o superior

> No necesitas instalar Maven. El proyecto incluye un **Maven Wrapper** (`mvnw`) que lo descarga automáticamente.

## Estructura del proyecto

```
src/main/java/
├── ejercicio01/  → Lista de Tareas (ArrayList)
├── ejercicio02/  → PairList genérico (K, V)
├── ejercicio03/  → LinkedHashSet - elementos únicos con orden
├── ejercicio04/  → Repositorio genérico
├── ejercicio05/  → SpliceStack - intercalar dos stacks
├── ejercicio06/  → Máximo genérico con Comparable
├── ejercicio07/  → Interfaz Comparador con implementaciones
├── ejercicio08/  → SplitStack - dividir stack en pares/impares
├── ejercicio10/  → Sistema de alquiler de vehículos (herencia + generics)
└── ejercicio11/  → MergeQueues - fusión de colas ordenadas
```

## Compilación

```bash
# Windows
mvnw.cmd compile

# Linux / macOS
./mvnw compile
```

## Ejecutar un ejercicio

```bash
# Windows (reemplazar mvnw.cmd por ./mvnw en Linux/macOS)
mvnw.cmd exec:java -Dexec.mainClass="ejercicio01.MainEjercicio1"
mvnw.cmd exec:java -Dexec.mainClass="ejercicio02.MainEjercicio2"
mvnw.cmd exec:java -Dexec.mainClass="ejercicio03.Main"
mvnw.cmd exec:java -Dexec.mainClass="ejercicio04.MainEjercicio4"
mvnw.cmd exec:java -Dexec.mainClass="ejercicio05.SpliceStack"
mvnw.cmd exec:java -Dexec.mainClass="ejercicio06.MaximoGenerico"
mvnw.cmd exec:java -Dexec.mainClass="ejercicio07.MainEjercicio7"
mvnw.cmd exec:java -Dexec.mainClass="ejercicio08.SplitStack"
mvnw.cmd exec:java -Dexec.mainClass="ejercicio10.SistemaAlquiler"
mvnw.cmd exec:java -Dexec.mainClass="ejercicio11.MergeQueues"
```

## Temas cubiertos

- `ArrayList`, `LinkedHashSet`, `Stack`, `Queue`, `LinkedList`
- Generics: clases, métodos e interfaces genéricas
- Bounded type parameters (`<T extends Comparable<T>>`)
- Herencia y polimorfismo con generics
- Wildcard bounds (`<T extends Vehiculo>`)

## Autor

Derek Rodríguez - Universidad del Quindío
