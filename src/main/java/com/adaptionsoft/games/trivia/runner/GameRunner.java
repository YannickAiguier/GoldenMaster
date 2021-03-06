
package com.adaptionsoft.games.trivia.runner;
import java.io.PrintStream;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;


public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {
		run(System.out, new Random());

	}

	public static void run(PrintStream out, Random random) {
		Game aGame = new Game(out);

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

		Random rand = random;

		do {

			aGame.roll(rand.nextInt(5) + 1);

			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}



		} while (notAWinner);
	}
}
