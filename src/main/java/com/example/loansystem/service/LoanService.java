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