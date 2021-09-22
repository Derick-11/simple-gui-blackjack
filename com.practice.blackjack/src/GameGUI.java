import javax.swing.*;
import java.awt.*;

public class GameGUI {
    private JFrame frame;
    private ImageIcon backgroundIcon;
    private JLabel tableLabel;
    private JPanel playerSpace;
    private JLabel dealerSpace;

    public GameGUI() {
        backgroundIcon = new ImageIcon(this.getClass().getResource("/felt-table.jpeg"));
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        tableLabel = new JLabel(backgroundIcon);
        tableLabel.setLayout(new GridLayout(3,3));
        tableLabel.setSize(1000, 800);

        playerSpace = new JPanel();
        playerSpace.setBackground(Color.GRAY);
        playerSpace.setSize(50, 50);

        //player card space
//        gbc.anchor = GridBagConstraints.SOUTHWEST;
//        gbc.gridwidth = 2;
//        gbc.gridheight = 2;
//        tableLabel.add(playerSpace, gbc);

        frame = new JFrame("Blackjack");
        frame.add(tableLabel);
        frame.setSize(1000, 800);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
