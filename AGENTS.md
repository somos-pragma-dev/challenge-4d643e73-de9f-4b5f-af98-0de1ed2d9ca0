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
- Tema: Java Spring Boot REST API
- Seniority: junior-l2
- Tipo: practical
- Título: Diseño y Desarrollo de una API REST en un Sistema de Gestión de Préstamos
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Definición del Modelo de Préstamo — objetivo: Definir el modelo de datos para los préstamos y sus validaciones. — entregable (NO resolver): Modelo de datos para préstamos con validaciones.
- Fase 2: Implementación de la API REST — objetivo: Implementar la API REST que permite consultar y crear préstamos. — entregable (NO resolver): API REST funcional con persistencia en H2.
- Fase 3: Documentación de la API con Swagger — objetivo: Documentar la API REST utilizando Swagger. — entregable (NO resolver): API REST con documentación completa en Swagger.
- Fase 4: Optimización y Refactorización de la API — objetivo: Optimizar y refactorizar la API para mejorar su rendimiento y mantenibilidad. — entregable (NO resolver): API REST optimizada y refactorizada.

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
// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>loan-management</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>Loan Management</name>
    <description>Loan Management System</description>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <properties>
        <java.version>21</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-boot-starter</artifactId>
            <version>3.0.0</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
// === ARCHIVO: src/main/java/com/example/loan/Loan.java ===
package com.example.loan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DecimalMin(value = "0.01", message = "El monto del préstamo debe ser mayor a cero.")
    private Double amount;

    @Min(value = 0, message = "La tasa de interés debe ser un valor entre 0 y 100.")
    @Max(value = 100, message = "La tasa de interés debe ser un valor entre 0 y 100.")
    private Double interestRate;

    private String startDate;
    private String endDate;
    private String status;

    // Getters and setters
}
// === ARCHIVO: src/main/java/com/example/loan/application/LoanService.java ===
package com.example.loan.application;

import com.example.loan.domain.Loan;
import com.example.loan.infrastructure.LoanRepository;
import org.springframework.stereotype.Service;
import javax.validation.Valid;
import java.util.List;

@Service
public class LoanService {
    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElse(null);
    }

    public Loan createLoan(@Valid Loan loan) {
        return loanRepository.save(loan);
    }

    public Loan updateLoan(Long id, @Valid Loan loan) {
        Loan existingLoan = loanRepository.findById(id).orElse(null);
        if (existingLoan!= null) {
            existingLoan.setAmount(loan.getAmount());
            existingLoan.setInterestRate(loan.getInterestRate());
            existingLoan.setStartDate(loan.getStartDate());
            existingLoan.setEndDate(loan.getEndDate());
            existingLoan.setStatus(loan.getStatus());
            return loanRepository.save(existingLoan);
        }
        return null;
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }
}
// === ARCHIVO: src/main/java/com/example/loan/infrastructure/LoanRepository.java ===
package com.example.loan.infrastructure;

import com.example.loan.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
// === ARCHIVO: src/main/java/com/example/loan/infrastructure/LoanRepositoryImpl.java ===
package com.example.loan.infrastructure;

import com.example.loan.domain.Loan;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Repository
public interface LoanRepositoryImpl extends JpaRepository<Loan, Long> {
}
// === ARCHIVO: src/main/java/com/example/loan/application/LoanController.java ===
package com.example.loan.application;

import com.example.loan.domain.Loan;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/loans")
@Validated
public class LoanController {

    @Autowired
    private LoanService loanService;

