package inheritanceconstructor.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {
    @Test
    void incorrectParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Jeep(10.0, 60.0, 50.0, 40.0, 20.0));
        assertEquals("Tank capacity is less than fuel!", ex.getMessage());
    }

    @Test
    void testCalculateRefillAmount() {
        //Given
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);
        //Then
        assertEquals(40.0, jeep.calculateRefillAmount());
    }

    @Test
    void testDrive() {
        //Given
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);
        //When
        jeep.drive(300);
        //Then
        assertEquals(0.0, jeep.getExtraFuel());
        assertEquals(20.0, jeep.getFuel());
    }

    @Test
    void notEnoughFuelShouldThrowException() throws RuntimeException {
        Jeep jeep = new Jeep(10.0, 30.0, 50.0, 40.0, 20.0);
        Exception ex = assertThrows(RuntimeException.class, () -> jeep.drive(600));
        assertEquals("Not enough fuel available!", ex.getMessage());
    }


}