import java.util.Scanner;

public class Recursion {

    public static int factorial(int n) {
        // Write your code here
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial = " + result);
        sc.close();
    }
}