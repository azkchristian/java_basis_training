package fr.lernejo;

import fr.lernejo.Sample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testOpAddition() {
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.ADD, 3, 4);
        assertEquals(7, result, "Addition operation failed");
    }

    @Test
    void testOpMultiplication() {
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.MULT, 3, 4);
        assertEquals(12, result, "Multiplication operation failed");
    }

    @Test
    void testFactPositiveNumber() {
        Sample sample = new Sample();
        int result = sample.fact(5);
        assertEquals(120, result, "Factorial calculation for positive number failed");
    }

    @Test
    void testFactZero() {
        Sample sample = new Sample();
        int result = sample.fact(0);
        assertEquals(1, result, "Factorial calculation for zero failed");
    }

    @Test
    void testFactNegativeNumber() {
        Sample sample = new Sample();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sample.fact(-1);
        });
        assertEquals("N should be positive", exception.getMessage(), "Exception message for negative number failed");
    }
}
