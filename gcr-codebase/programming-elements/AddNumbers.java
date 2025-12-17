import java.util.Scanner;
class AddNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // first number input
        int b = sc.nextInt();  // second number input
        System.out.println("sum of " +a+ " and " +b+ " is " +(a+b)); //print sum of a and b
    }
}