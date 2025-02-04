package com.in31years.spring_boot_demo_project.game.copy;

import com.in31years.spring_boot_demo_project.game.GameRunner;
import com.in31years.spring_boot_demo_project.game.MarioGame;

public class App01GameBasic {

	public static void main(String[] args) {
		var game = new MarioGame();
		//var superContra = new SuperContra();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		

	}

}
