class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public Student(String name) {
        this(name, 0, "Not assigned");
    }

    public Student() {
        this("Not known", 0, "Not assigned");
    }

    @Override
    public String toString() {
        return "name : " + name + ", age : " + age + ", course : " + course;
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sam");
        Student s3 = new Student("Mani", 20, "Computer Science");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}