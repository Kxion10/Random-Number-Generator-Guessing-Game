# Random-Number-Generator-Guessing-Game

This is a simple number guessing game.

This program utlizes Java's random number generator method and picks a random number between 0-50 and prompts
the user to guess the correct number.

The scanner method takes in the user's input as a guess and compares it to the choosen random number.

"if" statements are utilized to give hints. 

If the answer is smaller in value to the random number, the program will tell the user that thier answer is too small and that the user should guess higher.

If the answer is larger in value to the random number, the program will tell the user that thier answer is too large and that the user should guess lower.

If the answer equals the random number, the user is congradulated and is asked if they want to play again. 

A while loop is utilized to prompt the user if they want to keep playing. If the user responds "yes", the program picks a picks a new random number and prompts the user to guess again.

If the user responds no, the loop is broken using the "break" statement.
