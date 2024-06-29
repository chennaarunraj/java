import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void displayProducts() {
        System.out.println("Products in inventory:");
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Quantity: " + product.getQuantity());
        }
    }

    public void updateProductQuantity(int productId, int newQuantity) {
        for (Product product : products) {
            if (product.getId() == productId) {
                product.setQuantity(newQuantity);
                System.out.println("Quantity updated for product: " + product.getName());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void deleteProduct(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                products.remove(product);
                System.out.println("Product deleted: " + product.getName());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public static void main(String[] args) {
        Inventory inventorySystem = new Inventory();
        Product product1 = new Product(1, "Chair", 10);
        Product product2 = new Product(2, "Table", 5);
        Product product3 = new Product(3, "Bed", 20);

        inventorySystem.addProduct(product1);
        inventorySystem.addProduct(product2);
        inventorySystem.addProduct(product3);
        inventorySystem.displayProducts();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product ID to update quantity: ");
        int productId = scanner.nextInt();
        System.out.println("Enter the new quantity: ");
        int newQuantity = scanner.nextInt();

        inventorySystem.updateProductQuantity(productId, newQuantity);
        inventorySystem.displayProducts();

        System.out.println("Enter the product ID to delete: ");
        int deleteProductId = scanner.nextInt();
        inventorySystem.deleteProduct(deleteProductId);
        inventorySystem.displayProducts();

        scanner.close();
    }
}

