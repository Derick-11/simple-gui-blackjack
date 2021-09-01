import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    private Scanner scanner;

    private ArrayList<Card> currentGameDeck;
    private ArrayList<Card> playerHand;
    private ArrayList<Card> dealerHand;
    private String playerDecision;

    private int playerScore;
    private int dealerScore;
    private boolean busted;
    private boolean newGame;
    private boolean dealerTurn;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void initGame() {
        currentGameDeck = null;
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
        playerDecision = "";

        playerScore = 0;
        dealerScore = 0;
        busted = false;
        newGame = false;
        dealerTurn = false;

        Deck deck = new Deck();
        currentGameDeck = deck.createDeck();
        Collections.shuffle(currentGameDeck);
    }

    public void startNewGame() {
        initGame();
        playerGameLoop();
    }

    public boolean playerGameLoop() {
        //Deal player initial hand
        playerHand.add(currentGameDeck.get(0));
        currentGameDeck.remove(0);
        playerHand.add(currentGameDeck.get(0));
        currentGameDeck.remove(0);

        //Start main game loop for *player*
        while(!busted)
        {
            ArrayList<Integer> indexAce = new ArrayList<>();
            playerScore = 0;

            System.out.println("Your hand is: ");

            for(int i = 0; i < playerHand.size(); i++) {
                if(playerHand.get(i).getValue().equals("Ace") && playerHand.get(i).getScore() == 11) {
                    indexAce.add(i);
//                    System.out.println("Number of Aces with score of 11: " + indexAce.size());
                }

                playerScore +=  playerHand.get(i).getScore();

                //If changing the score of an Ace can prevent a Bust
                if(playerScore > 21 && indexAce.size() > 0) {
//                    System.out.println("Your unevaluated score is: " + score);
                    //Get the first unturned Ace
                    if(playerHand.get(indexAce.get(0)).getScore() == 11) {
                        playerHand.get(indexAce.get(0)).setScore(1);
//                        System.out.println( "Ace at loc: " + 0 + ", now has score: " + playerHand.get(indexAce.get(0)).getScore() );
                        indexAce.remove(0);
                        playerScore -= 10;
//                        System.out.println("Adjusted score is now: " + score);
                    }
                    else {
                        continue;
                    }
                }
                System.out.print("|"+ playerHand.get(i).getSuit() + " " + playerHand.get(i).getValue() + "| ");
            }

            System.out.println("\nYour score is: " + playerScore);

            //  Loss/Win conditions
            if(playerScore > 21) {
                System.out.println("You are over 21, you've busted.");
                busted = true;
                break;
            }
            else if(playerScore == 21) {
                System.out.println("21!, Congrats you've won.");
                busted = true;
                break;
            }

            //Last logic in loop should be player response
            System.out.println("Would you like to 'hit' or 'stay'?");
            playerDecision = scanner.nextLine();
            if(playerDecision.equals("hit")) {
                playerHand.add(commandHit());
            }
            else if(playerDecision.equals("stay")) {
//                dealerGameLoop();
            }
        }

        //TODO: test return to finish game
        //if you have Busted or Won, you have exited the loop
        System.out.println("Would you like to start a new game? (yes/no)");

        //potential increase in memory over time with recursive startNewGame() call
        //handle new game outside of Game class
        if(scanner.nextLine().equals("yes")) {
            startNewGame();
        }
        else {
            System.exit(0);
        }
        return false;
    }

    public boolean dealerGameLoop() {
        //Deal player initial hand
        dealerHand.add(currentGameDeck.get(0));
        currentGameDeck.remove(0);
        dealerHand.add(currentGameDeck.get(0));
        currentGameDeck.remove(0);

        //Start main game loop for *player*
        while(!busted)
        {
            ArrayList<Integer> indexAce = new ArrayList<>();
            dealerScore = 0;

            System.out.println("Dealer hand is: ");

            for(int i = 0; i < dealerHand.size(); i++) {
                if(dealerHand.get(i).getValue().equals("Ace") && dealerHand.get(i).getScore() == 11) {
                    indexAce.add(i);
//                    System.out.println("Number of Aces with score of 11: " + indexAce.size());
                }

                dealerScore +=  dealerHand.get(i).getScore();

                //If changing the score of an Ace can prevent a Bust
                if(dealerScore > 21 && indexAce.size() > 0) {
//                    System.out.println("Your unevaluated score is: " + score);
                    //Get the first unturned Ace
                    if(dealerHand.get(indexAce.get(0)).getScore() == 11) {
                        dealerHand.get(indexAce.get(0)).setScore(1);
//                        System.out.println( "Ace at loc: " + 0 + ", now has score: " + playerHand.get(indexAce.get(0)).getScore() );
                        indexAce.remove(0);
                        dealerScore -= 10;
//                        System.out.println("Adjusted score is now: " + score);
                    }
                    else {
                        continue;
                    }
                }
                System.out.print("|"+ dealerHand.get(i).getSuit() + " " + dealerHand.get(i).getValue() + "| ");
            }

            System.out.println("\nYour score is: " + dealerScore);

            //  Loss/Win conditions
            if(dealerScore > 21) {
                System.out.println("Dealer is over 21, you have won.");
                busted = true;
                break;
            }
            else if(dealerScore == 21) {
                System.out.println("Dealer has 21, you lose.");
                busted = true;
                break;
            }

            //Dealer should try to reach 21, or get above player score
            if(dealerScore < playerScore) {
                System.out.println(dealerScore + " vs " + playerScore);
                try {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch(Exception e) {
                    System.out.println(e);
                }
                dealerHand.add(commandHit());
            }
            else if(dealerScore > playerScore) {
                System.out.println(dealerScore + " vs " + playerScore);
                System.out.println("Dealer has won.");
                busted = true;
            }
        }
        return false;
    }

    private Card commandHit() {
        Card newCard = currentGameDeck.get(0);
        currentGameDeck.remove(0);
        return newCard;
    }
}
