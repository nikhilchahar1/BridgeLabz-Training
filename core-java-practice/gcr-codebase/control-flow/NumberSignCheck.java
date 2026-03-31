import java.util.Scanner;
public class NumberSignCheck {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // User input for number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}