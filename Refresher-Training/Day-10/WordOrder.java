import java.util.*;

public class WordOrder{

    public static List<Integer> wordOrder(List<String> li){
        HashMap<String, Integer> map = new LinkedHashMap<>();
        for(String i : li){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map.size());
        List<Integer> list = new ArrayList<>();
        for(int i : map.values()){
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> li = new ArrayList<>();
        while(n-- > 0){
            li.add(sc.next());
        }
        for(int i : wordOrder(li)){
            System.out.print(i+" ");
        }
    }
}