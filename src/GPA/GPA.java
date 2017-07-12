package GPA;

import javax.swing.*;

/**
 * Created by instructor on 7/12/2017.
 */
public class GPA {
    public static void main(String args[]){
        String input = JOptionPane.showInputDialog(null,
                "What is your grade?");

        int grade = Integer.parseInt(input);

        if (grade >= 90){
            JOptionPane.showMessageDialog(null,
                    "You got an A! Good job, yo!");
        } else if (grade >= 80){
            JOptionPane.showMessageDialog(null,
                    "You got a B. It's OK, I guess.");
        } else if (grade >= 70){
            JOptionPane.showMessageDialog(null,
                    "You got a C. Get outta the computer and go study!");
        } else if (grade >= 60){
            JOptionPane.showMessageDialog(null,
                    "You got a D. Enjoy summer school, bruh!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "F stands for FAIL!!!");
        }
    }
}
