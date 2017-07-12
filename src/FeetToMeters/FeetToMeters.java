package FeetToMeters;

import javax.swing.*;

/**
 * Created by student on 7/11/2017.
 */
public class FeetToMeters {
    //create main
    public static void main (String args[]){
        //Step 1: Read a value from the user
        String input = JOptionPane.showInputDialog (null,
                "Enter feet value ",
                "Converting Calculator",
        JOptionPane.QUESTION_MESSAGE);
        double feet = Double.parseDouble(input);
        //Step 2: Convert the value read to meters
        double meters = feet * .305;
        //Step3: Show the results
        JOptionPane.showMessageDialog (null,
                feet + " feet is equivalent to " + meters + " meters.",
        "Converting Calculater", JOptionPane.INFORMATION_MESSAGE);
    }
}
