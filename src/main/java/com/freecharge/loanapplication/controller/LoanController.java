package com.freecharge.loanapplication.controller;


/*
 * Define the following annotations to LoanController class
 * @Controller
 * @RequestMapping -> set the path to api/v1
 */

public class LoanController {

	
	
   /*
    * Autowire the LoanApplicationServiceImpl
    */
	
	
	
	
	@GetMapping("/")
	public String getHomePage() {
	
		/*
		 * This method should return the view of index.jsp along with all loan application details
		 */
	
	}
	
	@PostMapping("/saveLoanApplication")
	public ModelAndView saveLoanApplication() {

		/*
		 * This method should take the loan details (from index.jsp) as the input and should return ModelAndView instance with index.jsp
		 * Using LoanApplicationServiceImpl's saveLoan method it should store the loan into the database
		 * Once the loan is successfully stored return all the loan application details
		 * If the loan application fails, send the error message to index.jsp
		 */
		 
	}
	
	@GetMapping("/approveLoan")
	public ModelAndView approveLoan() {
		/*
		 * This method should take the loanId as the input and should return ModelAndView instance with index.jsp
		 * Using LoanApplicationServiceImpl's approveLoan method to update the loan
		 * Once the loan is successfully approved return all the loan applications
		 * If it is failed,send the error message to index.jsp
		 */
	}
	
	@GetMapping("/rejectLoan")
	public ModelAndView rejectLoan() {
		/*
		 * This method should take the loanId as the input and should return ModelAndView instance with index.jsp
		 * Using LoanApplicationServiceImpl's rejectLoan method to update the loan
		 * Once the loan is successfully rejected return all the loan applications
		 * If it is failed,send the error message to index.jsp
		 */
	}
	
	@GetMapping("/deleteLoan")
	public ModelAndView deleteLoan(@RequestParam("loanId") int loanId) {
		/*
		 * This method should take the loanId as the input and should return ModelAndView instance with index.jsp
		 * Using LoanApplicationServiceImpl's deleteLoan method to delete the loan
		 * Once the loan is successfully deleted return all the loan applications
		 * If it is failed,send the error message to index.jsp
		 */
	}
	
	
}
