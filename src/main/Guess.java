package main;

/**
 *
 * @author Claudio
 */
public class Guess {

    private String word;
    private int hit;
    private boolean possible;

    public Guess() {
        this.word = "";
        this.hit = -1;
        this.possible = true;
    }

    public String getWord() {
        return word;
    }

    public int getHit() {
        return hit;
    }

    public boolean isPossible() {
        return possible;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public void setPossible(boolean possible) {
        this.possible = possible;
    }

}
