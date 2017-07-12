package LeapYear;

import javax.swing.*;

/**
 * Created by instructor on 7/12/2017.
 */
public class LeapYear {
    public static void main(String args[]){
        String input = JOptionPane.showInputDialog(null,
                "Enter a year:");

        int year = Integer.parseInt(input);

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            JOptionPane.showMessageDialog(null,
                    year + " is a leap year.");
        } else {
            JOptionPane.showMessageDialog(null,
                    year + " is not a leap year.");
        }

    }
}
