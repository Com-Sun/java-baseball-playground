import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void Calculator() {
        // given
        Calculator calculator = new Calculator();

        // when
        int sum = calculator.plus(100, 200);


        // then
        assertThat(sum).isEqualTo(300);
    }
}