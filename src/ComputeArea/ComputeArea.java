package ComputeArea;

import java.util.Scanner; // Scanner is in the java.util package

/**
 * Created by student on 7/11/2017.
 */
public class ComputeArea {
    public static void main(String[] args){
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user for radius
        System.out.print("Enter a number for radius: ");
        // Step 1: Read in radius
        double radius = input.nextDouble();
        //Step 2: Compute area
        double area = radius * radius * Math.PI;
        // Step 3: Display the area
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}