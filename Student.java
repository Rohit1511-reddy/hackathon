import java.util.Scanner;

class Student {
    String studentName;
    String rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    public Student(String studentName, String rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public double calculateFee() {
        return courseCredits * 1500;
    }

    public boolean checkEligibility() {
        return marks >= 50;
    }

    public double calculateScholarship() {
        double totalFee = calculateFee();
        if (marks >= 85) {
            return totalFee * 0.20;
        } else if (marks >= 70 && marks <= 84) {
            return totalFee * 0.10;
        } else {
            return 0.0;
        }
    }

    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Eligibility: Eligible");
        System.out.println("Total Fee: Rs. " + calculateFee());
        System.out.println("Scholarship: Rs. " + calculateScholarship());
        System.out.println("Final Fee: Rs. " + calculateFinalFee());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String rollNumber = sc.nextLine();
        double marks = sc.nextDouble();
        sc.nextLine();
        String courseName = sc.nextLine();
        int courseCredits = sc.nextInt();

        Student student = new Student(name, rollNumber, marks, courseName, courseCredits);

        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("Student " + name + " (Roll No: " + rollNumber + ") is NOT eligible for course registration.");
        }

        sc.close();
    }
}