package com.hrishikesh.learningspringframework;

import com.hrishikesh.learningspringframework.game.GameRunner;
import com.hrishikesh.learningspringframework.game.MarioGame;
import com.hrishikesh.learningspringframework.game.Packman;
import com.hrishikesh.learningspringframework.game.SuperContra;

public class App01_Gamingbasic {
	public static void main(String args[]) {
//		var game=new MarioGame();
//		var game=new SuperContra();
		var game=new Packman();
		var gameRunner=new GameRunner(game);
		                  //here wiring of dependency takes place
						  //game is a dependency of gamerunner.
		
		gameRunner.run();
	}
	
	
}
