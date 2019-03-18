import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class MyGeneratorTest {

    private static Collection<Object[]> provideIntegersForMyGenerator() {
        return Arrays.asList(new Object[][]{
                {1, "I"},
                {2, "II"},
                {3, "III"},
                {4, "IV"},
                {5, "V"},
                {6, "VI"},
                {7, "VII"},
                {8, "VIII"},
                {9, "IX"},
                {10, "X"}
        });
    }

    @ParameterizedTest
    @MethodSource("provideIntegersForMyGenerator")
    public void testGeneratorReturnsCorrectNumeral(int input, String expected) {

        String result = new MyGenerator().generate(input);
        assertEquals(expected, result);
    }
}