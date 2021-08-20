import java.util.Scanner;

public class BlackJackMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //Game Start
        System.out.println("Welcome to Blackjack");

        //Start Game
        Game newGame = new Game();
        newGame.startNewGame();
    }
}