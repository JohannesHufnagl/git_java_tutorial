package git_java_tutorial;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello, git");
        System.out.println("----------");
        System.out.println("Hello SSE");

        final int NUM_FACTS = 100;
        for (int i = 0; i < NUM_FACTS; i++) {
            System.out.println(i + "! is " + factorial(i));
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}
