package GPA;

import javax.swing.*;

/**
 * Created by student on 7/12/2017.
 */
public class GPA {
    public static void main(String[]args){
        String input = JOptionPane.showInputDialog(null, "What is your grade?");
        int grade = Integer.parseInt(input);
        if (grade >= 90){
            JOptionPane.showMessageDialog(null, "You got an A!");
        }   else if (grade>= 80){
            JOptionPane.showMessageDialog(null, "You got an B.");
        } else if (grade>= 70){
            JOptionPane.showMessageDialog(null, "You got an C.");
        } else if (grade>= 60){
            JOptionPane.showMessageDialog(null, "You got an D.");
        } else {
            JOptionPane.showMessageDialog(null, "You got an F."); 
        }
    }
}
