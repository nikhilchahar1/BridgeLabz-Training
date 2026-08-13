package Review;

import java.util.*;

public class OrganizingContainers {
    public static String organizingContainers(List<List<Integer>> container) {
        long[] arr = new long[container.size()];
        long[] arr2 = new long[container.size()];
        for (int i = 0; i < container.size(); i++) {
            for (int j = 0; j < container.size(); j++) {
                long balls = container.get(i).get(j);
                arr[i] += balls;
                arr2[j] += balls;
            }
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if (Arrays.equals(arr, arr2)) {
            return "Possible";
        }
        return "Impossible";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            List<List<Integer>> container = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    row.add(sc.nextInt());
                }
                container.add(row);
            }
            System.out.println(organizingContainers(container));
        }
        sc.close();
    }
}
