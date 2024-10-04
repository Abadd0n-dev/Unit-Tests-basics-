import org.junit.jupiter.api.Test;
import seminars.third.hw.IntervalChecker;
import static org.junit.jupiter.api.Assertions.*;

public class IntervalCheckerTest {
    IntervalChecker checker = new IntervalChecker();

    @Test
    public void testNumberInInterval() {
        assertTrue(checker.numberInInterval(50));
        assertTrue(checker.numberInInterval(26));
        assertTrue(checker.numberInInterval(99));
    }

    @Test
    public void testNumberBelowInterval() {
        assertFalse(checker.numberInInterval(25));
        assertFalse(checker.numberInInterval(0));
        assertFalse(checker.numberInInterval(20));
    }

    @Test
    public void testNumberAboveInterval() {
        assertFalse(checker.numberInInterval(100));
        assertFalse(checker.numberInInterval(101));
        assertFalse(checker.numberInInterval(200));
    }
}
