import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GStudent implements Comparable<GStudent> {
    String name;
    int score;

    public GStudent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(GStudent other) {
        return Integer.compare(this.score, other.score);
    }

    @Override
    public String toString() {
        return "Student{name = '" + name + "', score = " + score + "}";
    }
}

public class GenericInterface {
    public static void main(String[] args) {

        List<GStudent> studentList = new ArrayList<>();
        studentList.add(new GStudent("Anthon", 75));
        studentList.add(new GStudent("Nile", 82));
        studentList.add(new GStudent("Ken", 98));
        studentList.add(new GStudent("Clara", 81));

        System.out.println("Before Sorting:");
        for (GStudent s : studentList) {
            System.out.println(s);
        }

        Collections.sort(studentList);

        System.out.println("\nAfter Sorting by Score:");
        for (GStudent s : studentList) {
            System.out.println(s);
        }
    }
}