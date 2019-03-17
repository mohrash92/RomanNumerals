import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {

    @Test
    public void test_generator_exists() {
        Generator test = new Generator();
        String result = test.generate(1);

        assertEquals("hey",result);
    }
}