import seminars.third.hw.MainHW;

public class EvenOddNumberTest {
    @org.testng.annotations.Test
    public void testEvenNumber() {
        org.testng.Assert.assertTrue(MainHW.evenOddNumber(6));
    }

    @org.testng.annotations.Test
    public void testOddNumber() {
        org.testng.Assert.assertFalse(MainHW.evenOddNumber(3));
    }
}
