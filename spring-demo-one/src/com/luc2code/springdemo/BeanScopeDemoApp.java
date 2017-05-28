package com.luc2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {


		// load the spring cong file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from the spring container
		//  For the bean id="myCoach" try this with :
		//    a) scope="singleton"   -> Default behaviour
		//    b) scope="prototype"   -> New object instance every time...
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		ICoach alphaCoach = context.getBean("myCoach", ICoach.class);
		
		// check to see if they are the same beans
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// close the context
		context.close();
		
		System.exit(0);
		
	}

}
