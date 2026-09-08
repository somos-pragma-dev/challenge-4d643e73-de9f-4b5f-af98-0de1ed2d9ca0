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