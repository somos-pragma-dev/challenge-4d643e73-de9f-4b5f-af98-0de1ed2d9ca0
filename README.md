# Diseño y Desarrollo de una API REST en un Sistema de Gestión de Préstamos

El sistema de gestión de préstamos de una institución financiera necesita una API REST que permita a los clientes consultar sus préstamos y realizar nuevos préstamos. La API debe persistir los datos en una base de datos H2 y contar con documentación utilizando Swagger. Los préstamos tienen los siguientes atributos: ID, monto, tasa de interés, fecha de inicio, fecha de fin, estado (pendiente, aprobado, rechazado). La API debe validar que el monto del préstamo sea mayor a cero y que la tasa de interés sea un valor entre 0 y 100. En caso de error, la API debe devolver un mensaje descriptivo. El sistema debe manejar una carga de hasta 100 solicitudes por segundo con una latencia máxima de 200ms.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot REST API |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del Modelo de Préstamo

**Objetivo:** Definir el modelo de datos para los préstamos y sus validaciones.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los atributos necesarios para representar un préstamo.
- Definir las validaciones para el monto y la tasa de interés.

**Entregable:** Modelo de datos para préstamos con validaciones.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los diferentes estados que puede tener un préstamo.
- Piensa en los posibles errores que pueden ocurrir al validar los atributos.

</details>

### Fase 2: Implementación de la API REST

**Objetivo:** Implementar la API REST que permite consultar y crear préstamos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Diseñar las rutas y métodos HTTP para consultar y crear préstamos.
- Implementar la persistencia de los datos en la base de datos H2.

**Entregable:** API REST funcional con persistencia en H2.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la API debe manejar una carga de hasta 100 solicitudes por segundo con una latencia máxima de 200ms.
- Piensa en cómo manejar los errores de validación en la API.

</details>

### Fase 3: Documentación de la API con Swagger

**Objetivo:** Documentar la API REST utilizando Swagger.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Configurar Swagger para documentar las rutas y métodos de la API.
- Asegurar que la documentación incluya ejemplos de solicitudes y respuestas.

**Entregable:** API REST con documentación completa en Swagger.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la documentación debe ser clara y concisa.
- Piensa en cómo puedes mejorar la experiencia del usuario con la documentación.

</details>

### Fase 4: Optimización y Refactorización de la API

**Objetivo:** Optimizar y refactorizar la API para mejorar su rendimiento y mantenibilidad.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar y corregir posibles cuellos de botella en la API.
- Refactorizar el código para mejorar su legibilidad y mantenibilidad.

**Entregable:** API REST optimizada y refactorizada.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la API debe manejar una carga de hasta 100 solicitudes por segundo con una latencia máxima de 200ms.
- Piensa en cómo puedes mejorar la legibilidad y mantenibilidad del código.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un préstamo y cuáles son sus atributos?
- **paraQueSirve**: ¿Para qué sirve la API REST en el sistema de gestión de préstamos?
- **comoSeUsa**: ¿Cómo se utiliza la API REST para consultar y crear préstamos?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al validar los atributos de un préstamo?
- **queDecisionesImplica**: ¿Qué decisiones implica la optimización y refactorización de la API?

## Criterios de Evaluacion

- Definir el modelo de datos para los préstamos con validaciones.
- Implementar la API REST que permite consultar y crear préstamos.
- Documentar la API REST utilizando Swagger.
- Optimizar y refactorizar la API para mejorar su rendimiento y mantenibilidad.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
