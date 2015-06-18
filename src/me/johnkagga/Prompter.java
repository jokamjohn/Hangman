package me.johnkagga;

import java.io.Console;

/**
 * Created by JohnKagga on 6/18/2015.
 */
public class Prompter {
    private Game mGame;

    public Prompter(Game game) {
        mGame = game;
    }

    /*
    this method gets a guess from the user and checks whether it is a hit or miss
     */
    public boolean promptForGuess(){
        Console console = System.console();
        String guessAsString = console.readLine("Enter your guess: ");
        Character guess = guessAsString.charAt(0);
        return mGame.applyGuess(guess);
    }
}
