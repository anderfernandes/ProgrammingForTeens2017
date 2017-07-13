package GuessYourBirthday;

import javax.swing.*;

/**
 * Created by student on 7/13/2017.
 */
public class GuessYourBirthday {
    public static void main (String args[]){
        int playagain =0;
        int birthday = 0;

        // All variable    close, set1 set2 set3 set4 set5 birthday wrongbirthday playbutton
        while (playagain <= 100) {

            //Intro
            Integer close = JOptionPane.showConfirmDialog(null,
                    "Welcome to the Birthday Guesser!",
                    "Birthday Guesser",
                    JOptionPane.OK_CANCEL_OPTION);
            if (close == 2){
                break;
            }

            //ask user if they have a birthday in any sets
            Integer Set1 = JOptionPane.showConfirmDialog(null,
                    "Is your birthday on the 1,3,5,7,9,11,13,15,17,19,21,23,25,27,29, or 31? ",
                    "Set1",
                    JOptionPane.YES_NO_OPTION);
            Integer Set2 = JOptionPane.showConfirmDialog(null,
                    "Is your birthday on the 2,3,6,7,10,11,14,15,18,19,22,23,26,27,30, or 31?",
                    "Set2",
                    JOptionPane.YES_NO_OPTION);
            Integer Set3 = JOptionPane.showConfirmDialog(null,
                    "Is your birthday on the 4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,or 31? ",
                    "Set3",
                    JOptionPane.YES_NO_OPTION);
            Integer Set4 = JOptionPane.showConfirmDialog(null,
                    "Is your birthday on the 8,9,10,11,12,13,14,15,24,25,26,27,28,29,30, or 31?",
                    "Set4",
                    JOptionPane.YES_NO_OPTION);
            Integer Set5 = JOptionPane.showConfirmDialog(null,
                    "Is your birthday on the 16,17,18,19,20,21,22,23,24,25,26,27,28,29,30, or 31?",
                    "Set5",
                    JOptionPane.YES_NO_OPTION);

            //Set results convert to birthday variable
            if (Set1 == 0) {
                birthday = birthday + 1;
            } else {
                birthday = birthday + 1;
            }
            if (Set2 == 0) {
                birthday = birthday + 2;
            }
            if (Set3 == 0) {
                birthday = birthday + 4;
            }
            if (Set4 == 0) {
                birthday = birthday + 8;
            }
            if (Set5 == 0) {
                birthday = birthday + 16;
            }
            //asks user if the birthday is his/her
            Integer wrongbirthday = JOptionPane.showConfirmDialog(null,
                    birthday + " Is this your birthday?",
                    "I found out your birthday",
                    JOptionPane.YES_NO_OPTION);
            //tells user that this machine is always right
            if (wrongbirthday ==1){
                JOptionPane.showConfirmDialog(null,
                        "You put the wrong information in or you are a liar",
                        "Wrong Birthday?",
                        JOptionPane.OK_CANCEL_OPTION);
            }

            //play again button for user
            Integer playbutton = JOptionPane.showConfirmDialog(null,
                    "Do you want to play again?",
                    "Select",
                    JOptionPane.YES_NO_OPTION);
            if (playbutton == 1){
                break;
            }
        }



    }
}
