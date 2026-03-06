package Inventory;

/**
 *
 * @author kadhim
 */
public class Product {
    private String name;
    private String productId;
    private double price;
    private int stock;
    private String category;

    public Product() {
        name = "Unknown";
        productId = "000";
        price = 0;
        stock = 0;
        category = "General";
    }

    public Product(String name, String productId, double price, int stock, String category) {
        this.name = name;
        this.productId = productId;
        setPrice(price);
        setStock(stock);
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Harga tidak valid");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock tidak valid");
        }
    }

    public void setCategory(String category) {
        if (!category.isEmpty()) {
            this.category = category;
        }
    }

    public void addStock(int amount) {
        if (amount > 0) {
            stock += amount;
        }
    }

    public void reduceStock(int amount) {
        if (amount > 0 && amount <= stock) {
            stock -= amount;
        } else {
            System.out.println("Stock tidak cukup!");
        }
    }

    public void displayProduct() {
        System.out.println("ID: " + productId);
        System.out.println("Nama: " + name);
        System.out.println("Kategori: " + category);
        System.out.printf("Harga: Rp. %.0f\n", price);
        System.out.println("Stock: " + stock);
    }

}
