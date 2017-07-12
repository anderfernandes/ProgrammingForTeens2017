package InputDialog;

import javax.swing.*;

/**
 * Created by student on 7/11/2017.
 */
public class InputDialog {
    public static void main(String[] args){
        // Get input from input dialog
        String input = JOptionPane.showInputDialog(null,
                "What is your name?",
                 "Sign in",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Welcome to the Center of the Earth, " + input,
                 "What's up!",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
