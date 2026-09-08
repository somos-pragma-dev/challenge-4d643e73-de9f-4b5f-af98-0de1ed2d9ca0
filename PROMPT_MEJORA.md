# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
API REST con persistencia en H2 y documentación con Swagger

### Reto
- Tema: java-spring-boot-rest-api
- Seniority: junior-l1
- Tipo: practical
- Título: Diseño y Desarrollo de una API REST en un Sistema de Gestión de Préstamos
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Definición del Dominio y Requisitos Funcionales — objetivo: Identificar los actores, fuentes y sumideros del dominio, así como las propiedades operativas y umbrales numéricos relevantes. — entregable (NO resolver): Documento que describe el dominio, los actores, las fuentes y sumideros, los umbrales numéricos y las propiedades operativas.
- Fase 2: Diseño de la API REST — objetivo: Diseñar la estructura y endpoints de la API REST, asegurando idempotencia y manejo de errores. — entregable (NO resolver): Documento que describe los endpoints de la API, incluyendo la estructura de las solicitudes y respuestas, y el manejo de errores.
- Fase 3: Implementación y Documentación de la API — objetivo: Implementar la API REST y documentarla con Swagger. — entregable (NO resolver): API REST implementada y documentada con Swagger.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
// === ARCHIVO: src/main/java/com/example/loansystem/controller/LoanController.java ===
package com.example.loansystem.controller;

import com.example.loansystem.dto.LoanRequestDTO;
import com.example.loansystem.dto.LoanResponseDTO;
import com.example.loansystem.service.LoanService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @Operation(summary = "Solicitar un préstamo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Préstamo solicitado con éxito", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LoanResponseDTO.class))),
            @ApiResponse(responseCode = "400", description = "Solicitud inválida", content = @Content)
    })
    @PostMapping
    public ResponseEntity<LoanResponseDTO> applyLoan(@RequestBody LoanRequestDTO loanRequestDTO) {
        LoanResponseDTO loanResponseDTO = loanService.applyLoan(loanRequestDTO);
        return new ResponseEntity<>(loanResponseDTO, HttpStatus.CREATED);
    }

    @Operation(summary = "Consultar un préstamo por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Préstamo encontrado", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LoanResponseDTO.class))),
            @ApiResponse(responseCode = "404", description = "Préstamo no encontrado", content = @Content)
    })
    @GetMapping("/{id}")
    public ResponseEntity<LoanResponseDTO> getLoanById(@PathVariable Long id) {
        LoanResponseDTO loanResponseDTO = loanService.getLoanById(id);
        return new ResponseEntity<>(loanResponseDTO, HttpStatus.OK);
    }

    @Operation(summary = "Actualizar un préstamo por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Préstamo actualizado con éxito", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LoanResponseDTO.class))),
            @ApiResponse(responseCode = "404", description = "Préstamo no encontrado", content = @Content)
    })
    @PutMapping("/{id}")
    public ResponseEntity<LoanResponseDTO> updateLoan(@PathVariable Long id, @RequestBody LoanRequestDTO loanRequestDTO) {
        LoanResponseDTO loanResponseDTO = loanService.updateLoan(id, loanRequestDTO);
        return new ResponseEntity<>(loanResponseDTO, HttpStatus.OK);
    }

    @Operation(summary = "Eliminar un préstamo por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Préstamo eliminado con éxito", content = @Content),
            @ApiResponse(responseCode = "404", description = "Préstamo no encontrado", content = @Content)
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLoan(@PathVariable Long id) {
        loanService.deleteLoan(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

// === ARCHIVO: src/main/java/com/example/loansystem/service/LoanService.java ===
package com.example.loansystem.service;

import com.example.loansystem.dto.LoanRequestDTO;
import com.example.loansystem.dto.LoanResponseDTO;
import com.example.loansystem.model.Loan;
import com.example.loansystem.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Transactional
    public LoanResponseDTO applyLoan(LoanRequestDTO loanRequestDTO) {
        Loan loan = new Loan();
        loan.setAmount(loanRequestDTO.getAmount());
        loan.setInterestRate(loanRequestDTO.getInterestRate());
        loan.setApplicationDate(loanRequestDTO.getApplicationDate());
        loan.setStatus("pending");
        loan = loanRepository.save(loan);
        return convertToDTO(loan);
    }

    public LoanResponseDTO getLoanById(Long id) {
        Optional<Loan> loan = loanRepository.findById(id);
        return loan.map(this::convertToDTO).orElseThrow(() -> new RuntimeException("Loan not found"));
    }

    @Transactional
    public LoanResponseDTO updateLoan(Long id, LoanRequestDTO loanRequestDTO) {
        Optional<Loan> loan = loanRepository.findById(id);
        if (loan.isPresent()) {
            Loan updatedLoan = loan.get();
            updatedLoan.setAmount(loanRequestDTO.getAmount());
            updatedLoan.setInterestRate(loanRequestDTO.getInterestRate());
            updatedLoan.setStatus(loanRequestDTO.getStatus());
            loanRepository.save(updatedLoan);
            return convertToDTO(updatedLoan);
        } else {
            throw new RuntimeException("Loan not found");
        }
    }

    @Transactional
    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }

    private LoanResponseDTO convertToDTO(Loan loan) {
        LoanResponseDTO loanResponseDTO = new LoanResponseDTO();
        loanResponseDTO.setId(loan.getId());
        loanResponseDTO.setAmount(loan.getAmount());
        loanResponseDTO.setInterestRate(loan.getInterestRate());
        loanResponseDTO.setApplicationDate(loan.getApplicationDate());
        loanResponseDTO.setStatus(loan.getStatus());
        return loanResponseDTO;
    }
}

