package git_java_tutorial;

import java.util.Scanner;

public class JohannesMain {

    public static void main(String[] args) {

        // Write a "Hello World!" on to the console
        System.out.println("Hello World!");


        // Create two integer variables an sum them up
        int x;
        int y;
        int sum;

        x = 10;
        y = 8;
        sum = x + y;


        // Print out the sum of the two variables
        System.out.println(sum);


        // Print out "odd" if the sum is odd, and "even" if the sum is even
        if (sum % 2 == 1) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        
        // use the scanner to read in a String and print it out again
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        String string = myScanner.nextLine();  // Read user input
        System.out.println(string);

    }
}
