import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BlackJackMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //Game Start
        System.out.println("Welcome to Blackjack, type 'yes' to start a new game. Or 'no' to exit.");
        String userInput = scanner.nextLine();

        if(userInput.equals("yes")) {
            //Prepare the deck to deal out the first hands
            Deck deck = new Deck();
            ArrayList<Card> gameDeck = deck.createDeck();
            Collections.shuffle(gameDeck);

            //Start Game
            Game newGame = new Game(gameDeck);
        }
        else {
            System.out.println("Blackjack game has exited.");
        }
    }
}