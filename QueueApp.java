// app/QueueApp.java
package app;

import model.Task;
import service.TaskQueueService;
import java.util.Scanner;

public class QueueApp {
    public static void main(String[] args) {
        TaskQueueService taskQueueService = new TaskQueueService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Queue Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Task Description: ");
                    String description = scanner.nextLine();
                    Task task = new Task(id, description);
                    taskQueueService.enqueue(task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.println("Tasks in Queue:");
                    taskQueueService.listTasks().forEach(System.out::println);
                    break;
                case 3:
                    Task removedTask = taskQueueService.dequeue();
                    if (removedTask != null) {
                        System.out.println("Removed Task: " + removedTask);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
