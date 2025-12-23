
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddNormalCase() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testAddWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(5, 0));
    }

    @Test
    void testDivideNormalCase() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    void testDivideByZeroException() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
    }
}
