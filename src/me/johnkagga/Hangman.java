package me.johnkagga;

public class Hangman {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game("treehouse");

        System.out.print( game.applyGuess('t'));
    }
}
