import seminars.third.hw.MainHW;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOddNumberTest {
    @org.testng.annotations.Test
    public void testEvenNumber() {
        org.testng.Assert.assertTrue(MainHW.evenOddNumber(6));
    }

    @org.testng.annotations.Test
    public void testOddNumber() {
        org.testng.Assert.assertFalse(MainHW.evenOddNumber(3));
    }

    @org.testng.annotations.Test
    public void testNumberInRange() {
        assertTrue(MainHW.numberInInterval(50));
        assertTrue(MainHW.numberInInterval(75));
    }

    @org.testng.annotations.Test
    public void testNumberNotInRange() {
        assertFalse(MainHW.numberInInterval(10));
        assertFalse(MainHW.numberInInterval(200));
    }
}
