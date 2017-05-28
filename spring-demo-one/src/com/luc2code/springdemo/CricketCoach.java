package com.luc2code.springdemo;

public class CricketCoach implements ICoach {

	private IFortuneService fortuneService;

	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	// create a no-arg constructor
	public CricketCoach() {
	
		System.out.println("CricketCoach : inside no-arg Constructor");	
		
	}
	
	// our setter method for dependency injection
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method for dependency injection");	
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDaiyWorkout() {

		return "Practice fast bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {

		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter method for setEmailAddress");	
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method for setTeam");	
		this.team = team;
	}


	
}
