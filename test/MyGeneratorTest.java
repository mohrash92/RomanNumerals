import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class MyGeneratorTest {

    private static Collection<Object[]> provideIntegersForMyGenerator() {
        return Arrays.asList(new Object[][]{

            {2, "II"},
            {3, "III"},
            {6, "VI"},
            {7, "VII"},
            {8, "VIII"},
            {11, "XI"},
            {12, "XII"},
            {13, "XIII"},
            {14, "XIV"},
            {15, "XV"},
            {16, "XVI"},
            {17, "XVII"},
            {18, "XVIII"},
            {19, "XIX"},
            {20, "XX"},

            // Mapped Values
            {1, "I"},
            {4, "IV"},
            {5, "V"},
            {9, "IX"},
            {10, "X"},
            {40, "XL"},
            {50, "L"},
            {90, "XC"},
            {100, "C"},
            {400, "CD"},
            {500, "D"},
            {900, "CM"},
            {1000, "M"},
            {2000, "MM"}
        });
    }

    @ParameterizedTest
    @MethodSource("provideIntegersForMyGenerator")
    public void testGeneratorReturnsCorrectNumeral(int input, String expected) {
        String result = new MyGenerator().generate(input);
        assertEquals(expected, result);
    }

    @Test
    public void testGeneratorReturnsNullWhenBelow1() {
        String result = new MyGenerator().generate(0);
        assertEquals(null, result);
    }

    @Test
    public void testGeneratorReturnsNullWhenAbove3999() {
        String result = new MyGenerator().generate(4000);
        assertEquals(null, result);
    }
}