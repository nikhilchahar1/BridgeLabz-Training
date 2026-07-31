import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        d = d % a.size();
        for (int i = 0; i < d; i++) {
            int first = a.get(0);
            for (int j = 0; j < a.size() - 1; j++) {
                a.set(j, a.get(j + 1));
            }
            a.set(a.size() - 1, first);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        List<Integer> result = rotLeft(a, d);
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}