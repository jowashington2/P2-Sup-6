import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class MainTest {

    @Test
    void testGenerateRandomList() {
        List<Integer> randomList = Main.generateRandomList(5);
        assertEquals(5, randomList.size());
        // Verify that integers are within the expected range
        for (int num : randomList) {
            assertTrue(num >= 0 && num < 100);
        }
    }

    @Test
    void testCountOccurrences() {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3);
        Map<Integer, Integer> occurrences = Main.countOccurrences(list);
        assertEquals(1, occurrences.get(1));
        assertEquals(2, occurrences.get(2));
        assertEquals(3, occurrences.get(3));
    }

    @Test
    void testSortListAscending() {
        List<Integer> list = Arrays.asList(3, 1, 2);
        List<Integer> sortedList = Main.sortListAscending(list);
        assertEquals(Arrays.asList(1, 2, 3), sortedList);
    }
}
