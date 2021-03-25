package inheritancemethods.products;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackedProductTest {
    @Test
    void constructorTest() {
        //Given
        double unit = 0.235;
        double box = 1.25;
        PackedProduct product = new PackedProduct("Ipad", unit, 3, 12, box);
        //Then
        assertEquals("Ipad", product.getName());
        assertEquals(unit, product.getUnitWeight());
        assertEquals(3, product.getNumberOfDecimals());
        assertEquals(12, product.getPackingUnit());
        assertEquals(box, product.getWeightOfBox());
    }

    @Test
    void totalWeight() {
        //Given
        double unit = 0.235;
        double box = 1.25;
        PackedProduct product = new PackedProduct("Ipad", unit, 3, 12, box);
        double total = 6.025;
        //Then
        assertEquals(total, product.totalWeight(15));
    }

}