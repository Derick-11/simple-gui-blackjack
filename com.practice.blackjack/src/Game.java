import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {
    private Scanner scanner;

    private ArrayList<Card> currentGameDeck;
    private ArrayList<Card> playerHand;
    private String playerDecision;

    private int score;
    private boolean busted;
    private boolean newGame;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void initGame() {
        currentGameDeck = null;
        playerHand = new ArrayList<>();
        playerDecision = "";

        score = 0;
        busted = false;
        newGame = false;

        Deck deck = new Deck();
        currentGameDeck = deck.createDeck();
        Collections.shuffle(currentGameDeck);
    }

    public boolean startNewGame() {
        initGame();

        //Deal player initial hand
        playerHand.add(currentGameDeck.get(0));
        currentGameDeck.remove(0);
        playerHand.add(currentGameDeck.get(0));
        currentGameDeck.remove(0);

        //Start main game loop for *player*
        while(!busted)
        {
            ArrayList<Integer> indexAce = new ArrayList<>();
            score = 0;
            System.out.println("Your hand is: ");

            for(int i = 0; i < playerHand.size(); i++) {
                if(playerHand.get(i).getValue().equals("Ace") && playerHand.get(i).getScore() == 11) {
                    indexAce.add(i);
                    System.out.println("Number of Aces with score of 11: " + indexAce.size());
                }

                score +=  playerHand.get(i).getScore();

                //If changing the score of an Ace can prevent a Bust
                if(score > 21 && indexAce.size() > 0) {
                    System.out.println("Your unevaluated score is: " + score);
                    //Get the first unturned Ace
                    if(playerHand.get(indexAce.get(0)).getScore() == 11) {
                        playerHand.get(indexAce.get(0)).setScore(1);
                        System.out.println( "Ace at loc: " + 0 + ", now has score: " + playerHand.get(indexAce.get(0)).getScore() );
                        indexAce.remove(0);
                        score -= 10;
                        System.out.println("Adjusted score is now: " + score);
                    }
                    else {
                        continue;
                    }

                }
                System.out.print("|"+ playerHand.get(i).getSuit() + " " + playerHand.get(i).getValue() + "| ");
            }

            System.out.println("\nYour score is: " + score);

            //Loss/Win conditions
            if(score > 21) {
                System.out.println("You are over 21, you've busted.");
                busted = true;
                break;
            }
            else if(score == 21) {
                System.out.println("21!, Congrats you've won.");
                busted = true;
                break;
            }

            //Last logic in loop should be player response
            System.out.println("Would you like to 'hit' or 'stay'?");
            playerDecision = scanner.nextLine();
            if(playerDecision.equals("hit")) {
                commandHit();
            }
            else if(playerDecision.equals("stay")) {
                busted = true;
            }
        }

        //if you have Busted or Won, you have exited the loop
        System.out.println("Would you like to start a new game? (yes/no)");

        //potential increase in memory over time with recursive startNewGame() call
        //TODO: handle new game outside of Game class
        if(scanner.nextLine().equals("yes")) {
            startNewGame();
        }
        else {
            System.exit(0);
        }
        return false;
    }

    private void commandHit() {
        playerHand.add(currentGameDeck.get(0));
        currentGameDeck.remove(0);
    }
}
