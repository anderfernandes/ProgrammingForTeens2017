package MathGame;

import javax.swing.*;

/**
 * Created by student on 7/13/2017.
 */
public class MathGame {
    public static void main (String args[]){


        int x =0;
            while(x ==0 ) {

                int number1 = (int) (Math.random() * 100);
                int number2 = (int) (Math.random() * 100);


                String input = JOptionPane.showInputDialog(null,
                        "What is " + number1 + " + " + number2 + "? ");

                int answer = Integer.parseInt(input);
                int playagain = 0;

                while (number1 + number2 != answer) {

                    String cancel = JOptionPane.showInputDialog(null,
                            "Wrong! What is " + number1 + " + " + number2 + "?",
                            "Wrong Answer!",
                            JOptionPane.OK_OPTION);
                    int canceloption = Integer.parseInt(cancel);
                    if (canceloption == 2) {
                        break;
                    }
                }
                //if the answer is correct this message shows
                 JOptionPane.showMessageDialog(null,
                        "Great Job! Your answer is correct! " + answer);


            }

    }
}
