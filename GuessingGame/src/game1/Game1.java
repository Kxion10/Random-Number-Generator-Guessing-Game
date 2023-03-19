package game1;

import java.util.Scanner;

import java.util.Random;

public class Game1 {
// add a loop to repeat new game if time allows
	
	public static void main(String[] args) 
	{
		// generate answer to guessing game using RNG
		Random random = new Random();
		int answer = random.nextInt(51);
		
		
		//introduction to game
		System.out.println("Welcome to the Guessing game!");
		
		System.out.println("You can only guess interger numbers from 0 to 50.");
		
		//System.out.println(answer); debugging line
		
		//activate scanner for input
		
		Scanner scanner = new Scanner(System.in);
		
		// counter for tries
		int guesscounter = 0;
		
		while (true) {
			//prompt a guess from the user
			System.out.println("Please enter your guess:");
		
			// guess stored
			int userguess = scanner.nextInt ();
		
			// # of guess go up per guess as the loop runs again
			guesscounter ++;
		
		//if answer is right
			if (userguess == answer) 
			{
				System.out.println("Congrats the answer is: " + answer + ". You win!");
				System.out.println("You got it right, nice guess!");
				System.out.println("It took you " + guesscounter +" tries." );
				
				// end the loop
				break;
			}
		//if the answer is wrong
			
				else if (userguess > answer)
					{
					System.out.println("You guessed too high, try again.");
					}
				else
					System.out.println("You guessed too low, try again.");
		

	}
		scanner.close();
}
}