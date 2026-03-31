public class UniversityFee {
	public static void main(String[] args) {
		
        double courseFee = 125000; // Fixed fee 
        double discountPercent = 10; // Discount percent

        double discountAmount = (discountPercent / 100) * courseFee;  /* Calculate discount amount */

        double finalFee = courseFee - discountAmount; // Calculate final amount after discount

        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalFee); // Output the result
    
	}
}