/**
 * The main method is in this class.
 * @author Pruthvi Punwar
 * @author Tri Do
 * @author Yuxiao Zheng
 */
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Game game = new Game();
        });
    }
}