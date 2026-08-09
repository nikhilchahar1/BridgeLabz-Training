import java.util.*;

public class CircularArrayRotation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        k = k % a.size();
        List<Integer> li = new ArrayList<>();
        for (int i : queries) {
            int idx = (i - k + a.size()) % a.size();
            li.add(a.get(idx));
        }
        return li;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        List<Integer> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(sc.nextInt());
        }
        List<Integer> result = circularArrayRotation(a, k, queries);
        for (int x : result) {
            System.out.println(x);
        }
        sc.close();
    }
}