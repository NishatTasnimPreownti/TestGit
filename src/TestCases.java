import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void testElectronicsTotalPrice() {
        Product computer = new Electronics("Computer", 10, 10000);
        assertEquals(11500.00, computer.calculateTotalPrice());
    }

    @Test
    public void testClothingTotalPrice() {
        Product shirt = new Clothing("Shirt", 15, 1000);
        assertEquals(1100.00, shirt.calculateTotalPrice());
    }

    @Test
    public void testFurnitureTotalPrice() {
        Product chair = new Furniture("Chair", 5, 500);
        assertEquals(540.00, chair.calculateTotalPrice());
    }

    @Test
    public void sortingByTotalPrice() {
        Product computer = new Electronics("Computer", 10, 10000);
        Product shirt = new Clothing("Shirt", 15, 1000);
        Product chair = new Furniture("Chair", 5, 500);

        Product[] products = new Product[] {computer, shirt, chair};
        orderManager manager = new orderManager();
        manager.sortProducts(products);
        assertEquals("Shirt", products[0].getName());
        assertEquals("Chair", products[1].getName());
        assertEquals("Computer", products[2].getName());
    }

    @Test
    public void sortingByNamePriceEqual() {
        Product shirt1 = new Electronics("Shirt", 20, 1100);
        Product shirt2 = new Electronics("Shirt", 30, 900);
        Product chair = new Furniture("Chair", 5, 700);

        Product[] products = new Product[] {shirt1, shirt2, chair};
        orderManager manager = new orderManager();
        manager.sortProducts(products);

        assertEquals("Shirt", products[0].getName());
        assertEquals("Shirt", products[1].getName());
        assertEquals(30, products[1].getStockQuantity());
    }



}
