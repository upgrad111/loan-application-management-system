# SpringMVC-Hibernate Assignment

The objective of this assignment is to create a monolithic application using JSP, JSTL, Spring MVC, Hibernate and MySQL. 

### Problem Statement

In this assignment, we will create a monolithic application using the following technologies
1.	JSP, JSTL                               (Front-end Web Page)
2.	Spring MVC                              (Backend)
3.	JdbcTemplate                            (Database)



### Expected Outcome

1. index.jsp should contain a form (Bootstrap form) which contains the input elements to take the following input for an application form
- Id
- Applicant Name
- Applicant E-mail
- Applicant Contact Number
- Loan Amount
- Applied Date

### Sample Output Screens

Loan Application Form

![Image Not Found](/src/main/webapp/resources/images/ApplicationForm.png)

Loan Applications List

![Image Not Found](/src/main/webapp/resources/images/Applicationslist.png)

Approve Reject Status

![Image Not Found](/src/main/webapp/resources/images/Approve_Reject.png)



### Project Structure


![Image Not Found](/src/main/webapp/resources/images/Project_Structure.PNG)

### API End Points
**(Note:: Each file in the boilerplate explains, what to be implemented in the form of comments )**

|  URL Mapping & Request |  Method | Description |
|----------|--------------|--------------|
|`@GetMapping("/")`                           | getHomePage() | This method by default should route to the index.jsp along with all the loan applications list fetched from backend|
|`@PostMapping("/saveLoanApplication")`                           | saveLoanApplication() | This method should take the model attribute of loan application sent from index.jsp and should save the loan application by calling saveLoanApplicationToDb() method on LoanApplicationService. This method should return ModelAndView along with all the loan applications to index.jsp|
|`@GetMapping("/approveLoan")`                           | approveLoan() | This method should take the loan id as request parameter and call approveLoan(loanId) method on LoanApplicationService to update the loan application and should return ModelAndView along with all the loan applications to index.jsp|
|`@GetMapping("/rejectLoan")`                           | rejectLoan() | This method should take the loan id as request parameter and call rejectLoan(loanId) methd on LoanApplicationService to update the loan application and should return ModelAndView along with all the loan applications to index.jsp |
|`@GetMapping("/deleteLoan")`                           | deleteLoan() | This method should take the loan id as request parameter and call deleeton(loanId) methd on LoanApplicationService to delete the loan application and should return ModelAndView along with all the loan applications to index.jsp |

