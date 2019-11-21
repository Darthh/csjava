package chapter9;
import java.util.*;

public class hangmanTemplate {
/*
* Hangman Game || TEMPLATE V 1.0 By: Adrian Rodriguez-Arana | Jackson Laughney
*/

/*
* Game
*/
public static void hangman(Scanner input) {
// Variables
int tries = 0;
int maxTries;
int guessedLetter;

// Get user word to be guessed
int[] wordArray = getWord(input);

// User input max. number of tries
System.out.print("Maximum # of tries avaliable: ");
maxTries = input.nextInt();

/*
* Gameplay
*/

// Array with already made guesses
int[] guessCorrect = new int[wordArray.length];
int gc_index = 0;
int added_gc_index;

// Keep running guesses until no more tries or word found
while ((tries <= maxTries)) {
// Variables
added_gc_index = 0;
guessedLetter = wordGuess(input);
added_gc_index = checkPastGuess(guessCorrect, wordArray, guessedLetter, gc_index);
gc_index += added_gc_index;

// Clear Console
System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

// Check answer

// CODE

// Remind User of tries left
System.out.println("Tries Left: " + (maxTries - tries));

// If no input, just skip
if (guessedLetter == 0) {
System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
}

// Print amount of letters left
System.out.println((guessCorrect.length - gc_index) + " letters left");
}

/*
* Check if lost
*/
if (tries == maxTries) {
System.out.println("You Lost :(");
}

// End of game
System.out.println("Thanks for playing");
}

/*
* Get user Word to Guess
*/
public static int[] getWord(Scanner input) {
/*
* Method : Get word user wants to use for game
*/

// Get user input for word
System.out.println("Input Word: ");
String word = input.nextLine();
word = word.toLowerCase();

// Create an array and divide each latter of word into array
int[] wordArray = new int[word.length()];

// CODE
for (int i = 0; i < wordArray.length; i++) {
String current = String.valueOf(word.charAt(i));
wordArray[i] = current.hashCode();
}

// return array with letters from word
return wordArray;
}

/*
* Check User Answer
*/
public static boolean checkCorrectLetter(int guessedLetter, int[] guessCorrect, int[] wordArray, int gc_index) {
/*
* Method - Check if letter is correct
*/

// For each to check

// CODE

return false;
}

public static boolean letterUsedBefore(int guessedLetter, int[] guessCorrect) {
/*
* Method - Check if user has guessed letter before
*/

// For loop to check

// CODE

return false;
}

public static boolean checkAnswer(int[] wordArray, int[] guessCorrect) {
/*
* Method - Check if user has won
*/

// Variables
int correctLetters = 0;

// Check both list and add correct values to "correctLetters"

// CODE

// If all correct letters are there then return true
if (correctLetters == wordArray.length) {
return true;
}

// Else
return false;
}

public static int checkPastGuess(int[] guessCorrect, int[] wordArray, int guessedLetter, int gc_index) {
/*
* Method - Check user guess before
*/
int add_gc_index = 0;

// Check if user had gussed the letter correctly and before

// return
return add_gc_index;
}

public static boolean checkIfGuessed(int guessedLetter, int[] guessCorrect) {
/*
* Method - Check is word has been guessed
*/

// Variables
boolean used = false;

// Check if guess had been done

// CODE

// Return
return used;
}

public static int wordGuess(Scanner input) {
/*
* Method - Get user letter guess
*/
System.out.print("Enter letter: ");
String letter = input.nextLine();
return letter.hashCode();
}

/*
* Main Method
*/
public static void main(String[] args) {
/* Scanner Start */
Scanner input = new Scanner(System.in);

/* Program */
hangman(input);

/* Scanner Close */