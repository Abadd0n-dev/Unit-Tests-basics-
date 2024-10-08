package averageComporation.test.java.avaragecomporation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageComporationTest extends AverageComporation {

    private AverageComporation comp;
    private List<Integer> list1;
    private List<Integer> list2;

    @BeforeEach
    public void preSet() {
        comp = new AverageComporation();
        list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list2 = Arrays.asList(1, 2, 3);
    }

    @AfterEach
    public void freeMem() {
        comp = null;
        list1 = null;
        list2 = null;
    }
    @Test
    void testCalculateAverageWithEmptyList() {
        assertThrows(IllegalArgumentException.class, ()->comp.calculateAverage(null));
    }

    @Test
    void testCalculateAveragetyList() {
        double result = comp.calculateAverage(list1);
        assertEquals(5.5, result);
    }

    @Test
    public void testCompareListsFirstGrande() {
        String result = comp.compareLists(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareListsSecondGrande() {
        String result = comp.compareLists(list2, list1);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareListsEquals() {
        String result = comp.compareLists(list1, list1);
        assertEquals("Средние значения равны", result);
    }
}