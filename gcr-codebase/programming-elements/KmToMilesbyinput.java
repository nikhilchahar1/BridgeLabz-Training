import java.util.Scanner;
public class KmToMilesbyinput {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();  // User input in kilometers

        double miles = km / 1.6; // Convert to miles using 1 mile = 1.6 km

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km"); // Output the result
   
	}
}