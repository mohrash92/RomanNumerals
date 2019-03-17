import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyGeneratorTest {

    @Test
    public void testGeneratorReturnsCorrectNumeralFor1() {

        MyGenerator test = new MyGenerator();
        String result = test.generate(1);

        assertEquals("I",result);
    }

    @Test
    public void testGeneratorReturnsCorrectNumeralFor2() {
        MyGenerator test = new MyGenerator();
        String result = test.generate(2);

        assertEquals("II",result);
    }
}