package model;

public class CardDraw {

    private String success;
    private String cards;
    private String image;
    private String value;
    private String suit;
    private String code;
    private String deck_id;
    private int remaining;

    public CardDraw(String success, String cards, String image, String value, String suit, String code, String deck_id, int remaining) {
        this.success = success;
        this.cards = cards;
        this.image = image;
        this.value = value;
        this.suit = suit;
        this.code = code;
        this.deck_id = deck_id;
        this.remaining = remaining;
    }

    public String getSuccess() {
        return success;
    }

    public String getCards() {
        return cards;
    }

    public String getImage() {
        return image;
    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String getCode() {
        return code;
    }

    public String getDeck_id() {
        return deck_id;
    }

    public int getRemaining() {
        return remaining;
    }
}
