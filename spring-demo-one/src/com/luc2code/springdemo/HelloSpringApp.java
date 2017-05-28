package com.luc2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve the bean from the spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		
		// call methods on the bean
		System.out.println(theCoach.getDaiyWorkout());
		
		// lets call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
		
		System.exit(0);

	}

}
