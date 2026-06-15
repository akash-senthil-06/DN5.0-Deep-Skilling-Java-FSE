package Algorithms.Exercise03;
public class SortTest {
    public static void main(String[] args) {
        Order[] ordersBubble = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 120.00),
            new Order("O003", "Charlie", 450.00),
            new Order("O004", "Diana", 80.25),
            new Order("O005", "Ethan", 300.00)
        };
        Order[] ordersQuick = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 120.00),
            new Order("O003", "Charlie", 450.00),
            new Order("O004", "Diana", 80.25),
            new Order("O005", "Ethan", 300.00)
        };
        System.out.println("Bubble Sort");
        SortingAlgorithms.bubbleSort(ordersBubble);
        for (Order o : ordersBubble) {
            System.out.println(o);
        System.out.println("Quick Sort");
        SortingAlgorithms.quickSort(ordersQuick, 0, ordersQuick.length - 1);
        for (Order o : ordersQuick) {
            System.out.println(o);
        }
    }
}
