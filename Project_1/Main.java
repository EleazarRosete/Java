import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstname, lastname, course, section, year, gender;
        int midtermGrade, finalGrade;

        System.out.print("What is your first name? ");
        firstname = input.nextLine();
        System.out.print("What is your last name? ");
        lastname = input.nextLine();
        System.out.print("Are a Male or Female? ");
        gender = input.nextLine();
        System.out.print("And what year level are you currently enrolled? ");
        year = input.nextLine();
        System.out.print("On what course you're enrolled? ");
        course = input.nextLine();
        System.out.print("What is your section or block in this course? ");
        section = input.nextLine();
        System.out.print("What is your average midterm grade? ");
        midtermGrade = input.nextInt();
        input.nextLine();
        System.out.print("What is your average finals grade? ");
        finalGrade = input.nextInt();
        input.nextLine();

        Student student = new Student(firstname, lastname,gender, year, course, section, midtermGrade,finalGrade);
        student.introduceSelf();
        student.evaluateGrade();
    }
}