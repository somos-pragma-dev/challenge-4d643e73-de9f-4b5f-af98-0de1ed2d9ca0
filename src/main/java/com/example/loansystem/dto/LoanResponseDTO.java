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