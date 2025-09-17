/*
 * Name: Fernie Gonzalez
 * Date: 9-16-25
 * Purpose: InClass 3 - This program calculates the volume and surface area 
 *          of a cube using Math.pow() based on user input for the side length.
 */

import java.util.Scanner;

public class InClass3_Fernie_Gonzalez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.print("Please enter the length of the side of the cube: ");
        
        // Step 2: Read the user's input and store it in a variable.
        double side = input.nextDouble();

        // Step 3: Calculate the volume of the cube (side^3).
        double volume = Math.pow(side, 3);

        // Step 4: Calculate the surface area of the cube (6 × side^2).
        double surfaceArea = 6 * Math.pow(side, 2);

        // Step 5: Print the results.
        System.out.println("The volume of the cube is " + volume);
        System.out.println("The surface area of the cube is " + surfaceArea);

        input.close();
    }
}
