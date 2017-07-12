package GPA;

/**
 * Created by student on 7/12/2017.
 */
import javax.swing.*;
public class GPA {
    public static void main (String[] args) {
        String input = JOptionPane.showInputDialog(null, "What is your grade?");
                int grade = Integer.parseInt(input);
                if (grade >= 90) {
                JOptionPane.showMessageDialog(null, "You got an A, A great job!");}
                else if (grade >= 80) {JOptionPane.showMessageDialog(null, "You got a B, But now get an A!");}
                else if (grade >= 70) {JOptionPane.showMessageDialog(null, "You got a C you Can do better!");}
                else if  (grade >= 60) {JOptionPane.showMessageDialog(null, "You got a D, Do you even care!?");}
                else if (grade >= 50) {JOptionPane.showMessageDialog(null,
                        "You got an F, which means Failure in life!");}

    }
}
