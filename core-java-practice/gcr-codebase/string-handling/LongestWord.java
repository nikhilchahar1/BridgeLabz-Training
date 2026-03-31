import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input 
        String sentence = sc.nextLine();

        // Putting words into an array 
        String[] words = sentence.split(" ");

        // Finding the longest word
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        
        // Output
        System.out.println("Longest Word: " + longest);
    }
}
