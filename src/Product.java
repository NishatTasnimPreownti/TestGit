public class Product {
    String name;
    int stockQuantity;
    double unitPrice;

    public Product(String name, int stockQuantity, double unitPrice) {
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
    }

    public double calculateTotalPrice() {
        return 0;
    }

    public String getName() {
        return name;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    
    public int comparableTo(Product p) {
        double thisPrice = this.calculateTotalPrice();
        double otherPrice = p.calculateTotalPrice();
        if (Double.compare(thisPrice, otherPrice) != 0) {
            return Double.compare(thisPrice, otherPrice);
        } else if (!this.name.equals(p.name)) {
            return this.name.compareTo(p.name);
        } else {
            return Integer.compare(this.stockQuantity, p.stockQuantity);
        }
    }
    
}
