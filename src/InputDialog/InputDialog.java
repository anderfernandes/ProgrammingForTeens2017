package InputDialog;

import javax.swing.*;

/**
 * Created by student on 7/11/2017.
 */
public class InputDialog {
    public static void main(String[]args){
        String input = JOptionPane.showInputDialog(null,"What is your name?",
                "Know why?", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showInputDialog(null, "hello, " + input,
                "I'n coming, " + input, JOptionPane.INFORMATION_MESSAGE);
    }
}
