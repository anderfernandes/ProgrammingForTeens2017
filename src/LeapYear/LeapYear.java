package LeapYear;

import javax.swing.*;

/**
 * Created by student on 7/12/2017.
 */
public class LeapYear {
    public static void main(String[]args){
        String input = JOptionPane.showInputDialog(null,
                "Name a year.");
        int year = Integer.parseInt(input);
        if (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0){
            JOptionPane.showMessageDialog(null, "This year is a leap year.");
        }else {
            JOptionPane.showMessageDialog(null, "This year is not a leap year.");
        }
    }
}
