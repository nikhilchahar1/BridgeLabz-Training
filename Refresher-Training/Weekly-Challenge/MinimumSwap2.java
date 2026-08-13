import java.util.*;

public class MinimumSwap2 {

    static int minimumSwaps(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i + 1) {
                int curr = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = curr;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumSwaps(arr));
        sc.close();
    }
}