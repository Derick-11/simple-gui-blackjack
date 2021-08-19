import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public Game(ArrayList<Card> gameDeck) {
        ArrayList<Card> currentGameDeck = gameDeck;
        ArrayList<Card> playerHand = new ArrayList<>();
        String playerDecision;
        int score = 0;
        boolean busted = false;

        //Deal player initial hand
        playerHand.add(currentGameDeck.get(0));
        currentGameDeck.remove(0);
        playerHand.add(currentGameDeck.get(0));
        currentGameDeck.remove(0);

        //Start main game loop
        while(!busted)
        {
            boolean ace = false;
            System.out.println("Your hand is: ");
            for(int i = 0; i < playerHand.size(); i++) {
                System.out.print("|"+ playerHand.get(i).getSuit() + " " + playerHand.get(i).getValue() + "| ");
                score += playerHand.get(i).getScore();

            }

            System.out.println("Would you like to 'hit' or 'stay'?");

            busted = true;
        }
    }

    public ArrayList<Card> addCardToHand(ArrayList<Card> hand, Card card) {
        hand.add(card);
        return hand;
    }

    public String analyzeScore(int currentScore, int nextCardScore) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String userDecision = "stay";

        score = currentScore + nextCardScore;
        //TODO: handle Ace value change condition
        if(score > 21) {
            System.out.println("That's: " + score + "You have busted. Game Over.");
            System.exit(0);
        }
        else {
            System.out.println("You currently stand at: " + score);
            System.out.println("Would you like to 'hit' or 'stay'?");
            userDecision = scanner.nextLine();
        }
        return userDecision;
    }
}
