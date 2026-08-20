import java.util.*;

class IPerson {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    IPerson(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}

class IStudent extends IPerson{
    private int[] testScores;

    IStudent(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    int sum = 0;
    char calculate(){
        for(int i : testScores){
            sum+=i;
        }
        int score = sum/testScores.length;
        if(score>=90) return 'O';
        else if(score>=80) return 'E';
        else if(score>=70) return 'A';
        else if(score>=55) return 'P';
        else if(score>=40) return 'D';
        else return 'T';
    }
}

public class JavaInheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        IStudent s = new IStudent(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}