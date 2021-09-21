import java.util.Scanner;

public class BlackJackMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //Game Start
        System.out.println("Welcome to Blackjack");

        //GUI block
        GameGUI gameGUI = new GameGUI();

        //Start Game
        Game newGame = new Game();
        newGame.startNewGame();
    }
}