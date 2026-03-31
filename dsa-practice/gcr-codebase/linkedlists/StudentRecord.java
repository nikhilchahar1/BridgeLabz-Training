class Node{
    int rollNo;
    String name;
    int age;
    char grade;
    Node next;
    
    // Node Constructor
    Node(int rollno, String name, int age, char grade){
        this.rollNo = rollno;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecord{
    Node head;
    Node tail;

    // Method to insert student record at beginning
    void insertAtBeginning(int rollno, String name, int age, char grade){
        
        Node newNode = new Node(rollno, name, age, grade);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Method to insert student record at end 
    void insertAtEnd(int rollno, String name, int age, char grade){

        Node newNode = new Node(rollno, name, age, grade);

        if(head == null){
            head = tail = newNode;
            return;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    // Method to delete record
    void deleteRecord(int rollno){
        
        if(head == null){
            System.out.println("There is no record");
            return;
        }

        Node temp = head;

        while(temp != null){
            if(temp.next.rollNo == rollno){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }

    // Method to search student 
    void searchStudent(int rollno){
        Node temp = head;

        while(temp != null){
            if(temp.rollNo == rollno){
                System.out.println("Student's Roll No. : " + temp.rollNo);
                System.out.println("Student's Name : " + temp.name);
                System.out.println("Student's Age : " + temp.age);
                System.out.println("Student's Grade : " + temp.grade);
                return;
            }
            temp = temp.next; 
        }
        System.out.println("Student not found");
    }

    // Method to display students
    void displayStudents(){
        Node temp = head;
        if(head == null){
            System.out.println("No Student record");
            return;
        }
        else{
            while(temp != null){
                System.out.println(temp.name);
                temp = temp.next;
            }
        }
    }

    // Method to update an existing grade
    void updateGrade(int rollno, char grade){
        Node temp = head;
        if(head == null) System.out.println("No Student");
        else{
            while(temp != null){
                if(temp.rollNo == rollno){
                    temp.grade = grade;
                    System.out.println("Grade Updated!");
                    return;
                }
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        StudentRecord sr = new StudentRecord();
        
        sr.insertAtBeginning(2, "Nikhil", 22, 'A');
        sr.insertAtEnd(1, "Aman", 23, 'O');
        sr.displayStudents();

        sr.searchStudent(2);

        sr.updateGrade(2, 'O');
        sr.searchStudent(2);

    }
}