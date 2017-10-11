package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSportConfig {
	
	// define bean for our happy fortune service
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	// define bean for our wrestling coach and inject dependency
	@Bean
	public Coach wrestlingCoach() {
//		WrestlingCoach myWrestlingCoach = new WrestlingCoach(happyFortuneService());
//		return myWrestlingCoach;
		return new WrestlingCoach(happyFortuneService());
	}
	
}
