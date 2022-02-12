package study;

import org.assertj.core.internal.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] test = "1,2".split(",");
        assertThat(test).contains("1", "2");
    }

    @Test
    void split2() {
        String[] test = "1".split(",");
        assertThat(test).containsExactly("1");
    }

    @Test
    void substring() {
        String input = "(1,2)";
        String output = input.substring(1, 4);
        assertThat(output).isEqualTo("1,2");
    }

    @Test
    void charAt() {
        String input = "abc";
        System.out.println(input.charAt(1));
    }

    @Test
    @DisplayName("test String index exception")
    void testException() {
        String input = "abc";
        try {
            input.charAt(3);
        } catch (IndexOutOfBoundsException e) {
        }
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
                    throw new IndexOutOfBoundsException("%s");
                })
                .withMessageMatching("Index: \\d+, Size:  \\d+");
    }
}
