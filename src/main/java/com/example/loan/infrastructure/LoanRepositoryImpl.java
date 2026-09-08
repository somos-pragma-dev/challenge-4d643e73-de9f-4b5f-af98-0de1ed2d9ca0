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