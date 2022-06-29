import java.util.Scanner;

public class Noormain {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int x;
        int y;
        int sum;

        x = 10;
        y = 20;
        sum = x + y;
        System.out.println(sum);
        if (sum % 2 == 1) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        String string = myScanner.nextLine();  // Read user input
        System.out.println(string); }
}

