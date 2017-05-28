package com.luc2code.springdemo;

public class BaseballCoach implements ICoach {
	
	//define a private field for the dependency
	private IFortuneService fortuneService;
	
	// define a constructor for the dependency injection
	public BaseballCoach(IFortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDaiyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
