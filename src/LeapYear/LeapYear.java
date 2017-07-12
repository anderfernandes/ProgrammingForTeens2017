package LeapYear;

import javax.swing.*;

/**
 * Created by student on 7/12/2017.
 */
public class LeapYear {
    public static void main(String args[]){

        //asks user what year it is
        String input = JOptionPane.showInputDialog(null,
                "Enter a year to find out if its a leap year",
                "Leap Year",
                JOptionPane.QUESTION_MESSAGE);
        //converts the input to an integer
        int year = Integer.parseInt(input);

        //Sees if the year can be divided by 4 and not by 100, if not, goes to the or divided by 400
        if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0)) {
            JOptionPane.showMessageDialog(null,
                    year + " is a leap year");
        } else {
            JOptionPane.showMessageDialog(null,
                    year  +" is not a leap year");
        }




    }
}
