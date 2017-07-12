
import javax.swing .*;
/**
 * Created by student on 7/12/2017.
 */
public class GPA {
    public static void main(String args[]) {

        String input = JOptionPane.showInputDialog(null,
                "what is your grade");

        int grade = Integer.parseInt(input);

        if (grade >= 90) {
            JOptionPane.showMessageDialog(null, "You got an A! Good job, yo");
        } else if (grade >= 80) {
            JOptionPane.showMessageDialog(null, "You got a B. Its cool bro");
        } else if (grade >= 70) {
            JOptionPane.showMessageDialog(null, "Go study.");
        } else if (grade > 60) {
            JOptionPane.showMessageDialog(null, "enjoy summer school.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Well you failed");
        }

    }
}

