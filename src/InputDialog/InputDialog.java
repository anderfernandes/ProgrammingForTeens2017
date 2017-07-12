package InputDialog;

/**
 * Created by student on 7/11/2017.
 */
import javax.swing. *;
public class InputDialog {
    public static void main (String[] args) {
        // Get input from input dialog
        String input = JOptionPane.showInputDialog(null, "What is your name?",
                "What's up", JOptionPane.QUESTION_MESSAGE) ;
        // Show the user a message
        JOptionPane.showMessageDialog(null,
                "Hello, " + input,
                "What's up, " + input,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
