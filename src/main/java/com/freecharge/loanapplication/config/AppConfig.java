package com.freecharge.loanapplication.config;


import com.freecharge.loanapplication.entity.Loan;

/*
 *  Add the following annotations to AppConfig class
 *  @Configuration
 *  @ComponentScan
 *  @PropertySource --> To read the properties for datasource and hibernate configurations from application.properties file
 */


public class AppConfig {
	
	
	/*
	 *  Define the Environment(org.springframework.core.env.Environment) variable and auto wire
	 */
	
	/*
	 * Define the bean definition for DataSource 
	 * Instantiate DriverManagerDataSource by setting the datasource configurations like driver, url, username,password
	 * Read the properties from application.properties from Environment variable
	 */
	
   
	/*
	 * Define the bean definition for LocalSessionFactoryBean
	 * Instantiate LocalSessionFactoryBean to set the DataSource and set the hibernate properties (show_sql,dialect,hbm2ddl)
	 */
 
  
	/*
	 * Define the bean definition for HibernateTransactionManager
	 * Instantiate HibernateTransactionManager by setting the SessionFactory
	 */
	
	
	
	
}
