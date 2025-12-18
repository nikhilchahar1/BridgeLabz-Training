import java.util.Scanner;
public class SideOfSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Read perimeter from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side (Perimeter = 4 * side)
        double side = perimeter / 4;

        // Output the results
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

	}
}