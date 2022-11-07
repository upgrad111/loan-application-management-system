package com.freecharge.loanapplication.config;



/*
 * Override the following methods and return the appropriate classes
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	/*
	 * Return the ApplicationConfiguration class
	 */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    
    /*
     * Return the WebMvcConfig class
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
    
    /*
     * Return the array of URL patterns
     */

    @Override
    protected String[] getServletMappings() {
        return null;
    }
}
