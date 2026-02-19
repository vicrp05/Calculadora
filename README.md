
# Calculadora Java


Calculadora es una aplicación de escritorio desarrollada en Java, pensada especialmente para estudiantes de Grado Superior en Desarrollo de Aplicaciones Multiplataforma (DAM). Este proyecto permite poner en práctica conceptos clave del ciclo formativo, como la programación orientada a objetos, el diseño de interfaces gráficas con Java Swing y la gestión de proyectos Java en entornos profesionales.

El objetivo principal es servir como recurso educativo y fomentar el aprendizaje autónomo mediante la experimentación y ampliación de funcionalidades.

## Tabla de Contenidos
- [Características](#características)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Contribución](#contribución)
- [Soporte](#soporte)
- [Autor](#autor)
- [Licencia](#licencia)


## Características
- Interfaz gráfica amigable y moderna (Java Swing)
- Operaciones matemáticas básicas: suma, resta, multiplicación y división
- Validación de entradas y manejo de errores (por ejemplo, división por cero)
- Código estructurado y comentado para facilitar su comprensión y mantenimiento
- Ejemplo práctico para el aprendizaje de patrones de diseño y buenas prácticas en Java

## Estructura del Proyecto
- `src/calculadora/Calculadora.java`: Lógica principal y ventana de la calculadora
- `src/calculadora/Calculadora.form`: Formulario de la interfaz gráfica (NetBeans)
- `src/imagenes/`: Imágenes utilizadas en la interfaz (si aplica)
- `build/`: Archivos generados y clases compiladas
- `test/`: Pruebas unitarias y de integración (si aplica)


## Requisitos
- Java JDK 8 o superior
- IDE recomendado: NetBeans, IntelliJ IDEA o Eclipse
- Conocimientos básicos de programación orientada a objetos y Java

## Instalación
1. Clona este repositorio:
   ```sh
   git clone https://github.com/vicrp05/Calculadora
   ```
2. Abre el proyecto en tu IDE preferido.
3. Asegúrate de tener configurado el JDK adecuado.

## Uso
Puedes compilar y ejecutar la calculadora desde tu IDE o mediante la terminal:

```sh
javac -d build/classes src/calculadora/Calculadora.java
java -cp build/classes calculadora.Calculadora
```


## Contribución
Este proyecto está abierto a la participación de estudiantes y docentes. Puedes proponer mejoras, añadir nuevas funcionalidades (científica, historial, conversor de unidades, etc.) o adaptar la interfaz para otros dispositivos.


## Soporte
Si tienes dudas, necesitas ayuda o quieres compartir tus avances, puedes abrir un issue en el repositorio o contactar al autor. Este proyecto está pensado para acompañar tu aprendizaje en el ciclo de DAM.

## Autor
- Victor Paredes

## Licencia
Este proyecto está licenciado bajo los términos de uso libre para fines educativos.


