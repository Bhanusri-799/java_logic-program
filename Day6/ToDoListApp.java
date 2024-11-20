//Scenario: A to-do list application performs tasks for a user.  Tasks can be added at the end or beginning of the list.  Users can complete and remove tasks from either side of the list.
import java.util.LinkedList;

public class ToDoListApp {

    private LinkedList<String> tasks = new LinkedList<>();
    public void addTaskAtBeginning(String task) {
        tasks.addFirst(task);
        System.out.println("Task added at the beginning: " + task);
    }
    public void addTaskAtEnd(String task) {
        tasks.addLast(task);
        System.out.println("Task added at the end: " + task);
    }
    public void displayTasks() {
        System.out.println("Current To-Do List:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
    public void removeTaskFromFront() {
        if (!tasks.isEmpty()) {
            String completedTask = tasks.removeFirst();
            System.out.println("Completed and removed task from front: " + completedTask);
        } else {
            System.out.println("No tasks to complete.");
        }
    }
    public void removeTaskFromEnd() {
        if (!tasks.isEmpty()) {
            String completedTask = tasks.removeLast();
            System.out.println("Completed and removed task from end: " + completedTask);
        } else {
            System.out.println("No tasks to complete.");
        }
    }
    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            String oldTask = tasks.set(index, newTask);
            System.out.println("Updated task at index " + index + ": " + oldTask + " to " + newTask);
        } else {
            System.out.println("Invalid task index.");
        }
    }
    
    public static void main(String[] args) {
        ToDoListApp app = new ToDoListApp();
        app.addTaskAtEnd("Buy groceries");
        app.addTaskAtBeginning("Morning exercise");
        app.addTaskAtEnd("Complete Java assignment");
        app.addTaskAtBeginning("Check emails");
        app.displayTasks();
        app.removeTaskFromFront();
        app.removeTaskFromEnd();
        app.updateTask(1, "Complete project report");
        app.displayTasks();
    }
}
