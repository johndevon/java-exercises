package org.launchcode.java.studios;
import java.util.Scanner;

/**
 * Created by devonedmonds on 2/27/17.
 */
public class Area {

    public static void main(String[] args) {
        Double radius;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle you want to find the area of: ");
        radius = scanner.nextDouble();

        while (radius < 0) {

            System.out.print("Enter a postive number for radius: ");
            radius = scanner.nextDouble();
        }

        Double area = (Math.PI * radius * radius);

        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}
