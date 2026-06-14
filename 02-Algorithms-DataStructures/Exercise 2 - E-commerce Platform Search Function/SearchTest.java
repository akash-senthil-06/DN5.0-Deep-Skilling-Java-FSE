package Algorithms.Exercise02;
import java.util.Arrays;
public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Desk Chair", "Furniture"),
            new Product("P004", "Coffee Mug", "Kitchenware"),
            new Product("P005", "Backpack", "Accessories")
        };
        System.out.println("Linear Search Test");
        Product res1 = SearchAlgorithms.linearSearch(products, "Desk Chair");
        System.out.println("Found: " + res1);
        System.out.println("Binary Search Test");
        Arrays.sort(products); 
        System.out.println("Sorted Products:");
        for (Product p : products) {
            System.out.println(p);
        }
        Product res2 = SearchAlgorithms.binarySearch(products, "Laptop");
        System.out.println("\nFound Laptop: " + res2);
        Product res3 = SearchAlgorithms.binarySearch(products, "Tablet");
        System.out.println("Found Tablet: " + res3);
    }
}
