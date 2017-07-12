package Exercise1;

import javax.swing.*;

/**
 * Created by instructor on 7/12/2017.
 */
public class Exercise1 {
    public static void main(String args[]){

        // Step 1: Read numbers from the user
        String input = JOptionPane.showInputDialog(null,
                "Enter a number:");
        int number1 = Integer.parseInt(input);

        String input2 = JOptionPane.showInputDialog(null,
                "Enter another number:");
        int number2 = Integer.parseInt(input2);

        //Step 2: Calculate the sum of the numbers

        int sum = number1 + number2;

        // Step 3: Display the result
        JOptionPane.showMessageDialog(null,
                number1 == number2);
    }
}
