import java.util.Scanner;
public class SumNaturalNumbersComparison {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // User input for number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if the number is a natural number
        if (number > 0) {

            int formulaSum = number * (number + 1) / 2;

            int loopSum = 0;
            for (int i = 1; i <= number; i++) {
                loopSum += i;
            }
            
            // Print both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
            
            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is a mismatch in computations.");
            }
        } else {
            
            // Print not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}