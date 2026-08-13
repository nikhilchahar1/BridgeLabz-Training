import java.util.*;

public class DavisStaircase {

    public static int stepPerms(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        return stepPerms(n - 1) + stepPerms(n - 2) + stepPerms(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while (s-- > 0) {
            int n = sc.nextInt();
            System.out.println(stepPerms(n));
        }

        sc.close();
    }
}