import java.util.*;

public class RunningTime {

    public static int runningTime(List<Integer> arr) {
        // Write your code here
        int count = 0;

        for (int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;

            if (arr.get(i) < arr.get(j)) {
                while (j >= 0 && arr.get(j) > key) {
                    arr.set(j + 1, arr.get(j));
                    arr.set(j, key);
                    j--;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int result = runningTime(arr);
        System.out.println(result);
        sc.close();
    }
}