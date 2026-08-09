import java.util.*;

public class SherlockArray {
    public static String balancedSums(List<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int right = arr.size() - 1;
        int rightSum = 0;
        int leftSum = sum;
        while (right >= 0) {
            leftSum -= arr.get(right);
            if (leftSum == rightSum) return "YES";
            right--;
            rightSum += arr.get(right + 1);
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            String result = balancedSums(arr);
            System.out.println(result);
        }
        sc.close();
    }
}