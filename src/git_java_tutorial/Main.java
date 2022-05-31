package git_java_tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello, git");
        System.out.println("----------");
        System.out.println("Hello SSE");

        final int NUM_FACTS = 10;
        for (int i = 0; i < NUM_FACTS; i++) {
            System.out.println(i + "! is " + factorial(i));
        }

        Scanner s = new Scanner(System.in);
        System.out.print( "Enter your name: "  );
        String name = s.nextLine();
        System.out.println( "Hello " + name + "!" );
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}
