


import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOddNumberTest {
    @Test
    public void testEvenNumber() {
        assertTrue(EvenOddNumber.evenOddNumber(6));
    }

    @Test
    public void testOddNumber() {
        assertFalse(EvenOddNumber.evenOddNumber(3));
    }
}
