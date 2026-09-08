# Diseño y Desarrollo de una API REST en un Sistema de Gestión de Préstamos

En un sistema de gestión de préstamos, se requiere desarrollar una API REST que permita a los clientes solicitar, consultar y aprobar préstamos. La API debe ser idempotente, manejar errores de forma adecuada y estar documentada con Swagger. Los préstamos tienen los siguientes atributos: ID, monto, tasa de interés, fecha de solicitud, estado (pendiente, aprobado, rechazado). La API debe interactuar con una base de datos H2 para la persistencia de los datos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | java-spring-boot-rest-api |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición del Dominio y Requisitos Funcionales

**Objetivo:** Identificar los actores, fuentes y sumideros del dominio, así como las propiedades operativas y umbrales numéricos relevantes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Enumera los actores involucrados en el proceso de solicitud y aprobación de préstamos.
- Define las fuentes y sumideros de datos en el dominio.
- Establece los umbrales numéricos relevantes para el dominio (ej. monto máximo de préstamo, tasa de interés máxima).
- Identifica las propiedades operativas del dominio (ej. idempotencia en la solicitud de préstamo).

**Entregable:** Documento que describe el dominio, los actores, las fuentes y sumideros, los umbrales numéricos y las propiedades operativas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las diferentes fases del proceso de préstamo y cómo se relacionan.
- Piensa en los posibles modos de falla y cómo manejarlos.

</details>

### Fase 2: Diseño de la API REST

**Objetivo:** Diseñar la estructura y endpoints de la API REST, asegurando idempotencia y manejo de errores.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Diseña los endpoints necesarios para solicitar, consultar y aprobar préstamos.
- Asegura que la API sea idempotente en la solicitud de préstamos.
- Define cómo manejar los errores comunes en el dominio (ej. préstamo ya aprobado, monto inválido).

**Entregable:** Documento que describe los endpoints de la API, incluyendo la estructura de las solicitudes y respuestas, y el manejo de errores.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de códigos de estado HTTP adecuados para cada situación.
- Piensa en cómo asegurar la idempotencia en la solicitud de préstamos.

</details>

### Fase 3: Implementación y Documentación de la API

**Objetivo:** Implementar la API REST y documentarla con Swagger.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa los endpoints diseñados en la fase anterior.
- Asegura que la API interactúe con la base de datos H2 para la persistencia de los datos.
- Documenta la API con Swagger, incluyendo descripciones de los endpoints, parámetros y respuestas.

**Entregable:** API REST implementada y documentada con Swagger.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza las anotaciones de Spring Boot para definir los endpoints y la persistencia.
- Asegúrate de que la documentación con Swagger sea clara y completa.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una API REST y cuáles son sus principales características?
- **paraQueSirve**: ¿Para qué sirve la API REST en el dominio de los préstamos?
- **comoSeUsa**: ¿Cómo se usa la API REST para solicitar y aprobar préstamos?
- **erroresComunes**: ¿Cuáles son los errores comunes en el dominio de los préstamos y cómo los maneja la API?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño y la implementación de la API REST en el dominio de los préstamos?

## Criterios de Evaluacion

- Identificación correcta de los actores, fuentes y sumideros del dominio.
- Definición adecuada de los umbrales numéricos y propiedades operativas.
- Diseño de endpoints idempotentes y manejo de errores en la API.
- Implementación correcta de la API y documentación clara con Swagger.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
