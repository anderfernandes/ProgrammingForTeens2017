package FeetToMeters;

/**
 * Created by student on 7/11/2017.
 */
import java.util.Scanner;
public class FeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //read value from user
        System.out.print("Enter a number for feet: ");
        double feet = input.nextDouble();
        //convert to meters
        double meters = feet *0.305;
        //display result
        System.out.print("The measure of " + feet + " ft. is " + meters + " meters");
    }
}
