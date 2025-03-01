// service/TaskQueueService.java
package service;

import model.Task;
import java.util.LinkedList;
import java.util.Queue;

public class TaskQueueService {
    private Queue<Task> taskQueue = new LinkedList<>();

    public void enqueue(Task task) {
        taskQueue.add(task);
    }

    public Queue<Task> listTasks() {
        return taskQueue;
    }

    public Task dequeue() {
        return taskQueue.poll();
    }
}
