import java.util.*;

class IResult {
    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int key = arr.get(arr.size() - 1);
        int j = arr.size() - 2;
        while (j >= 0 && arr.get(j) > key) {
            arr.set(j + 1, arr.get(j));
            j--;
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        arr.set(j + 1, key);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class InsertionSortPart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        IResult.insertionSort1(n, arr);
        sc.close();
    }
}