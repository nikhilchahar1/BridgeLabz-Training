import java.util.Scanner;
public class SumUntilZeroOrNegative {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double total = 0.0; // Variable to store the sum
        double value; // Variable to store user input
        
        // Infinite loop
        while (true) {
            // User input
            System.out.print("Enter a number (0 or negative to stop): ");
            value = sc.nextDouble();
            // Break if value is 0 or negative
            if (value <= 0)
                break;
            total += value;
        }
        // Print the total sum
        System.out.println("Total sum is: " + total);
    }
}