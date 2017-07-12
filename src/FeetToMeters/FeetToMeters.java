package FeetToMeters;

import javax.swing.*;

/**
 * Created by instructor on 7/11/2017.
 */
public class FeetToMeters {
    // Create main
    public static void main(String args[]){
        // Step 1: Read a value from the user
        String input = JOptionPane.showInputDialog(null,
                "Enter a value in feet:",
                "Andersoft Feet to Meters Converter 1.0",
                JOptionPane.QUESTION_MESSAGE);

        double feet = Double.parseDouble(input);
        // Step 2: Convert the value read to meters

        double meters = feet * 0.305;

        // Step 3: Show the result

        JOptionPane.showMessageDialog(null,
                feet + " feet equals " + meters + " meters.",
                "Andersoft Feet to Meeters Converter 1.0",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
