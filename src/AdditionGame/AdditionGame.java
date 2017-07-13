package AdditionGame;

import javax.swing.*;

/**
 * Created by student on 7/13/2017.
 */
public class AdditionGame {public static void main (String args[]){
    int number1 = (int)(Math.random()*100);
    int number2 = (int)(Math.random()*100);

    String input = JOptionPane.showInputDialog (null,
            "What is "+ number1 + " + " + number2 + "?");
    int answer = Integer.parseInt(input);
    while (number1+number2 != answer){
        number1 = (int)(Math.random()*100);
         number2 = (int)(Math.random()*100);
        input = JOptionPane.showInputDialog(null,
                "Incorrect. What is "+ number1 + " + " + number2 + "?");
        answer = Integer.parseInt(input);
    }
    JOptionPane.showMessageDialog(null,
            "Congrats! The answer is " + answer);
}
}
