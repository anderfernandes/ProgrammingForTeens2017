package DisplayTime;

/**
 * Created by student on 7/11/2017.
 */
import java.util.Scanner;
public class DisplayTime {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        // Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        int minutes = seconds / 60; // Find minutes in seconds
        int remainingSeconds = seconds % 60; // Seconds Remaining
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds ");
        //Add the numbers

    }
}
