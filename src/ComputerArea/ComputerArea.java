package ComputerArea;

/**
 * Created by student on 7/11/2017.
 */
import java.util.Scanner; //Scanner is in the java.util package
public class ComputerArea {
    public static void main (String[] args) {
        // Create A Scanner object
        Scanner input = new Scanner (System.in);
        // Prompt the user to enter a radius
        System.out.print ("Enter a number for a radius: ");
        // Step 1: Read in Radius
        double radius = input.nextDouble();
        // Step 2: Compute Area
        double area = radius * radius * 3.14159;
                // Step 3: Display the Area
        System.out.println ("The area for circle of radius" + radius + " is " + area);
    }
}



