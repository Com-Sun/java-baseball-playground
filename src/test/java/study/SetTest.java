package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void size() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    void contains() {
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  ", " "})
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String boom) {
        assertTrue(Strings.isBlank(boom));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1","2","3"})
    void test(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
    void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
        String actualValue = input.toLowerCase();
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3:1,2,3" , "4,5,6:1,2,3"}, delimiter = ':')
    void hasNum(String input, String output) {
        int[] intArr = new int[3];
        for (int i = 0; i < 3; i++) {
            intArr[i] = input.charAt(i) - '0';
        }

        int[] intArr2 = new int[3];
        for (int i = 0; i < 3; i++) {
            intArr2[i] = output.charAt(i) - '0';
        }
        assertThat(numbers.contains(intArr)).isEqualTo(intArr2);
    }

}

