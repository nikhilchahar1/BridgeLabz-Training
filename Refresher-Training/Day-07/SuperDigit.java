import java.util.*;

public class SuperDigit {

    public static int superDigit(int n, int k){
        if(n<10) return n;
        int sum = 0;
        for(char i : String.valueOf(n).toCharArray()){
            sum = sum+(i-'0');
        }
        sum*=k;
        return superDigit(sum, 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println("SuperDigit = "+superDigit(n,k));
    }
}