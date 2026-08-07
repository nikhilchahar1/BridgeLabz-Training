import java.util.*;

class I2Result {
    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;

            if (arr.get(i) < arr.get(j)) {
                while (j >= 0 && arr.get(j) > key) {
                    arr.set(j + 1, arr.get(j));
                    arr.set(j, key);
                    j--;
                }
            }

            for (int l : arr) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}

public class InsertionSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        I2Result.insertionSort2(n, arr);
        sc.close();
    }
}