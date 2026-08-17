import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    int id;
    String name;
    String priority;
    int duration;
    boolean completed;

    Task(int id, String name, String priority, int duration) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.duration = duration;
        this.completed = false;
    }

    void displayTask() {
        System.out.println("----------------------------------");
        System.out.println("Task ID   : " + id);
        System.out.println("Task Name : " + name);
        System.out.println("Priority  : " + priority);
        System.out.println("Duration  : " + duration + " minutes");
        System.out.println("Status    : " +
                (completed ? "Completed" : "Pending"));
    }
}

public class TimeManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Task> tasks = new ArrayList<>();

    
    static void addTask() {

        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Priority (High/Medium/Low): ");
        String priority = sc.nextLine();

        System.out.print("Enter Duration (minutes): ");
        int duration = sc.nextInt();

        tasks.add(new Task(id, name, priority, duration));

        System.out.println("\nTask added successfully!");
    }

    static void viewTasks() {

        if (tasks.isEmpty()) {
            System.out.println("\nNo tasks available.");
            return;
        }

        System.out.println("\n========== ALL TASKS ==========");

        for (Task task : tasks) {
            task.displayTask();
        }
    }

    static void completeTask() {

        System.out.print("Enter Task ID to complete: ");
        int id = sc.nextInt();

        for (Task task : tasks) {

            if (task.id == id) {
                task.completed = true;
                System.out.println("Task marked as completed!");
                return;
            }
        }

        System.out.println("Task not found!");
    }

    static void deleteTask() {

        System.out.print("Enter Task ID to delete: ");
        int id = sc.nextInt();

        for (Task task : tasks) {

            if (task.id == id) {
                tasks.remove(task);
                System.out.println("Task deleted successfully!");
                return;
            }
        }

        System.out.println("Task not found!");
    }

    
    static void pendingTasks() {

        boolean found = false;

        System.out.println("\n========== PENDING TASKS ==========");

        for (Task task : tasks) {

            if (!task.completed) {
                task.displayTask();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No pending tasks!");
        }
    }
    static void totalTime() {

        int total = 0;

        for (Task task : tasks) {
            if (!task.completed) {
                total += task.duration;
            }
        }

        int hours = total / 60;
        int minutes = total % 60;

        System.out.println("\nTotal Pending Time: "
                + hours + " hours "
                + minutes + " minutes");
    }
    static void currentDateTime() {

        System.out.println("\nCurrent Date : " + LocalDate.now());
        System.out.println("Current Time : " + LocalTime.now());
    }

    static void displayMenu() {

        System.out.println("\n======================================");
        System.out.println("       TIME MANAGEMENT SYSTEM");
        System.out.println("======================================");

        System.out.println("1. Add Task");
        System.out.println("2. View All Tasks");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. View Pending Tasks");
        System.out.println("6. Calculate Total Pending Time");
        System.out.println("7. Show Current Date & Time");
        System.out.println("8. Exit");

        System.out.println("======================================");
    }

    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("     WELCOME TO TIME MANAGER");
        System.out.println("**************************************");

        while (true) {

            displayMenu();

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addTask();
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    completeTask();
                    break;

                case 4:
                    deleteTask();
                    break;

                case 5:
                    pendingTasks();
                    break;

                case 6:
                    totalTime();
                    break;

                case 7:
                    currentDateTime();
                    break;

                case 8:
                    System.out.println("\nThank you for using Time Manager!");
                    System.out.println("Stay productive! 🚀");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}