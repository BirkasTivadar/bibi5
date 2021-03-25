package inheritancemethods.products;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void constructorTest3Parameters() {
        //Given
        double unit = 0.235;
        Product product = new Product("Ipad", unit, 3);
        //Then
        assertEquals("Ipad", product.getName());
        assertEquals(unit, product.getUnitWeight());
        assertEquals(3, product.getNumberOfDecimals());
    }

    @Test
    void constructorTest2Parameters() {
        //Given
        double unit = 0.235;
        Product product = new Product("Ipad", unit);
        //Then
        assertEquals("Ipad", product.getName());
        assertEquals(unit, product.getUnitWeight());
        assertEquals(2, product.getNumberOfDecimals());
    }

    @Test
    void totalWeight() {
        //Given
        double unit = 0.235;
        Product product = new Product("Ipad", unit, 3);
        double total = 0.705;
        //Then
        assertEquals(total, product.totalWeight(3));
    }

}