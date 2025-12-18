public class ProfitAndLoss {
	public static void main(String[] args) {

        double costPrice = 129; // Given cost price 
        
        double sellingPrice = 191; // Given selling price
        
        double profit = sellingPrice - costPrice; // Calculate profit
        
        double profitPercent = (profit / costPrice) * 100; // Calculate profit percentage
        
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent); // Display all values in a single print statement with multiline text
   
	}
}