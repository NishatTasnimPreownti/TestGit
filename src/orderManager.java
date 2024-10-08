import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class orderManager{



    public Product[] sortProducts(Product[] products) {
        Arrays.sort(products);
        return products;
    }

    public void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println("Product Name: " + product.getName()+
                    ", Stock Quality: " + product.getStockQuantity()+
                    ", Unit Price: " + product.calculateTotalPrice());
        }
    }
    public int comparableTo(Product p) {
        double pPrice = p.calculateTotalPrice();
        double otherPrice = p.calculateTotalPrice();
        if (Double.compare(pPrice, otherPrice) != 0) {
            return Double.compare(pPrice, otherPrice);
        } else if (p.name.equals(p.name)) {
            return p.name.compareTo(p.name);
        } else {
            return Integer.compare(p.stockQuantity, p.stockQuantity);
        }
    }




}
