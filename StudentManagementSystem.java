import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String department;
    double marks;

    Student(int rollNo, String name, String department, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("--------------------------------");
        System.out.println("Roll No     : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + getGrade());
    }

    String getGrade() {
        if (marks >= 90)
            return "A+";
        else if (marks >= 80)
            return "A";
        else if (marks >= 70)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(rollNo, name, department, marks));

        System.out.println("\nStudent added successfully!");
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("\nNo student records found.");
            return;
        }

        System.out.println("\n===== STUDENT DETAILS =====");

        for (Student s : students) {
            s.displayStudent();
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        int rollNo = sc.nextInt();

        for (Student s : students) {
            if (s.rollNo == rollNo) {
                System.out.println("\nStudent found!");
                s.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void updateStudent() {
        System.out.print("Enter Roll Number to update: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.rollNo == rollNo) {

                System.out.print("Enter New Name: ");
                s.name = sc.nextLine();

                System.out.print("Enter New Department: ");
                s.department = sc.nextLine();

                System.out.print("Enter New Marks: ");
                s.marks = sc.nextDouble();

                System.out.println("\nStudent updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter Roll Number to delete: ");
        int rollNo = sc.nextInt();

        for (Student s : students) {
            if (s.rollNo == rollNo) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}