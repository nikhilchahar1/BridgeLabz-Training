import java.util.*;

public class IcecreamParlor {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++){
                if (i == j) continue;
                if (arr.get(i) + arr.get(j) == m)
                    return Arrays.asList(i + 1, j + 1);
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            List<Integer> result = icecreamParlor(m, arr);
            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}