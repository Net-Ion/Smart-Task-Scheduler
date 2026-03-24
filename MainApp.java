package taskscheduler;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== TASK SCHEDULER =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter priority (1=High, 2=Medium, 3=Low): ");
                    int priority = scanner.nextInt();

                    taskQueue.add(new Task(title, priority));
                    System.out.println("Task added!");
                    break;

                case 2:
                    if (taskQueue.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nTasks (by priority):");
                        for (Task t : taskQueue) {
                            System.out.println(t);
                        }
                    }
                    break;

                case 3:
                    if (taskQueue.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        Task removed = taskQueue.poll();
                        System.out.println("Removed: " + removed);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}