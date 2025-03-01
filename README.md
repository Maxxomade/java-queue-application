The application provides a menu-driven interface with the following options:

1.  Add Task:
    -   Prompts for the task ID and description.
    -   Adds the task to the queue.

2.  List Tasks:
    -   Displays all tasks currently in the queue.

3.  Remove Task:
    -   Removes the task at the front of the queue and displays it.
    -   If the queue is empty, it displays a message.

4.  Exit:
    -   Exits the application.

Project Structure

-   `model`: Contains the `Task` data model.
-   `service`: Contains the `TaskQueueService` for managing the task queue.
-   `app`: Contains the `QueueApp` with the main application logic.



How to Compile and Run

1.  **Using an IDE (IntelliJ IDEA, Eclipse):**
    -   Import the project into your IDE.
    -   Navigate to the `app.QueueApp` class.
    -   Run the `main` method.

2.  **Using the Command Line:**
    -   Navigate to the project's root directory.
    -   Compile the Java files: `javac app/QueueApp.java model/Task.java service/TaskQueueService.java`
    -   Run the application: `java app.QueueApp`

 
 2
 Design Choices

-   **Data Model:** The `Task` class is a simple POJO (Plain Old Java Object) to represent a task with an ID and description.
-   **Queue Service:** The `TaskQueueService` uses a `LinkedList` as an in-memory queue. This allows for efficient FIFO (First-In-First-Out) operations.
-   **Command-Line Interface:** The `QueueApp` class provides a basic menu-driven interface for user interaction.
-   **Packages:** The project is organized into `model`, `service`, and `app` packages to separate concerns and improve maintainability.
-   **Scanner:** The java.util.Scanner class is used to gather user input.
