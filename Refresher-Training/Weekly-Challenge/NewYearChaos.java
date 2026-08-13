import java.util.*;

public class NewYearChaos {

    public static void minimumBribes(List<Integer> q) {
        int totalBribe = 0;
        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < q.size() - 1; i++) {
                if (q.get(i) > q.get(i + 1)) {
                    int temp = q.get(i);
                    q.set(i, q.get(i + 1));
                    q.set(i + 1, temp);
                    totalBribe++;
                    swapped = true;
                }
            }
        }
        System.out.println(totalBribe);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> q = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                q.add(sc.nextInt());
            }
            minimumBribes(q);
        }
        sc.close();
    }
}