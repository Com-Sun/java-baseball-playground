import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sum() {
        assertEquals(300, calculator.plus(100, 200));
    }

    @Test
    void minus() {
        assertEquals(100, calculator.minus(200, 100));
        assertEquals(1, calculator.minus(2,1));
    }

    @Test
    void multi() {
        assertEquals(6, calculator.multiple(2,3));
    }

    @Test
    void divide() {
        assertEquals(5, calculator.divide(10,2));
    }
}