package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
