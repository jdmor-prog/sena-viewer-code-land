# sena-viewer-code-land
Proyecto de POO en Java para simular una plataforma de contenido multimedia.

## 🚀 Características Principales

- Gestión de libros, revistas, películas, series y capítulos.
- Estructura orientada a objetos: uso de clases abstractas y herencia .
- Métodos para reproducir, calificar, marcar como visto/leído y gestionar publicaciones.
- Código modular y organizado en la carpeta `models` para facilitar el mantenimiento y la escalabilidad.

# 🎬 SENA Viewer Code Land

Una plataforma moderna de contenido multimedia desarrollada con Java y principios de Programación Orientada a Objetos (POO). El proyecto implementa una jerarquía de clases para representar distintos tipos de contenido, permitiendo su gestión y visualización.

### Principios POO Implementados

- **Encapsulamiento**: Uso de atributos privados y métodos públicos (getters y setters).
- **Herencia**: Clases como `Book`, `Magazine`, `Film`, `Serie`, y `Chapter` heredan de clases base como `Publication` o clases abstractas.

## 📁 Estructura del Proyecto

```
sena-viewer-code-land/
├── src/
│   └── models/
│       ├── Book.java
│       ├── Chapter.java
│       ├── Film.java
│       ├── Magazine.java
│       ├── Muvie.java
│       ├── Publication.java
│       ├── Serie.java
│       └── Main.java
├── .gitignore
├── README.md
└── LICENSE
```
- `src/models/`: Contiene las clases principales del modelo de dominio.
- `README.md`: Documentación del proyecto.
- `LICENSE`: Licencia del proyecto.

## 💻 Uso

Ejecuta la clase `Main.java` para iniciar la simulación de la plataforma y gestionar los diferentes tipos de contenido.

