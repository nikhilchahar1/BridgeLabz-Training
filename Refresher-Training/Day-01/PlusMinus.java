import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        float positive = 0, negative = 0, zero = 0;
        for (int i : arr) {
            if (i > 0) positive++;
            else if (i < 0) negative++;
            else zero++;
        }
        System.out.printf("%.6f%n", positive / arr.size());
        System.out.printf("%.6f%n", negative / arr.size());
        System.out.printf("%.6f%n", zero / arr.size());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        plusMinus(arr);

        sc.close();
    }
}