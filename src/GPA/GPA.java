package GPA;

import javax.swing.*;

/**
 * Created by student on 7/12/2017.
 */
public class GPA {

    public static void main(String args[]) {

        //input dialog to get users grade
        String input = JOptionPane.showInputDialog(null,
                "Enter your grade",
                "GPA calculator",
                JOptionPane.INFORMATION_MESSAGE);

        int grade = Integer.parseInt(input);

        if (grade >= 90) {
            JOptionPane.showMessageDialog(null,
                    "You got an A! Great Job!",
                    "GPA",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (grade >= 80) {
            JOptionPane.showMessageDialog(null,
                    "You got a B :( ");

        } else if (grade >= 70) {
            JOptionPane.showMessageDialog(null,
                    "You got a C? What were you thinking?");

        } else if (grade >= 60) {
            JOptionPane.showMessageDialog(null,
                    "You got a D... How do you know how to operate this computer?");
        } else {
            JOptionPane.showMessageDialog(null,
                    "You got an F");


        }
    }
}