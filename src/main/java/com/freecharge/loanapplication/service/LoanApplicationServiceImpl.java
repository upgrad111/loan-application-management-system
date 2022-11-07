package com.freecharge.loanapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freecharge.loanapplication.dao.LoanDaoImpl;
import com.freecharge.loanapplication.entity.Loan;

/*
 * Add the following annotations to the LoanApplicationServiceImpl class
 * @Service
 */
public class LoanApplicationServiceImpl implements ILoanApplicationService {
	
	/*
	 * Autowrire LoanDaoImpl instance
	 */
	@Override
	public Loan saveLoan(Loan loan) {
	/*
	 * Implement the logic to save the loan using LoanDaoImpl method
	 */
	}

	@Override
	public Loan getLoanById(int loanId) {		
		/*
		 * Implement the logic to get the loan by id using LoanDaoImpl method
		 */
	}

	@Override
	public List<Loan> getAllLoans() {
		/*
		 * Implement the logic to get all the loans by using LoanDaoImpl method
		 */
		
	}

	@Override
	public boolean approveLoan(int loanId) {
		/*
		 * Implement the logic to approve the loan by using LoanDaoImpl method
		 * and return the appropriate status as boolean value
		 */
	}

	@Override
	public boolean rejectLoan(int loanId) {
		
		/*
		 * Implement the logic to reject the loan by using LoanDaoImpl method
		 * and return the appropriate status as boolean value
		 */
		}

	
	@Override
	public boolean deleteLoan(int loanId) {
	/*
	 * Implement the logic to delete loan by using LoanDaoImpl method
	 */
	}
}