    @Operation(summary = "Obtener todos los préstamos")
    @GetMapping
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @Operation(summary = "Obtener préstamo por ID")
    @GetMapping("/{id}")
    public ResponseEntity<Loan> getLoanById(@PathVariable Long id) {
        Loan loan = loanService.getLoanById(id);
        if (loan!= null) {
            return ResponseEntity.ok(loan);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Crear un nuevo préstamo")
    @PostMapping
    public ResponseEntity<Loan> createLoan(@Valid @RequestBody Loan loan) {
        Loan createdLoan = loanService.createLoan(loan);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdLoan);
    }

    @Operation(summary = "Actualizar préstamo por ID")
    @PutMapping("/{id}")
    public ResponseEntity<Loan> updateLoan(@PathVariable Long id, @Valid @RequestBody Loan loan) {
        Loan updatedLoan = loanService.updateLoan(id, loan);
        if (updatedLoan!= null) {
            return ResponseEntity.ok(updatedLoan);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @Operation(summary = "Eliminar préstamo por ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLoan(@PathVariable Long id) {
        loanService.deleteLoan(id);
        return ResponseEntity.noContent().build();
    }
}
// === ARCHIVO: src/main/resources/application.properties ===
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
// === ARCHIVO: src/test/java/com/example/loan/application/LoanServiceTest.java ===
package com.example.loan.application;

import com.example.loan.domain.Loan;
import com.example.loan.infrastructure.LoanRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class LoanServiceTest {

    @Mock
    private LoanRepository loanRepository;

    @InjectMocks
    private LoanService loanService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllLoans() {
        Loan loan = new Loan();
        loan.setId(1L);
        loan.setAmount(1000.0);
        loan.setInterestRate(5.0);
        loan.setStartDate("2024-06-01");
        loan.setEndDate("2024-06-30");
        loan.setStatus("pendiente");
        List<Loan> loanList = new ArrayList<>();
        loanList.add(loan);
        when(loanRepository.findAll()).thenReturn(loanList);
        List<Loan> result = loanService.getAllLoans();
        assertEquals(1, result.size());
    }

    @Test
    public void testGetLoanById() {
        Loan loan = new Loan();
        loan.setId(1L);
        loan.setAmount(1000.0);
        loan.setInterestRate(5.0);
        loan.setStartDate("2024-06-01");
        loan.setEndDate("2024-06-30");
        loan.setStatus("pendiente");
        when(loanRepository.findById(1L)).thenReturn(Optional.of(loan));
        Loan result = loanService.getLoanById(1L);
        assertEquals(1L, result.getId());
    }

    @Test
    public void testCreateLoan() {
        Loan loan = new Loan();
        loan.setId(1L);
        loan.setAmount(1000.0);
        loan.setInterestRate(5.0);
        loan.setStartDate("2024-06-01");
        loan.setEndDate("2024-06-30");
        loan.setStatus("pendiente");
        when(loanRepository.save(loan)).thenReturn(loan);
        Loan result = loanService.createLoan(loan);
        assertEquals(1L, result.getId());
    }

    @Test
    public void testUpdateLoan() {
        Loan loan = new Loan();
        loan.setId(1L);
        loan.setAmount(1000.0);
        loan.setInterestRate(5.0);
        loan.setStartDate("2024-06-01");
        loan.setEndDate("2024-06-30");
        loan.setStatus("pendiente");
        when(loanRepository.findById(1L)).thenReturn(Optional.of(loan));
        when(loanRepository.save(loan)).thenReturn(loan);
        Loan result = loanService.updateLoan(1L, loan);
        assertEquals(1L, result.getId());
    }

    @Test
    public void testDeleteLoan() {
        doNothing().when(loanRepository).deleteById(1L);
        loanService.deleteLoan(1L);
        verify(loanRepository, times(1)).deleteById(1L);
    }
}
// === ARCHIVO: src/main/resources/openapi.yaml ===
openapi: 3.0.0
info:
  title: Loan Management API
  description: API for managing loans
  version: 1.0.0
paths:
  /api/loans:
    get:
      summary: Get all loans
      operationId: getAllLoans
      responses:
        '200':
          description: Successful operation
    post:
      summary: Create a new loan
      operationId: createLoan
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Loan'
      responses:
        '201':
          description: Loan created
  /api/loans/{id}:
    get:
      summary: Get loan by ID
      operationId: getLoanById
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: integer
      responses:
        '200':
          description: Successful operation
        '404':
          description: Loan not found
    put:
      summary: Update loan by ID
      operationId: updateLoan
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: integer
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Loan'
      responses:
        '200':
          description: Loan updated
        '404':
          description: Loan not found
    delete:
      summary: Delete loan by ID
      operationId: deleteLoan
      parameters:
        - name: id
          in: path
          required: true
          schema:
            type: integer
      responses:
        '204':
          description: Loan deleted
components:
  schemas:
    Loan:
      type: object
      properties:
        id:
          type: integer
        amount:
          type: number
        interestRate:
          type: number
        startDate:
          type: string
        endDate:
          type: string
        status:
          type: string

```
