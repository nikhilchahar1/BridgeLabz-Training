import java.util.Scanner;
public class SumUntilZero {  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total = 0.0; // Variable to store the sum
        double value; // Variable to store user input
        
        // Loop until user enters 0
        while (true) {
            // User input
            System.out.print("Enter a number (0 to stop): ");
            value = sc.nextDouble();
            if (value == 0)
                break;
            // Add value to total
            total += value;
        }
        // Print the total sum
        System.out.println("Total sum is: " + total);
    }
}