import java.util.*;

public class ArrayLeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> result = new ArrayList<>();
        d = d % a.size();
        for (int i = d; i < a.size(); i++) {
            result.add(a.get(i));
        }
        for (int i = 0; i < d; i++) {
            result.add(a.get(i));
        }
        return result;
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
        System.out.println(result);

        sc.close();
    }
}