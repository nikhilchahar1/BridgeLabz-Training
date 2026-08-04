import java.util.*;

class Result {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int h1Total = 0, h2Total = 0, h3Total = 0;
        for (int i : h1) {
            h1Total += i;
        }
        for (int i : h2) {
            h2Total += i;
        }
        for (int i : h3) {
            h3Total += i;
        }
        int i = 0, j = 0, k = 0;

        while (true) {

            if (h1.size() == i || h2.size() == j || h3.size() == k)
                return 0;
            if (h1Total == h2Total && h2Total == h3Total)
                return h1Total;
            if (h1Total >= h2Total && h1Total >= h3Total) {
                h1Total -= h1.get(i);
                i++;
            }
            else if (h2Total >= h1Total && h2Total >= h3Total) {
                h2Total -= h2.get(j);
                j++;
            }
            else {
                h3Total -= h3.get(k);
                k++;
            }
        }
    }
}

public class EqualStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of cylinders in each stack
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        List<Integer> h1 = new ArrayList<>();
        List<Integer> h2 = new ArrayList<>();
        List<Integer> h3 = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            h1.add(sc.nextInt());
        }
        for (int i = 0; i < n2; i++) {
            h2.add(sc.nextInt());
        }
        for (int i = 0; i < n3; i++) {
            h3.add(sc.nextInt());
        }
        int result = Result.equalStacks(h1, h2, h3);
        System.out.println(result);

        sc.close();
    }
}