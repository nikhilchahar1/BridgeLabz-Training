public class Pens {
	public static void main(String[] args) {
		
		int totalPens = 14;
        int students = 3;

        int pensPerStudent = (totalPens / students); /* Pens per student using division operator */

        int remainingPens = totalPens % students; // Remaining pens using modulus operator

        System.out.println("The pen per student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens); // Output the result
   
	}
}