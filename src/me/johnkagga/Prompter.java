package me.johnkagga;

import java.io.Console;
import java.util.Scanner;

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
        System.out.print("Enter your guess:");
        Scanner scanner = new Scanner(System.in);
        String guessAsString = scanner.next();
        char guess = guessAsString.charAt(0);
        return mGame.applyGuess(guess);
    }
}
