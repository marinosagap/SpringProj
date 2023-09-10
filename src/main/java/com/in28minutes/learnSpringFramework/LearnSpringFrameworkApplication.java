package com.in28minutes.learnSpringFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		var mario = new MarioGame();
		var supercontra = new SuperContraGame();
		var gameRunner = new GameRunner(supercontra);

		//running the game
		gameRunner.run();
	}

}
