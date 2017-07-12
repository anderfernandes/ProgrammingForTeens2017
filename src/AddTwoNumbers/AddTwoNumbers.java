package AddTwoNumbers;

/**
 * Created by student on 7/12/2017.
 */
import javax.swing. *;
public class AddTwoNumbers {
    public static void main (String[] args) {
        //Ask for first number
        String input = JOptionPane.showInputDialog(null,
                "Input a number.",
                "Addition",
                JOptionPane.PLAIN_MESSAGE) ;
        int number1 = Integer.parseInt(input);
        //Ask for second number
         input = JOptionPane.showInputDialog(null,
                 "Input a number to add to the first number.",
                "Addition",
                 JOptionPane.PLAIN_MESSAGE) ;
         int number2 = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,
                number1 + " + " + number2 + " = " + (number1 + number2),
                "Addition",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
