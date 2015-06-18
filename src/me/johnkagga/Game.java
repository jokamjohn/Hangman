package me.johnkagga;

/**
 * Created by JohnKagga on 6/18/2015.
 */
public class Game {
    private String mAnswer;
    private String mHits;
    private String mMisses;

    public Game(String answer) {
        mAnswer = answer;
    }
    public boolean applyGuess(char letter){
        boolean isHit = mAnswer.indexOf(letter) >= 0;
        if (isHit){
            mHits += letter;
        }
        else {
            mMisses += letter;
        }
        return isHit;
    }
}
