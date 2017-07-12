package CircleRadius;

import java.util.Scanner;

/**
 * Created by student on 7/11/2017.
 */
public class CircleRadius {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius");
        double radius = input.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("The area for circle of radius " + radius + " is " + area);
    }
}
