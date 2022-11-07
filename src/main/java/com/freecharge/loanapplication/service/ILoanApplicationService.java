package com.freecharge.loanapplication.service;



public interface ILoanApplicationService {
	
	public Loan saveLoan(Loan loanApplication);
	public Loan getLoanById(int loanId);
	public List<Loan> getAllLoans();
	public boolean approveLoan(int loanId);
	public boolean rejectLoan(int loanId);
	public boolean deleteLoan(int loanId);

}
