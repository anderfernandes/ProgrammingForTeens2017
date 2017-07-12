package FeetToMeters;

import java.util.Scanner;

/**
 * Created by student on 7/11/2017.
 */
public class FeetToMeters {
    //create main
    public static void main(String[] args){
        //Step 1: Read a value from the user
        Scanner input = new Scanner(System.in);
        System.out.print("How many feet do you need to convert?");
        //Step 2: Convert the value read to meters
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        //Step 3: Show the result
        System.out.println(feet + " is " + meters + " meters.");
    }
}
