package GPA;

import javax.swing.*;

/**
 * Created by student on 7/12/2017.
 */
public class GPA {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(null,
                "What is your grade?");

        int grade = Integer.parseInt(input);

        if (grade >= 90){
            JOptionPane.showMessageDialog(null,
                    "You got an A! Good Job.");
        }else if (grade >= 80){
            JOptionPane.showMessageDialog(null,
                    "You got a B. Nice work.");
        }else if (grade >= 70){
            JOptionPane.showMessageDialog(null,
                    "You got a C. I bet if this test had been on video games, you would have aced it.");
        }else if (grade >= 60){
            JOptionPane.showMessageDialog(null,
                    "You got a D. Good luck in summer school.");
        }else {
            JOptionPane.showMessageDialog(null,
                    "You got an F. Good job on entering summer school.");
        }
    }
}
