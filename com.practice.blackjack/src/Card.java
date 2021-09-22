public class Card {
    private String suit;
    private String value;
    private int score;
    private String imageFile;

    public Card(String suit, String value, int score) {
        this.suit = suit;
        this.value = value;
        this.score = score;
    }
    public Card(String suit, String value, int score, String file) {
        this.suit = suit;
        this.value = value;
        this.score = score;
        this.imageFile = file;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getValue() { return this.value; }

    public int getScore() { return this.score; }

    public void setScore(int score) { this.score = score; }

    public String getImageFile() { return this.imageFile; }
}
