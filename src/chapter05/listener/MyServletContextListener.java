package chapter05.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener	// use this annotation without need DD
public class MyServletContextListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// Code to initialize the database connection
		// and store it as a context attribute
		
		ServletContext sc = sce.getServletContext();	// ask the event for the ServletContext
		
		sc.setInitParameter("breed", "Great Dane");	// set init parameters for ServletContext
		// we don't need to use DD for all
		
		String dogBreed = sc.getInitParameter("breed");	// use the context to get the init parameter.
		
		
		
		Dog d = new Dog(dogBreed);	// Make a new Dog
		
		sc.setAttribute("dog", d);	// use the context to set attribute
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// code to close database connection
	}
}
