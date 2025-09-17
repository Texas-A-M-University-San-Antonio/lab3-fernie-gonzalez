/*
 * Name: Fernie Gonzalez
 * Date: 9-16-25
 * Purpose: Lab 3 - This program calculates the future value of a home
 *          using the compound interest formula A = P * (1 + r)^t.
 */

import java.util.Scanner;

public class Lab3_Fernie_Gonzalez {
    public static void main(String[] args) {
        // Declare Scanner
        Scanner input = new Scanner(System.in);

        // Step 1: Prompt user for initial home value
        System.out.print("Please enter the initial value of the home: ");
        double initialValue = input.nextDouble();

        // Step 2: Prompt user for number of elapsed years
        System.out.print("Please enter the number of elapsed years: ");
        int years = input.nextInt();

        // Step 3: Prompt user for interest rate
        System.out.print("Please enter the interest rate: ");
        double interestRate = input.nextDouble();

        // Step 4: Convert percentage to decimal
        interestRate = interestRate / 100;

        // Step 5: Calculate final value using compound interest formula
        double finalValue = initialValue * Math.pow(1 + interestRate, years);

        // Step 6: Display result
        System.out.printf("The final value of the home is: %.2f%n", finalValue);

        input.close();
    }
}
