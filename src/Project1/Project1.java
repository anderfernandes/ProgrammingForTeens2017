package Project1;
import javax.swing.*;
/**
 * Created by student on 7/12/2017.
 */
public class Project1 {
    public static void main (String args[]){

      String input = JOptionPane.showInputDialog(null,
              "Enter a number:");
        int number1 = Integer.parseInt(input);

         String input2 = JOptionPane.showInputDialog(null,
               "enter another number:");

               int number2 = Integer.parseInt(input2);

        int sum = number1 + number2;

         JOptionPane.showMessageDialog(null, number1==number2
         );


    }
}
