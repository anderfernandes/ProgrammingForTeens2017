package Addition;

import javax.swing.*;

/**
 * Created by student on 7/12/2017.
 */
public class Addition {
    public static void main(String[] args){
        // Ask user for two numbers
        String input = JOptionPane.showInputDialog(null,
                "Please input a number:",
                "Number 1",
                JOptionPane.QUESTION_MESSAGE);
        int number1 = Integer.parseInt(input);
        String input2 = JOptionPane.showInputDialog(null,
               "Please input another number:",
                "Number 2",
                JOptionPane.QUESTION_MESSAGE);
        int number2 = Integer.parseInt(input2);
        //Compute sum
        int sum = number1 + number2;
        //Display the result
        JOptionPane.showMessageDialog(null,
                number1 + " + " + number2 + " = " + sum,
                "Your total is...",
                JOptionPane.INFORMATION_MESSAGE);
    }
}