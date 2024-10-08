# 1.1-Herencia-y-polimorfismo

# 📄 Descripción - Serie de ejercicios

## Nivel 1

### - Ejercicio 1

En un grupo de música existen diferentes tipos de instrumentos musicales. Hay instrumentos de **viento**, **cuerda** y **percusión**.

Todos los instrumentos tienen los siguientes atributos y métodos:

- **Atributos**: 
  - `nombre`
  - `precio`
  
- **Método `tocar()`**:
  - Es un método abstracto en la clase `Instrumento` y, por tanto, debe implementarse en las clases hijas.
  - Cuando se toca un instrumento, el método debe mostrar por consola un mensaje acorde al tipo de instrumento:
    - **Instrumento de viento**: "Está sonando un instrumento de viento"
    - **Instrumento de cuerda**: "Está sonando un instrumento de cuerda"
    - **Instrumento de percusión**: "Está sonando un instrumento de percusión"

- **Demostración de la carga de clases**: 
  - El proceso de carga de una clase solo ocurre una vez. Se puede demostrar que la carga se provoca al crear la primera instancia de la clase o al acceder a un miembro estático de esta.
  
> **Tarea adicional**: Buscar información sobre los bloques de inicialización y bloques estáticos en Java.

### - Ejercicio 2

1. **Crear la clase `Coche`** con los atributos:
   - `marca`: Estático final
   - `modelo`: Estático
   - `potencia`: Final

2. **Demostrar la diferencia entre los tres tipos de atributos**. Responder si alguno de estos atributos puede inicializarse en el constructor de la clase.

3. **Métodos en la clase `Coche`**:
   - **Método estático `frenar()`**: Muestra por consola el mensaje "El vehículo está frenando".
   - **Método no estático `acelerar()`**: Muestra por consola el mensaje "El vehículo está acelerando".

4. **Demostración de invocación de métodos**:
   - Mostrar cómo invocar el método estático `frenar()` y el método no estático `acelerar()` desde el método `main()` de la clase principal.

## Nivel 2

### - Ejercicio 1

1. **Crear la clase `Teléfono`** con los atributos:
   - `marca`
   - `modelo`
   
   Además, incluir el método `llamar()`:
   - Recibe un parámetro `String` con un número de teléfono.
   - Muestra un mensaje en consola diciendo que se está llamando al número recibido por parámetro.

2. **Crear interfaces**:
   - **Interfaz `Cámara`**: Define el método `fotografiar()`.
   - **Interfaz `Reloj`**: Define el método `alarma()`.

3. **Crear la clase `Smartphone`**:
   - Esta clase debe ser subclase de `Teléfono` e implementar las interfaces `Cámara` y `Reloj`.
   - **Implementación de métodos**:
     - Método `fotografiar()`: Muestra el mensaje "Se está haciendo una foto".
     - Método `alarma()`: Muestra el mensaje "Está sonando la alarma".

4. **Demostración desde `main()`**:
   - Crear un objeto de la clase `Smartphone` y llamar a los métodos `llamar()`, `fotografiar()`, y `alarma()`.


## Nivel 3

### - Ejercicio 1

En una redacción de noticias deportivas se clasifican las noticias por los siguientes deportes: **fútbol**, **baloncesto**, **tenis**, **F1**, y **motociclismo**.

#### Redactores
- La redacción puede tener varios redactores.
- **Atributos de cada redactor**:
  - `nombre`
  - `DNI` (único e inmutable una vez asignado)
  - `sueldo` (inicialmente de 1500€, es igual para todos los redactores y podrá incrementarse globalmente en el futuro).

#### Noticias
- Cada redactor puede trabajar en múltiples noticias.
- **Atributos de cada noticia**:
  - `titular`
  - `texto` (inicialmente vacío)
  - `puntuación`
  - `precio`
- **Clasificación por deporte**:
  - **Noticias de Fútbol**: Incluyen `competición`, `club` y `jugador`.
  - **Noticias de Baloncesto**: Incluyen `competición` y `club`.
  - **Noticias de Tenis**: Incluyen `competición` y `tenistas`.
  - **Noticias de F1**: Incluyen `escudería`.
  - **Noticias de Motociclismo**: Incluyen `equipo`.

#### Calcular Precio de la Noticia
Para determinar el precio de cada noticia, se implementará un método llamado `calcularPreuNoticia()` que sigue las siguientes reglas:

- **Noticias de Fútbol**:
  - Precio base: 300€
  - Liga de Campeones: +100€
  - Equipos Barça o Madrid: +100€
  - Jugadores Ferran Torres o Benzema: +50€
  - Ejemplo: Una noticia sobre un gol de Ferran Torres del Barça en la Liga de Campeones tiene un precio de 550€.

- **Noticias de Baloncesto**:
  - Precio base: 250€
  - Euroliga: +75€
  - Equipos Barça o Madrid: +75€

- **Noticias de Tenis**:
  - Precio base: 150€
  - Jugadores Federer, Nadal o Djokovic: +100€

- **Noticias de F1**:
  - Precio base: 100€
  - Escuderías Ferrari o Mercedes: +50€

- **Noticias de Motociclismo**:
  - Precio base: 100€
  - Equipos Honda o Yamaha: +50€

#### Calcular Puntuación de la Noticia
Las puntuaciones de las noticias se calculan según estos criterios:

- **Noticias de Fútbol**:
  - Base: 5 puntos
  - Liga de Campeones: +3 puntos
  - Liga: +2 puntos
  - Equipos Barça o Madrid: +1 punto
  - Jugadores Ferran Torres o Benzema: +1 punto
  - Ejemplo: Una noticia sobre un gol de Ferran Torres del Barça en la Liga de Campeones tiene una puntuación de 10 puntos.

- **Noticias de Baloncesto**:
  - Base: 4 puntos
  - Euroliga: +3 puntos
  - ACB: +2 puntos
  - Equipos Barça o Madrid: +1 punto

- **Noticias de Tenis**:
  - Base: 4 puntos
  - Jugadores Federer, Nadal o Djokovic: +3 puntos

- **Noticias de F1**:
  - Base: 4 puntos
  - Escuderías Ferrari o Mercedes: +2 puntos

- **Noticias de Motociclismo**:
  - Base: 3 puntos
  - Equipos Honda o Yamaha: +3 puntos

#### Menú en la Clase Principal
La clase principal debe presentar un menú con las siguientes opciones:

1. Introducir redactor.
2. Eliminar redactor.
3. Introducir noticia a un redactor.
4. Eliminar noticia (requiere seleccionar redactor y titular de la noticia).
5. Mostrar todas las noticias de un redactor.
6. Calcular puntuación de una noticia.
7. Calcular precio de una noticia.

---

## 💻 Tecnologías Utilizadas

- **Java**
- **Eclipse**

## 📋 Requisitos

- Tener Java instalado.

## 🛠️ Instalación

(Sin detalles específicos)

## ▶️ Ejecución

1. Abrir el proyecto en el IDE.
2. Compilar el proyecto.

## 🌐 Despliegue

(Sin detalles específicos)

## 🤝 Contribuciones

(Sin detalles específicos)
