import javax.swing.*;

public class GameGUI {
    private JFrame frame;
    private ImageIcon backgroundIcon;
    private JLabel myLabel;

    public GameGUI() {

        backgroundIcon = new ImageIcon(this.getClass().getResource("/felt-table.jpeg"));
        myLabel = new JLabel(backgroundIcon);
        myLabel.setSize(800, 600);

        frame = new JFrame("Blackjack");
        frame.add(myLabel);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
