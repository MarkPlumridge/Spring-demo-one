package com.luc2code.springdemo;

import java.util.Random;

public class MPFortuneService implements IFortuneService {

	@Override
	public String getFortune() {

		String [] fortunes = {
				"You've just won the lotto",
				"You're going to live a long and happy life"
		};
		
		Random rand = new Random();
		
		int index = rand.nextInt(2);
		
		return fortunes[index];
	}

}
