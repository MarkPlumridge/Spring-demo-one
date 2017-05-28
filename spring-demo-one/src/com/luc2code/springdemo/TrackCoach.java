package com.luc2code.springdemo;

public class TrackCoach implements ICoach {

	//define a private field for the dependency
	private IFortuneService fortuneService;
	
	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDaiyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It:" + fortuneService.getFortune();
	}

	// add an spring bean init method (when bean is created) - must be public void
	public void doMyStartupStuff() {
	System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a spring bean destroy method (when bean is destroyed by Spring container) - must be public void
	public void doMyCleanupStuff() {
	System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
	
	
	
	
}
