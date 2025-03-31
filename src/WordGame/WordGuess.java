package WordGame;

import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    private String wordToGuess;
    private char[] guessedLetters;
    private int attempts;

    public WordGuess(String[] wordList, int maxAttempts) {
        Random rand = new Random();
        this.wordToGuess = wordList[rand.nextInt(wordList.length)];
        this.guessedLetters = new char[this.wordToGuess.length()];
        this.attempts = maxAttempts;

        for (int i = 0; i < this.guessedLetters.length; i++) {
            this.guessedLetters[i] = '_';
        }
    }

    public String play() {
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.println("You have " + attempts + " attempts left.");
            System.out.println("Current word: " + String.valueOf(guessedLetters));
            System.out.print("Guess a letter: ");

            String input = scanner.nextLine().toLowerCase();
            if (input.isEmpty()) {
                System.out.println("Please enter a valid letter.");
                continue;
            }

            char guess = input.charAt(0);

            if (processGuess(guess)) {
                System.out.println("Correct!");
            } else {
                System.out.println("The guessed letter is incorrect!");
                attempts--;
            }

            if (String.valueOf(guessedLetters).equals(wordToGuess)) {
                System.out.println("Congratulations! You guessed the word: " + wordToGuess);

                return "win!!";
            }
        }

        if (attempts == 0) {
            System.out.println("Game Over! The word was: " + wordToGuess);
        }

        scanner.close();

        return "loose";


    }

    private boolean processGuess(char letter) {
        boolean letterFound = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter) {
                guessedLetters[i] = letter;
                letterFound = true;
            }
        }
        return letterFound;
    }
}
