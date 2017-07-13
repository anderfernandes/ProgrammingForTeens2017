package Project1;
import javax.swing.*;
/**
 * Created by student on 7/12/2017.
 */
public class Project1 {
    public static void main(String args){
        int birthday = 0;
        String set1 = "1,3,5,7,9,11,14,15,17,19,21,23,25,27,29,31";
        String set2 =  "2,3,6,7,10,11,14,15,16,19,22,23,26,27,30,31";
        String set3 =  "4,5,6,7,12,13,14,15,15,20,21,22,23,28,29,30,31";
        String set4 =  "8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31";
        String set5 = "16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31";
//make question box
        String input = JOptionPane.showInputDialog(null,
                "is your birthday in this set? " + set1,
                JOptionPane.QUESTION_MESSAGE);

        //display numbers and yes or no
        int input1 = JOptionPane.showConfirmDialog(null, "Is your birthday on the " + set1);
        if (input1 == 0) {
            birthday=birthday+1;
        }
        int input2 = JOptionPane.showConfirmDialog(null, "Is your birthday on the " + set2);
        if (input2 == 0){
            birthday=birthday+2;
        }
        int input3 = JOptionPane.showConfirmDialog(null, "Is your birthday on the " + set3);
        if (input3 == 0){
            birthday=birthday +4;
        }
        int input4 = JOptionPane.showConfirmDialog(null, "Is your birthday on the " + set4);
        if (input4 == 0){
            birthday=birthday +8;
        }
        int input5 = JOptionPane.showConfirmDialog(null, "Is your birthday on the " + set5);
        if (input5 == 0){
            birthday = birthday + 16;
        }


        JOptionPane.showMessageDialog(null,"Your birthday is on the" + birthday );


    }
}
