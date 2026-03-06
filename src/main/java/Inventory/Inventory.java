package Inventory;
import java.util.ArrayList;

/**
 *
 * @author kadhim
 */
public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showProducts() {
        for (Product p : products) {
            p.displayProduct();
            System.out.println("-----------------");
        }
    }

    public Product findProduct(String id) {
        for (Product p : products) {
            if (p.getProductId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
