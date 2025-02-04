package com.in31years.spring_boot_demo_project.game;

import com.in31years.spring_boot_demo_project.game.copy.GamingConsole;
import com.in31years.spring_boot_demo_project.game.copy.SuperContra;

public class GameRunner {
	//MarioGame game;
	GamingConsole game;
	public GameRunner(GamingConsole game){
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running the game "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
