package GPA;

import javax.swing.*;

/**
 * Created by student on 7/12/2017.
 */
public class GPA {public static void main (String args[]){
    String input = JOptionPane.showInputDialog (null,
            "What is your grade?");
    int grade = Integer.parseInt(input);
    if (grade >= 90){
        JOptionPane.showMessageDialog(null, "You got an A. Congrats nerd.");
    } else if (grade >= 80){
            JOptionPane.showMessageDialog(null,
                    "You got a B. :/ Nice try I guess.");
    }
    else if (grade >= 70){
        JOptionPane.showMessageDialog (null,
                "You got a C. Grades aren't everything...");
    }
    else if (grade >= 60){
        JOptionPane.showMessageDialog (null,
                "You got a D. Better hide that report card.");
    }
    else {
        JOptionPane.showMessageDialog(null,
                "I would tell you there was hope for that grade but then I would be a liar.");}
}
}
