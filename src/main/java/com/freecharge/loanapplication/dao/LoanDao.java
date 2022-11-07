package com.freecharge.loanapplication.dao;



public interface LoanDao {
	
    public boolean saveLoan(Loan loan);	
	public boolean deleteLoan(int loanId);
	public List<Loan> getAllLoans();
	public Loan getLoanById(int loanId);
	public boolean updateLoan(Loan employee);

}
