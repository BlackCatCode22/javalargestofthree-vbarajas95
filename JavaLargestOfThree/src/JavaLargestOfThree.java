/* JavaLargestOfThree.java
 * Name: Vanessa Barajas
 * Date: 2/25/2023
 * References:
 *   https://www.w3schools.com/java/java_user_input.asp
 *   https://www.w3schools.com/java/java_conditions.asp
 *   https://www.w3schools.com/java/java_variables.asp
 *
 * input: three ints from user
 * processing: find the largest of the three ints with decision structures
 * output: the largest of three ints, the sum of three ints
 */

import java.util.Scanner;

public class JavaLargestOfThree {
    public static void main(String[] args) {
        System.out.println("\n\n The Largest of Three Program \n\n");

        // Create a scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first integer.
        System.out.println("\n\n Please type in an integer for number1: ");

        // Input user reply to number1
        int number1 = scanner.nextInt();

        // Prompt the user for the second integer.
        System.out.println("\n\n Okay, now type in the second integer for number2: ");

        // Input user reply to number2
        int number2 = scanner.nextInt();

        // Prompt the user for the third integer.
        System.out.println("\n\n Last time, enter the third and last integer for number3: ");

        // Input user reply to number3
        int number3 = scanner.nextInt();
        // Obtain the sum of the three numbers that user inputted
       int total = number1 + number2 + number3;

        System.out.println("\n The sum of " + number1 + " and " + number2 + " and " + number3 + " is: " + total);

        // Find the largest of the three integers using these if statements:
        if (number1 > number2){
            if (number1 >= number3)
                System.out.println(number1 + " is the largest number.");
            else
               System.out.println(number3 + " is the largest number.");
        } else {
            if (number2 >= number3)
                System.out.println(number2 + " is the largest number.");
            else
                System.out.println(number1 + " is the largest number.");

        }


    }

}

