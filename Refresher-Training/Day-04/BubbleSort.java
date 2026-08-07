import java.util.*;

public class BubbleSort {
    public static void countSwaps(List<Integer> a) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < a.size() - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int curr = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, curr);
                    count++;
                }
            }
        }
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        countSwaps(a);
        sc.close();
    }
}