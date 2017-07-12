package InputDialog;

import javax.swing.*;

/**
 * Created by student on 7/11/2017.
 */
public class InputDialog {public static void main (String args []){
    //Get input from input dialog
    String input = JOptionPane.showInputDialog(null,
            "Enter Credentials.",
            "Identify",
            JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog (null,
            "Welcome, " + input,
            "Permission Granted, " + input,
    JOptionPane.INFORMATION_MESSAGE);
}
}
