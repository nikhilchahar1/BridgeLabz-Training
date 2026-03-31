import java.util.Scanner;
public class VolOfCylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the radius : ");
		double r = sc.nextInt(); // input radius
		System.out.print("enter the height : "); 
		double h = sc.nextInt(); // input height
		double v = 3.14*r*r*h; // calculate volume 
		System.out.println("Volume is : " +v); // print volume of cylinder
	}

}