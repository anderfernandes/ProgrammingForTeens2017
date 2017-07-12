package Addition;

import javax.swing.*;

/**
 * Created by student on 7/12/2017.
 */
public class Addition {public static void main (String args []) {
    //Step 1: Prompt user for a number
    String input = JOptionPane.showInputDialog(null,
            "Enter a number.",
            "Calculator",
            JOptionPane.QUESTION_MESSAGE);
    int number1 = Integer.parseInt(input);
    //Step 2: Prompt user for second number
    String input2 = JOptionPane.showInputDialog(null,
            "Enter a second number",
            "Calculator",
            JOptionPane.QUESTION_MESSAGE);
    int number2 = Integer.parseInt(input2);
    //Step 3; Display sum
    int sum = number1 + number2;
    JOptionPane.showMessageDialog (null, sum);
}
}
