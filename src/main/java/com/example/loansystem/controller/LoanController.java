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