// === ARCHIVO: src/main/java/com/example/loansystem/repository/LoanRepository.java ===
package com.example.loansystem.repository;

import com.example.loansystem.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {}

// === ARCHIVO: src/main/java/com/example/loansystem/model/Loan.java ===
package com.example.loansystem.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private Double interestRate;

    @Column(nullable = false)
    private LocalDate applicationDate;

    @Column(nullable = false)
    private String status;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

// === ARCHIVO: src/main/resources/config/application.properties ===
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

// === ARCHIVO: src/main/resources/config/openapi.yaml ===
openapi: 3.0.1
info:
  title: Loan System API
  version: 1.0.0
paths:
  /api/loans:
    post:
      summary: Solicitar un préstamo
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/LoanRequestDTO'
      responses:
        '201':
          description: Préstamo solicitado con éxito
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/LoanResponseDTO'
        '400':
          description: Solicitud inválida
    get:
      summary: Listar todos los préstamos
      responses:
        '200':
          description: Lista de préstamos
          content:
            application/json:
              schema:
                type: array
                items:
                  $ref: '#/components/schemas/LoanResponseDTO'
  /api/loans/{id}:
    get:
      summary: Consultar un préstamo por ID
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: string
      responses:
        '200':
          description: Préstamo encontrado
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/LoanResponseDTO'
        '404':
          description: Préstamo no encontrado
    put:
      summary: Actualizar un préstamo por ID
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: string
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/LoanRequestDTO'
      responses:
        '200':
          description: Préstamo actualizado con éxito
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/LoanResponseDTO'
        '404':
          description: Préstamo no encontrado
    delete:
      summary: Eliminar un préstamo por ID
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: string
      responses:
        '204':
          description: Préstamo eliminado con éxito
        '404':
          description: Préstamo no encontrado
components:
  schemas:
    LoanRequestDTO:
      type: object
      properties:
        amount:
          type: number
        interestRate:
          type: number
        applicationDate:
          type: string
          format: date
        status:
          type: string
    LoanResponseDTO:
      type: object
      properties:
        id:
          type: string
        amount:
          type: number
        interestRate:
          type: number
        applicationDate:
          type: string
          format: date
        status:
          type: string

// === ARCHIVO: src/main/java/com/example/loansystem/dto/LoanRequestDTO.java ===
package com.example.loansystem.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;

public class LoanRequestDTO {

    @Schema(description = "Monto del préstamo", required = true)
    @NotNull(message = "El monto es obligatorio")
    @Positive(message = "El monto debe ser positivo")
    private Double amount;

    @Schema(description = "Tasa de interés del préstamo", required = true)
    @NotNull(message = "La tasa de interés es obligatoria")
    @Positive(message = "La tasa de interés debe ser positiva")
    private Double interestRate;

    @Schema(description = "Fecha de solicitud del préstamo", required = true)
    @NotNull(message = "La fecha de solicitud es obligatoria")
    private LocalDate applicationDate;

    @Schema(description = "Estado del préstamo (pendiente, aprobado, rechazado)")
    private String status;

    // Getters and setters
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

// === ARCHIVO: src/main/java/com/example/loansystem/dto/LoanResponseDTO.java ===
package com.example.loansystem.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;

public class LoanResponseDTO {

    @Schema(description = "ID del préstamo")
    private Long id;

    @Schema(description = "Monto del préstamo")
    private Double amount;

    @Schema(description = "Tasa de interés del préstamo")
    private Double interestRate;

    @Schema(description = "Fecha de solicitud del préstamo")
    private LocalDate applicationDate;

    @Schema(description = "Estado del préstamo (pendiente, aprobado, rechazado)")
    private String status;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

```
