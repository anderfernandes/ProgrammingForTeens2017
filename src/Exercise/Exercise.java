package Exercise;

import javax.swing.*;




/**
 * Created by student on 7/12/2017.
 */


//Number calculator only addition

public class Exercise {

    public static void main(String args[]) {

        // Step 1 read numbers from user
        //userinput is a variable
        //Logic error never shown



        String userinput = JOptionPane.showInputDialog(null,
                "Enter a number",
                "Input",
                JOptionPane.INFORMATION_MESSAGE);
        //int defines the type we are using like double
        int number1 = Integer.parseInt(userinput);

        String userinput2 = JOptionPane.showInputDialog(null,
                "Enter another number",
                "Input",
                JOptionPane.INFORMATION_MESSAGE);

        int number2 = Integer.parseInt(userinput2);

        //Calculate the numbers
        int sum = number1 + number2;




        //Display result

        JOptionPane.showMessageDialog(null,
                number1 + " +" + number2 + " = " + sum,//sum
                "Result",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

