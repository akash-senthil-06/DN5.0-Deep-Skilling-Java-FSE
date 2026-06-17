package Algorithms.Exercise05;
public class TaskTest {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        taskList.addTask(new Task("T001", "Design Database", "Completed"));
        taskList.addTask(new Task("T002", "Develop API", "In Progress"));
        taskList.addTask(new Task("T003", "Write Unit Tests", "Pending"));
        taskList.traverseTasks();
        System.out.println("Searching for Task T002:");
        Task task = taskList.searchTask("T002");
        System.out.println(task);
        taskList.deleteTask("T002");
        taskList.traverseTasks();
    }
}
