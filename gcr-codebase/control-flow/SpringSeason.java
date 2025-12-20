import java.util.Scanner;
public class SpringSeason{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date : "); // Take user input of date
        int date = sc.nextInt();
        System.out.println("Enter the month number : "); // Take user input of month
        int month = sc.nextInt();

        // Check dates and print the output
        if(date<20 && month<=3){
            System.out.println("Not a spring season");
        }
        else if (month >= 6 && date>20) {
            System.out.println("Not a spring season");
        }
        else{
            System.out.println("Its a spring season");
        }
    }
}