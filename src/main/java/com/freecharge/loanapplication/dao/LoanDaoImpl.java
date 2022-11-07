package com.freecharge.loanapplication.dao;



/*
 * Add the following annotations to LoanDaoImpl class
 * @Repository
 * @Transactional
 */

public class LoanDaoImpl implements LoanDao {

	
	/*
	 * Autowire SessionFactory instance
	 */
	@Override
	public boolean saveLoan(Loan loan) {
		/*
		 * Implement the logic to save the loan to the database
		 */
	}

	@Override
	public boolean deleteLoan(int loanId) {
		/*
		 * Implement the logic to delete the loan from the database
		 */
	}

	@Override
	public List<Loan> getAllLoans() {
		/*
		 * Implement the logic to retrieve all loan details from "loan_application_details" table 
		 * and return as List<Loan>
		 */
	}

	@Override
	public Loan getLoanById(int loanId) {
		/*
		 * Implement the logic to get the loan by Id and return the loan
		 */
		
	}

	@Override
	public boolean updateLoan(Loan loan) {
		/*
		 * Implement the logic to update the loan
		 */
	}
	
	
}
