package Algorithms.Exercise01;
public class InventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product p1 = new Product("P101", "Laptop", 10, 999.99);
        Product p2 = new Product("P102", "Smartphone", 25, 499.99);
        Product p3 = new Product("P103", "Headphones", 50, 79.99);
        System.out.println("Testing Add Operations");
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.displayProducts();
        System.out.println("Testing Update Operations");
        inventory.updateProduct("P102", 20, 449.99); 
        inventory.displayProducts();
        System.out.println("Testing Delete Operations");
        inventory.deleteProduct("P103"); 
        inventory.displayProducts();
    }
}
