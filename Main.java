import java.util.Scanner;

// Define the Exam interface
interface Exam {
    double Percent_cal(double marks[]);
}

// Implement the Exam interface in the Result class
class Result implements Exam {
    public double Percent_cal(double marks[]) {
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return (total / marks.length);
    }

    public void display(double percentage) {
        System.out.println("Percentage: " + percentage + "%");
    }
}

// Extend the Result class to create the Student class
class Student extends Result {
    String name;
    int rollNo;
    double marks[];

    public Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        super.display(super.Percent_cal(marks));
    }
}

// Test the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for student information
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student roll no: ");
        int rollNo = scanner.nextInt();

        // Ask for marks in three subjects
        double[] marks = new double[3];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i+1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        // Create a new Student object with the input data
        Student student = new Student(name, rollNo, marks);

        // Print out the student's information and percentage
        student.printInfo();
    }
}
