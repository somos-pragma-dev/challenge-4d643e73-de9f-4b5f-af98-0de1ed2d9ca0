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