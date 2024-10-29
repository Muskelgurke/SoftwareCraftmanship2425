import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCasesCalculator {

    @Test
    void firstTest() {
        var c = new Calculator();
        assertEquals(3,c.add(1,2));
    }
}
