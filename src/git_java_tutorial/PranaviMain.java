package git_java_tutorial;

import java.util.Scanner;

public class PranaviMain {

    public static void main(String[] args) {
        System.out.println("hello world");
        int x;
        int y;
        int sum;

        x = 8;
        y = 8;
        sum = x + y;

        if (sum % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        String string = myScanner.nextLine();  // Read user input
        System.out.println(string);
    }
}