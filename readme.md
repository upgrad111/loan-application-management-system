# Goal

The goal of this assignment is to create a monolithic application using Java Technologies like Java 8 / 11, Spring, Spring MVC, JSP, JSTL . SQL, Hibernate, MySQL , Maven and Git
 

### Problem Statement

Freecharge offers personal loans to its loyal customers. As part of it, Freecharge expects to create an online application, where customers can apply for a loan filling the application form.   Upon the successful submission of the application form, the Freecharge team will be able to see the application details and can decide whether to approve or reject the loan application. The team can also delete the application.

You are expected to create a spring mvc based monolithic application to fulfill this requirement using the following tech stack.

“*”Java 11
“*”Spring 5.1.5
“*”Hibernate  5.4.2
“*”JSP
“*”MySQL 8
“*”Maven
“*”Git



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


![Image Not Found](/src/main/webapp/resources/images/project_structure_v2.png)

### API End Points
**(Note:: Each file in the boilerplate explains, what to be implemented in the form of comments )**

|  URL Mapping & Request |  Method | Description |
|----------|--------------|--------------|
|`@GetMapping("/")`                           | getHomePage() | This method by default should route to the index.jsp along with all the loan applications list fetched from backend|
|`@PostMapping("/saveLoanApplication")`                           | saveLoanApplication() | This method should take the model attribute of loan application sent from index.jsp and should save the loan application by calling saveLoanApplicationToDb() method on LoanApplicationService. This method should return ModelAndView along with all the loan applications to index.jsp|
|`@GetMapping("/approveLoan")`                           | approveLoan() | This method should take the loan id as request parameter and call approveLoan(loanId) method on LoanApplicationService to update the loan application and should return ModelAndView along with all the loan applications to index.jsp|
|`@GetMapping("/rejectLoan")`                           | rejectLoan() | This method should take the loan id as request parameter and call rejectLoan(loanId) methd on LoanApplicationService to update the loan application and should return ModelAndView along with all the loan applications to index.jsp |
|`@GetMapping("/deleteLoan")`                           | deleteLoan() | This method should take the loan id as request parameter and call deleeton(loanId) methd on LoanApplicationService to delete the loan application and should return ModelAndView along with all the loan applications to index.jsp |

