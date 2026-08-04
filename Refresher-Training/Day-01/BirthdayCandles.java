import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int largest = 0, count = 0;
        for (int i : candles) {
            if (largest < i)
                largest = i;
        }
        for (int i : candles) {
            if (largest == i)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> candles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            candles.add(sc.nextInt());
        }
        int result = birthdayCakeCandles(candles);
        System.out.println(result);
    }
}