import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ask how many students we want to add

        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents - 1];

        //create n number of students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].viewBalance();
            students[n].payTuition();




        }

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].toString());
        }




    }
}
