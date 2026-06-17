package Algorithms.Exercise05;
public class TaskLinkedList {
    private Node head;
    private static class Node {
        Task task;
        Node next;
        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Added Task: " + task.getTaskName());
    }
    public Task searchTask(String taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId().equalsIgnoreCase(taskId)) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }
    public void traverseTasks() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        System.out.println("Tasks List:");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }
    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("Error: Task list is empty.");
            return;
        }
        if (head.task.getTaskId().equalsIgnoreCase(taskId)) {
            head = head.next;
            System.out.println("Deleted Task ID: " + taskId);
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.task.getTaskId().equalsIgnoreCase(taskId)) {
                prev.next = curr.next;
                System.out.println("Deleted Task ID: " + taskId);
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Error: Task ID " + taskId + " not found.");
    }
}
