package GuessingBirthdays;

import javax.swing.*;

/**
 * Created by student on 7/13/2017.
 */
public class GuessingBirthdays {public static void main(String args[]){
    int total=0;
   int input1 = JOptionPane.showConfirmDialog(null,
          "Is your Birthday in this set of numbers? 1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31");
    if (input1 == 0) {
        input1 =total +1;
    }else input1=0;


   int input2 = JOptionPane.showConfirmDialog(null,
           "Is your Birthday in this set of numbers? 2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31");
    if (input2 == 0) {
        input2=total +2;}
        else input2=0;
    int input3 = JOptionPane.showConfirmDialog(null,
            "Is your Birthday in this set of numbers? 4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31");
    if (input3 == 0) {
        input3=total +4;}
        else input3=0;
    int input4 = JOptionPane.showConfirmDialog(null,
            "Is your Birthday in this set of numbers? 8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31");
    if (input4 == 0) {
        input4=total +8;}
        else input4=0;

    int input5 = JOptionPane.showConfirmDialog(null,
            "Is your Birthday in this set of numbers? 16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31");
            if (input5 == 0){
                input5=total + 16;
            }else input5=0;
            int birthday= input1+input2+input3+input4+input5;

            JOptionPane.showMessageDialog (null,
                    "Your birthday is the "+birthday+".",
            "Happy Birthday!",
                    JOptionPane.WARNING_MESSAGE);
}
}
