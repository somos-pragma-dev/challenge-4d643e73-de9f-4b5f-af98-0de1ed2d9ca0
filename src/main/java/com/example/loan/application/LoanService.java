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