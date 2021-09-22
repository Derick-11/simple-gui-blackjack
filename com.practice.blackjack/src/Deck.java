import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {
    public ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<>();

        deck.add(new Card("Heart", "Two", 2, "/two-heart.PNG"));
        deck.add(new Card("Heart", "Three", 3, "/three-heart.PNG"));
        deck.add(new Card("Heart", "Four", 4, "/four-heart.PNG"));
        deck.add(new Card("Heart", "Five", 5, "/five-heart.PNG"));
        deck.add(new Card("Heart", "Six", 6, "/six-heart.PNG"));
        deck.add(new Card("Heart", "Seven", 7, "/seven-heart.PNG"));
        deck.add(new Card("Heart", "Eight", 8, "/eight-heart.PNG"));
        deck.add(new Card("Heart", "Nine", 9, "/nine-heart.PNG"));
        deck.add(new Card("Heart", "Ten", 10, "/ten-heart.PNG"));
        deck.add(new Card("Heart", "Jack", 10, "/jack-heart.PNG"));
        deck.add(new Card("Heart", "Queen", 10, "/queen-heart.PNG"));
        deck.add(new Card("Heart", "King", 10, "/king-heart.PNG"));
        deck.add(new Card("Heart", "Ace", 11, "/ace-heart.PNG"));

        deck.add(new Card("Diamond", "Two", 2, "/two-diamond.PNG"));
        deck.add(new Card("Diamond", "Three", 3, "/three-diamond.PNG"));
        deck.add(new Card("Diamond", "Four", 4, "/four-diamond.PNG"));
        deck.add(new Card("Diamond", "Five", 5, "/five-diamond.PNG"));
        deck.add(new Card("Diamond", "Six", 6, "/six-diamond.PNG"));
        deck.add(new Card("Diamond", "Seven", 7, "/seven-diamond.PNG"));
        deck.add(new Card("Diamond", "Eight", 8, "/eight-diamond.PNG"));
        deck.add(new Card("Diamond", "Nine", 9, "/nine-diamond.PNG"));
        deck.add(new Card("Diamond", "Ten", 10, "/ten-diamond.PNG"));
        deck.add(new Card("Diamond", "Jack", 10, "/jack-diamond.PNG"));
        deck.add(new Card("Diamond", "Queen", 10, "/queen-diamond.PNG"));
        deck.add(new Card("Diamond", "King", 10, "/king-diamond.PNG"));
        deck.add(new Card("Diamond", "Ace", 11, "/ace-diamond.PNG"));

        deck.add(new Card("Club", "Two", 2, "/two-club.PNG"));
        deck.add(new Card("Club", "Three", 3, "/three-club.PNG"));
        deck.add(new Card("Club", "Four", 4, "/four-club.PNG"));
        deck.add(new Card("Club", "Five", 5, "/five-club.PNG"));
        deck.add(new Card("Club", "Six", 6, "/six-club.PNG"));
        deck.add(new Card("Club", "Seven", 7, "/seven-club.PNG"));
        deck.add(new Card("Club", "Eight", 8, "/eight-club.PNG"));
        deck.add(new Card("Club", "Nine", 9, "/nine-club.PNG"));
        deck.add(new Card("Club", "Ten", 10, "/ten-club.PNG"));
        deck.add(new Card("Club", "Jack", 10, "/jack-club.PNG"));
        deck.add(new Card("Club", "Queen", 10, "/queen-club.PNG"));
        deck.add(new Card("Club", "King", 10, "/king-club.PNG"));
        deck.add(new Card("Club", "Ace", 11, "/ace-club.PNG"));

        deck.add(new Card("Spade", "Two", 2, "/two-spade.PNG"));
        deck.add(new Card("Spade", "Three", 3, "/three-spade.PNG"));
        deck.add(new Card("Spade", "Four", 4, "/four-spade.PNG"));
        deck.add(new Card("Spade", "Five", 5, "/five-spade.PNG"));
        deck.add(new Card("Spade", "Six", 6, "/six-spade.PNG"));
        deck.add(new Card("Spade", "Seven", 7, "/seven-spade.PNG"));
        deck.add(new Card("Spade", "Eight", 8, "/eight-spade.PNG"));
        deck.add(new Card("Spade", "Nine", 9, "/nine-spade.PNG"));
        deck.add(new Card("Spade", "Ten", 10, "/ten-spade.PNG"));
        deck.add(new Card("Spade", "Jack", 10, "/jack-spade.PNG"));
        deck.add(new Card("Spade", "Queen", 10, "/queen-spade.PNG"));
        deck.add(new Card("Spade", "King", 10, "/king-spade.PNG"));
        deck.add(new Card("Spade", "Ace", 11, "/ace-spade.PNG"));

        return deck;
    }
}