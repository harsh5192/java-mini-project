import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;
    double total, percentage;
    String grade;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks in Subject 1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        marks2 = sc.nextInt();
        System.out.print("Enter Marks in Subject 3: ");
        marks3 = sc.nextInt();
    }

    void calculateResult() {
        total = marks1 + marks2 + marks3;
        percentage = total / 3.0;

        if (percentage >= 75)
            grade = "A";
        else if (percentage >= 60)
            grade = "B";
        else if (percentage >= 45)
            grade = "C";
        else if (percentage >= 33)
            grade = "D";
        else
            grade = "Fail";
    }

    void displayResult() {
        System.out.println("\n----- Student Result -----");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------");
    }
}

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].inputDetails();
            students[i].calculateResult();
        }

        
        System.out.println("\n====== All Student Results ======");
        for (int i = 0; i < n; i++) {
            students[i].displayResult();
        }

        System.out.println("Program Ended Successfully!");
    }
}
