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