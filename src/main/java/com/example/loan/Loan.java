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