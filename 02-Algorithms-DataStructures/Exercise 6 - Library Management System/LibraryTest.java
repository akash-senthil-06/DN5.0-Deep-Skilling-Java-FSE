package Algorithms.Exercise06;
import java.util.Arrays;
public class LibraryTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
            new Book("B003", "1984", "George Orwell"),
            new Book("B004", "Moby Dick", "Herman Melville"),
            new Book("B005", "Pride and Prejudice", "Jane Austen")
        };
        System.out.println("Linear Search Test");
        Book b1 = Library.linearSearchByTitle(books, "1984");
        System.out.println("Found: " + b1);
        System.out.println("Binary Search Test");
        Arrays.sort(books); 
        System.out.println("Sorted Library Catalog:");
        for (Book b : books) {
            System.out.println(b);
        }
        Book b2 = Library.binarySearchByTitle(books, "Moby Dick");
        System.out.println("\nFound Moby Dick: " + b2);
        Book b3 = Library.binarySearchByTitle(books, "The Hobbit");
        System.out.println("Found The Hobbit: " + b3);
    }
}
