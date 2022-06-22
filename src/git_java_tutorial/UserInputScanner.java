package git_java_tutorial;

import java.util.Scanner;

/**
 * A class to demonstrate the basic usage of the java Scanner class.
 *
 * @author Johannes Hufnagl
 */
class UserInputScanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myScanner.nextLine();  // Read user input
        System.out.println("Username is: " + userName);
        String birthday = myScanner.nextLine();  // Read user input
        System.out.println("birthday is: " + birthday);
        // Output user input

        // TODO: Read your birthday as input and print it to the console
    }
}