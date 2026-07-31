import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDS {

    public static List<Integer> reverseArray(List<Integer> a) {

        List li = new ArrayList<>();

        for (int i = a.size()-1; i >= 0; i--) {
            li.add(a.get(i));
        }
        return li;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        List<Integer> result = reverseArray(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}