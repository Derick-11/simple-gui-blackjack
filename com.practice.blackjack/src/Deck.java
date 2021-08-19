import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {
    public ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<>();

        deck.add(new Card("Heart", "Two", 2));
        deck.add(new Card("Heart", "Three", 3));
        deck.add(new Card("Heart", "Four", 4));
        deck.add(new Card("Heart", "Five", 5));
        deck.add(new Card("Heart", "Six", 6));
        deck.add(new Card("Heart", "Seven", 7));
        deck.add(new Card("Heart", "Eight", 8));
        deck.add(new Card("Heart", "Nine", 9));
        deck.add(new Card("Heart", "Ten", 10));
        deck.add(new Card("Heart", "Jack", 10));
        deck.add(new Card("Heart", "Queen", 10));
        deck.add(new Card("Heart", "King", 10));
        deck.add(new Card("Heart", "Ace", 11));

        deck.add(new Card("Diamond", "Two", 2));
        deck.add(new Card("Diamond", "Three", 3));
        deck.add(new Card("Diamond", "Four", 4));
        deck.add(new Card("Diamond", "Five", 5));
        deck.add(new Card("Diamond", "Six", 6));
        deck.add(new Card("Diamond", "Seven", 7));
        deck.add(new Card("Diamond", "Eight", 8));
        deck.add(new Card("Diamond", "Nine", 9));
        deck.add(new Card("Diamond", "Ten", 10));
        deck.add(new Card("Diamond", "Jack", 10));
        deck.add(new Card("Diamond", "Queen", 10));
        deck.add(new Card("Diamond", "King", 10));
        deck.add(new Card("Diamond", "Ace", 11));

        deck.add(new Card("Club", "Two", 2));
        deck.add(new Card("Club", "Three", 3));
        deck.add(new Card("Club", "Four", 4));
        deck.add(new Card("Club", "Five", 5));
        deck.add(new Card("Club", "Six", 6));
        deck.add(new Card("Club", "Seven", 7));
        deck.add(new Card("Club", "Eight", 8));
        deck.add(new Card("Club", "Nine", 9));
        deck.add(new Card("Club", "Ten", 10));
        deck.add(new Card("Club", "Jack", 10));
        deck.add(new Card("Club", "Queen", 10));
        deck.add(new Card("Club", "King", 10));
        deck.add(new Card("Club", "Ace", 11));

        deck.add(new Card("Spade", "Two", 2));
        deck.add(new Card("Spade", "Three", 3));
        deck.add(new Card("Spade", "Four", 4));
        deck.add(new Card("Spade", "Five", 5));
        deck.add(new Card("Spade", "Six", 6));
        deck.add(new Card("Spade", "Seven", 7));
        deck.add(new Card("Spade", "Eight", 8));
        deck.add(new Card("Spade", "Nine", 9));
        deck.add(new Card("Spade", "Ten", 10));
        deck.add(new Card("Spade", "Jack", 10));
        deck.add(new Card("Spade", "Queen", 10));
        deck.add(new Card("Spade", "King", 10));
        deck.add(new Card("Spade", "Ace", 11));

        return deck;
    }
}