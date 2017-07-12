
import javax.swing.*;
/**
 * Created by student on 7/11/2017.
 */

public class InputDialog {
    public static void main (String args[]){
        //Get input from input dialog
        String input = JOptionPane.showInputDialog(null,
                "What is your name?",
                "Whazzup",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "hello," + input,
                "What's up," + input,
                JOptionPane.INFORMATION_MESSAGE);



    }
}
