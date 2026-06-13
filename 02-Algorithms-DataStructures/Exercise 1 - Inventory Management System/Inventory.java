package Algorithms.Exercise01;
import java.util.HashMap;
import java.util.Map;
public class Inventory {
    private Map<String, Product> products;
    public Inventory() {
        this.products = new HashMap<>();
    }
    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Added: " + product.getProductName());
        }
    }
    public void updateProduct(String productId, int newQuantity, double newPrice) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Updated ID " + productId + " successfully.");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }
    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            Product removed = products.remove(productId);
            System.out.println("Deleted: " + removed.getProductName());
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }
}
