# Sistema de Gestión de Eventos
Integrantes: 
- Ariana Alejandra Córdova Betancourt
- Cristhian Alexander Dávila Sari

## Descripción
Este proyecto implementa un sistema de gestión de eventos utilizando programación orientada a objetos. A continuación, se describen las clases diseñadas, sus relaciones y los tipos de relaciones utilizadas en el sistema.

## Diagrama de Clases

El sistema modela la gestión de eventos, incluyendo participantes, organizadores, elementos complementarios, y el propio sistema de eventos. Aquí se describen las clases principales y sus relaciones.


## Clases del Sistema

### 1. **Participante**
- **Atributos:**
  - `nombre`: string
  - `email`: string
  - `apellido`: string
  - `telefono`: string
- **Relaciones:**
  - Relación de herencia con:
    - `ParticipanteVIP`
    - `ParticipanteRegular`
- **Descripción:** Clase base para modelar a los participantes, extendida por `ParticipanteVIP` y `ParticipanteRegular`.

### 2. **ParticipanteVIP**
- **Atributos:**
  - `empresa`: string
- **Relación:** Hereda de `Participante`.
- **Descripción:** Representa a los participantes con estatus VIP.

### 3. **ParticipanteRegular**
- **Relación:** Hereda de `Participante`.
- **Descripción:** Representa a los participantes regulares.

### 4. **Organizador**
- **Atributos:**
  - `numeroOrganizador`: int
  - `nombre`: string
  - `apellido`: string
  - `correo`: string
  - `telefono`: string
- **Descripción:** Representa a los organizadores responsables de eventos y elementos complementarios.

### 5. **Evento**
- **Atributos:**
  - `numEvento`: int
  - `nombre`: string
  - `fechaEvento`: string
  - `participantes`: Lista de objetos `Participante`.
  - `elementoComplementario`: `ElementoComplementario`
  - `tipoEvento`: `TipoEvento`
  - `organizador`: `Organizador`
- **Métodos:**
  - `registrarParticipante(Participante participante)`: void
  - `obtenerInfoEvento()`: string
  - `asociarElementoComplementario(ElementoComplementario elemento)`: void
- **Descripción:** Clase que modela un evento.

### 6. **ElementoComplementario**
- **Atributos:**
  - `nombre`: string
  - `descripcion`: string
  - `numeroElementoComplementario`: int
  - `fecha`: string
  - `hora`: string
  - `ubicacion`: string
  - `cuposDisponibles`: int
  - `cuposTotales`: int
  - `organizador`: `Organizador`
- **Métodos:**
  - `obtenerInfoElemento()`: string
- **Descripción:** Representa recursos adicionales dentro del evento.

### 7. **TipoEvento** *(Enumeración)*
- **Valores:**
  - `CONFERENCIA`
  - `TALLER`
  - `SEMINARIO`
  - `EVENTO_SOCIAL`
  - `WEBINAR`
- **Descripción:** Define los tipos de eventos posibles.

### 8. **SistemaEvento**
- **Atributos:**
  - `listaEvento`: Lista de objetos `Evento`.
  - `listaParticipante`: Lista de objetos `Participante`.
  - `listaOrganizador`: Lista de objetos `Organizador`.
  - `listaElementoComplementario`: Lista de objetos `ElementoComplementario`.
- **Descripción:** Gestiona y organiza los eventos y los datos asociados.

### 9. **IGestionEvento** *(Interfaz)*
- **Métodos:**
  - `registrarParticipante(Participante participante)`: void 
  - `listarParticipantes()`: void 
  - `registrarEvento(Evento evento)`: void
  - `listarEvento()`: void
  - `registrarTipoEvento(TipoEvento tipoEvento)`: void
  - `listarTipoEventos()`: void
  - `registrarParticipanteVIP(ParticipanteVIP participanteVIP)`: void
  - `listarParticipantesVIP()`: void
  - `registrarParticipanteRegular(ParticipanteRegular participanteRegular)`: void
  - `listarParticipanteRegulares()`: void
- **Descripción:** Define las operaciones principales para la gestión de eventos.


## Tipos de Relaciones Utilizadas

1. **Herencia:** 
   - Entre `Participante`, `ParticipanteVIP`, y `ParticipanteRegular`.

2. **Composición:**
   - `Evento` no puede existir sin un `Organizador`.

3. **Realización:**
   - `SistemaEvento` implementa `IGestionEvento`.

4. **Asociación:**
   - Entre `Participante` y `Evento`.
   - Entre `Evento` y `TipoEvento`.

5. **Dependencia:**
   - `Evento` depende de `ElementoComplementario`.

4. **Agregación:**
   - `Evento` tiene un `SistemaEvento`.

---

## Ejemplo de Uso

Este sistema permite registrar eventos, asignar organizadores y participantes, y gestionar recursos adicionales. Esto proporciona un modelo flexible para diferentes tipos de eventos, como conferencias, talleres, seminarios, eventos sociales, y webinars.

---


![Imagen de WhatsApp 2024-11-29 a las 10 36 32_0877016f](https://github.com/user-attachments/assets/9ed940c6-8146-43d4-ae71-80ea627ea327)

  
