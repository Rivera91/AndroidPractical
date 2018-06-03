package model;

public class CardShuffle {


    private String success;
    private String deck_id;
    private boolean shuffled;
    private int remaining;


//    public CardShuffle(String success, String deck_id, boolean shuffled, int remaining) {
//        this.success = success;
//        this.deck_id = deck_id;
//        this.shuffled = shuffled;
//        this.remaining = remaining;
//    }

    public String getSuccess() {
        return success;
    }

    public String getDeck_id() {
        return deck_id;
    }

    public boolean isShuffled() {
        return shuffled;
    }

    public int getRemaining() {
        return remaining;
    }



}
