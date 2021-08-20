public class Card {
    private String suit;
    private String value;
    private int score;

    public Card(String suit, String value, int score) {
        this.suit = suit;
        this.value = value;
        this.score = score;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getValue() { return this.value; }

    public int getScore() { return this.score; }

    public void setScore(int score) { this.score = score; }
}
