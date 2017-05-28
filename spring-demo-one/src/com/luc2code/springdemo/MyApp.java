package com.luc2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create the object
		ICoach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDaiyWorkout());
		
		System.exit(0);
		
	}

}
